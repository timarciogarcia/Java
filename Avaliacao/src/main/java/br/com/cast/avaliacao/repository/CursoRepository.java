package br.com.cast.avaliacao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.cast.avaliacao.model.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer> {

	@Query("SELECT obj FROM Curso obj WHERE obj.categoria.id = :id_cat ORDER BY descricao")
	List<Curso> findAllbyCategoria(@Param(value = "id_cat") Integer id_cat);

}
