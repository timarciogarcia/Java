package br.com.microinfor.planodesaude.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Cliente {

	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, length = 100)
	private String nome;
	
	@Embedded
	private EnbedEndereco endereco;

	@Embedded
	private EnbedContato contato;

	@Embedded
	private EnbedDocumentos documentos;
	
	// Data que o cliente deu o aceite, aceitou e concordou com os termos do seguro,
	// seja ele papel ou eletronico.
	// Essa data gera a regra de negócio colocando os boletos para cada segurado
	// em nome do cliente que é o contratante do seguro
	
	@Column(columnDefinition = "datetime")
	private LocalDateTime dataAceite;
	
	@Column(columnDefinition = "datetime")
	private LocalDateTime dataSuspensao;
	
	@Column(columnDefinition = "datetime")
	private LocalDateTime dataCancelamento;
	
	
	
}