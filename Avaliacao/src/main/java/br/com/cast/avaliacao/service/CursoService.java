package br.com.cast.avaliacao.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.cast.avaliacao.dto.CursoDto;
import br.com.cast.avaliacao.model.Categoria;
import br.com.cast.avaliacao.model.Curso;
import br.com.cast.avaliacao.repository.CursoRepository;
import br.com.cast.avaliacao.service.exception.DataIntegrityViolationException;
import br.com.cast.avaliacao.service.exception.ObjectNotFoundException;

@Service
public class CursoService {

	@Autowired
	private CursoRepository repository;

	@Autowired
	private CategoriaService categoriaService;

	public Curso findByid(Integer id) {
		Optional<Curso> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não Encontrado! id:" + id + " ,Tipo: " + Curso.class.getName()));
	}

	public List<Curso> findAll(Integer id_cat) {
		categoriaService.findByid(id_cat);
		return repository.findAllbyCategoria(id_cat);
	}
	
	public Curso update(Integer id, CursoDto objDto) {
		Curso obj = this.findByid(id);
		updateData(obj, objDto);
		return repository.save(obj);
	}

	private void updateData(Curso obj, CursoDto objDto) {
		obj.setDescricao(objDto.getDescricao());
		obj.setDtfim(objDto.getDtfim());
		obj.setDtinicio(objDto.getDtinicio());
		obj.setQtdealunos(objDto.getQtdealunos());		
	}

	public Curso create(Integer id_cat, Curso obj) {
		obj.setId(null);
		Categoria cat = categoriaService.findByid(id_cat);
		obj.setCategoria(cat);
		return repository.save(obj);
	}

	
	public void delete(Integer id) {
		findByid(id);
     	repository.deleteById(id);
	}

}
