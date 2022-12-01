package br.com.microinfor.planodesaude.model;

import java.math.BigDecimal;
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

public class PlanoCobertura {

	/**
	 * Item de Cobertura incluido no Plano......Bucado da Tabela PlanoTodasCoberturas
	 * o usuario escolhe da tabela PlanoTodasCoberturas e é inserido no planoCobertura
	 * ou seja cada plano tem seus itens e carencias individuais
	 */
	
	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, length = 200)
	private String descriao;

	@Column(nullable = false)
	private Integer meses;
 	
	@Column(nullable = false, columnDefinition = "datetime")
	private LocalDateTime carenciaAte;
	
	@Column(nullable = false) // o que o segurado paga se houver coparticipaçao
	private BigDecimal valorCoparticipacao;
	
	@ManyToOne
	@JoinColumn(name = "plano_id", nullable = false)
	private Plano plano;


}
