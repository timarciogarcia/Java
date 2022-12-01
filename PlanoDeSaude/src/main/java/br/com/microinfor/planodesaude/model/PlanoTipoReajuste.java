package br.com.microinfor.planodesaude.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class PlanoTipoReajuste {

	/**
	 * Classe do tipo de reajuste, pode ser criado qualquer um para usálo junto aos
	 * contratos, e para os resjustes doa aniversários dos planos dos segurados.
	 *  
	 *  ===> Esta classe não contempla exclusão.
	 */

	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, length = 20)
	private String nome;
	
	@ManyToOne
	@JoinColumn(name = "plano_id", nullable = false)
	private Plano plano;


}
