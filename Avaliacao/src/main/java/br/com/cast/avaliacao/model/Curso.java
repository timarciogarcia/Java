package br.com.cast.avaliacao.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Curso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(nullable = false, length = 100)
	@NotEmpty(message = "Campo descrição não pode ser vazio, preencha-o !!!")
	@Length(min=3, max=100, message = "Deve ter entre 3 e 100 caracteres")	
	private String descricao;

	@Column(nullable = false)
	private Date dtinicio;

	@Column(nullable = false)
	private Date dtfim;

	@Column(nullable = false)
	private Integer qtdealunos;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "categoria_id")
	private Categoria categoria;

	public Curso() {
		super();
	}

	public Curso(Integer id, String descricao, Date dtinicio, Date dtfim, Integer qtdealunos, Categoria categoria) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.dtinicio = dtinicio;
		this.dtfim = dtfim;
		this.qtdealunos = qtdealunos;
		this.categoria = categoria;
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

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Curso other = (Curso) obj;
		return Objects.equals(id, other.id);
	}

}
