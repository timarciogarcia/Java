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
public class Cr_Segurados {
	
	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idContasReceber;
	
	@ManyToOne
	@JoinColumn(name = "cliente_id", nullable = false)
	private Cliente cliente;	
	
	@ManyToOne
	@JoinColumn(name = "clientesegurado_id", nullable = false)
	private ClienteSegurado clienteSegurado;
	
	@Column(nullable = false, columnDefinition = "datetime")
	private LocalDateTime dataVencimento;

	@Column(nullable = false)
	private BigDecimal valor;

	@Column(columnDefinition = "datetime")
	private LocalDateTime dataEmissaoBoleto;
	
	@Column(length = 15)
	private String nossoNumeroBoleto;
	
	@ManyToOne
	@JoinColumn(name = "banco_id")
	private TbBanco tbbanco;

}
