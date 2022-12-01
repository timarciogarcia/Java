package br.com.microinfor.planodesaude.model;

import javax.persistence.Column;
import javax.persistence.Embedded;
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
public class ClienteSegurado {
	
	/**
	 * AS INFORMAÇÕES SE REPETEM AQUI, POIS O SEGURADO PODE ESTAR EM OUTRIO LOCAL
	 * E QUEM FEZ O SEGURO OU SEJA O CLIENTE PODE SER UM HOTELZINHO, UMA CRECHE, 
	 * O SEGURADO PODE SER DE UM CASAL SEPARADO E SÓ UM DELES FAZ O SEGURO
	 */

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
	
	@ManyToOne
	@JoinColumn(name = "cliente_id", nullable = false)
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name = "plano_id", nullable = false)
	private Plano plano;
	
	@ManyToOne
	@JoinColumn(name = "clienteseguradocaracteristica_id", nullable = false)
	private ClienteSeguradoCaracteristica clienteSeguradoCaracteristica;
	
	@ManyToOne
	@JoinColumn(name = "clienteseguradotipo_id", nullable = false)
	private ClienteSeguradoTipo clienteSeguradoTipo;
		
}
