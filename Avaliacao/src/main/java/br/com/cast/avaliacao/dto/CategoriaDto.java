package br.com.cast.avaliacao.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import br.com.cast.avaliacao.model.Categoria;

public class CategoriaDto implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;
	
	@Column(nullable = false, length = 100)
	@NotEmpty(message = "Campo descrição não pode ser vazio, preencha-o !!!")
	@Length(min=3, max=100, message = "Deve ter entre 3 e 100 caracteres")
	private String descricao;

	public CategoriaDto() {
		super();
	}

	public CategoriaDto(Categoria obj) {
		super();
		this.id = obj.getId();
		this.descricao = obj.getDescricao();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
