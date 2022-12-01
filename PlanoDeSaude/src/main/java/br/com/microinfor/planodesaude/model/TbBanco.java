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
public class TbBanco {
	
	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, length = 50)
	private String nome;

	@Column(nullable = false, length = 15)
	private String banco;
	
	@Column(nullable = false, length = 15)
	private String agencia;
	
	@Column(nullable = false, length = 15)
	private String conta;
	
	@Column(nullable = false, length = 100)
	private String titular;
	
}
