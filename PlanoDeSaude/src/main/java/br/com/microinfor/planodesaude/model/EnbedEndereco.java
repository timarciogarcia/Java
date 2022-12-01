package br.com.microinfor.planodesaude.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class EnbedEndereco {

	@Column(name = "endereco_cep", nullable = false, length = 9)
	private String cep;

	@Column(name = "endereco_logradouro", nullable = false, length = 100)
	private String logradouro;

	@Column(name = "endereco_numero", nullable = false, length = 10)
	private String numero;

	@Column(name = "endereco_complemento", length = 20)
	private String complemento;

	@Column(name = "endereco_bairro", length = 50, nullable = false)
	private String bairro;

	@Column(name = "endereco_cidade", length = 80, nullable = false)
	private String cidade;

	@Column(name = "endereco_estado", length = 2, nullable = false)
	private String estado;

}
