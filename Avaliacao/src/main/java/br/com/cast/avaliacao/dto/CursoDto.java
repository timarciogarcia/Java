package br.com.cast.avaliacao.dto;

import java.io.Serializable;
import java.util.Date;

import br.com.cast.avaliacao.model.Curso;

public class CursoDto implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String descricao;
	private Date dtinicio;
	private Date dtfim;
	private Integer qtdealunos;

	public CursoDto() {
		super();
	}

	public CursoDto(Curso obj) {
		super();
		this.id = obj.getId();
		this.descricao = obj.getDescricao();
		this.dtinicio = obj.getDtinicio();
		this.dtfim = obj.getDtfim();
		this.qtdealunos = obj.getQtdealunos();
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

	public Date getDtinicio() {
		return dtinicio;
	}

	public void setDtinicio(Date dtinicio) {
		this.dtinicio = dtinicio;
	}

	public Date getDtfim() {
		return dtfim;
	}

	public void setDtfim(Date dtfim) {
		this.dtfim = dtfim;
	}

	public Integer getQtdealunos() {
		return qtdealunos;
	}

	public void setQtdealunos(Integer qtdealunos) {
		this.qtdealunos = qtdealunos;
	}

}
