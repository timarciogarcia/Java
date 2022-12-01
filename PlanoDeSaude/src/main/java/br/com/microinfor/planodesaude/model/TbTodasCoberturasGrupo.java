package br.com.microinfor.planodesaude.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class TbTodasCoberturasGrupo {

	/**
	 * Grupo dos Itens de Cobertura incluido no Plano, para aumentos e 
	 * controle de agrupamento, por exemplo patologias, exames e afins 
	 */
	
	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, length = 50)
	private String descricao;

}
