package br.com.microinfor.planodesaude.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class EnbedContato {

	@Column(name = "contato_email", length = 50, nullable = false)
	private String email;

	@Column(name = "contato_telefonefixo", length = 14, nullable = false)
	private String telefone;

	@Column(name = "contato_celular", length = 14, nullable = false)
	private String celular;
	
	@Column(name = "contato_outrosfones", length = 100)
	private String outrosfones;
	
}
