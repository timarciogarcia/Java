package br.com.cast.avaliacao.controller;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.cast.avaliacao.dto.CursoDto;
import br.com.cast.avaliacao.model.Curso;
import br.com.cast.avaliacao.service.CursoService;

@RestController
@RequestMapping("/curso")
public class CursoController {

	@Autowired
	private CursoService cursoService;

	@GetMapping(value = "/{id}")
	public ResponseEntity<Curso> findByid(@PathVariable Integer id) {
		Curso obj = cursoService.findByid(id);
		return ResponseEntity.ok().body(obj);
	}

	@GetMapping
	public ResponseEntity<List<CursoDto>> findAll(
			@RequestParam(value = "categoria", defaultValue = "0") Integer id_cat) 
	{
		List<Curso> list = cursoService.findAll(id_cat);
		List<CursoDto> listdto = list.stream().map(obj -> new CursoDto(obj)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listdto);
	}

	@PutMapping(value = "/{id}")
	public ResponseEntity<CursoDto> update(@PathVariable Integer id, @Valid @RequestBody CursoDto objDto) {
		Curso newObj = cursoService.update(id, objDto);
		return ResponseEntity.ok().body(new CursoDto(newObj));
	}

	@PatchMapping(value = "/{id}")
	public ResponseEntity<CursoDto> updatePatch(@PathVariable Integer id, @Valid @RequestBody CursoDto objDto) {
		Curso newObj = cursoService.update(id, objDto);
		return ResponseEntity.ok().body(new CursoDto(newObj));
	}

	@PostMapping
	public ResponseEntity<Curso> create(@Valid @RequestParam(value = "categoria", defaultValue = "0") Integer id_cat,
			@RequestBody Curso obj) {
		obj = cursoService.create(id_cat, obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/curso/{id}").buildAndExpand(obj.getId())
				.toUri();
		return ResponseEntity.created(uri).build();
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Integer id) {
		cursoService.delete(id);
		return ResponseEntity.noContent().build();
	}

}
