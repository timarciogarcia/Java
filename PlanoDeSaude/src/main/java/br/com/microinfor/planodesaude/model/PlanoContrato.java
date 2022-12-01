package br.com.microinfor.planodesaude.model;

import java.time.LocalDateTime;

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
public class PlanoContrato {
	
	/**
	 * Classe armazena os contratos de todos os planos cadastrados no sistema, 
	 * todos serão guardados, para efeito jurídico e fiscal.
	 * 
	 *  ===> Esta classe não contempla exclusão.
	 */

	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, length = 50)
	private String nome;

	@Column(nullable = false, length = 1000000)
	private String texto;

	@Column(nullable = false, length = 1)
	private String ativo;

	@Column(nullable = false, columnDefinition = "datetime")
	private LocalDateTime data;

	@ManyToOne
	@JoinColumn(name = "plano_id", nullable = false)
	private Plano plano;

	
}
