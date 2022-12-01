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
public class PlanoTipoReajusteDetalhe {

	/**
	 * Classe do detalhe do reajuste, para que fique armazernado o histórico dos
	 * resjustes de cada plano.
	 * 
	 * Ordem decrescente de DATA+PLANO traz o utlimo inserido.
	 * 
	 * ===> Esta classe não contempla exclusão.
	 */

	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, columnDefinition = "datetime")
	private LocalDateTime data;

	@Column(nullable = false)
	private BigDecimal porcentagem;

	@ManyToOne
	@JoinColumn(name="planotiporeajuste_id",nullable = false)
	private PlanoTipoReajuste planotiporeajuste;

}
