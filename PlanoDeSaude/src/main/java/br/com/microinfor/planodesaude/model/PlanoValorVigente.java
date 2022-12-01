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
public class PlanoValorVigente {
	
	/**
	 * Valor do plano vigente no ato da contratação pelo cliente/segurado
	 */

	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, columnDefinition = "datetime")
	private LocalDateTime datainicio;

	@Column(nullable = false, columnDefinition = "datetime")
	private LocalDateTime datafim;

	@Column(nullable = false)
	private BigDecimal valor;

	@ManyToOne
	@JoinColumn(name="plano_id",nullable = false)
	private Plano plano;

}
