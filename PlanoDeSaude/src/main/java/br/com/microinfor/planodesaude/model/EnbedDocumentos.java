package br.com.microinfor.planodesaude.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class EnbedDocumentos {

	@Column(name = "documentos_cnpj", length = 20)
	private String cnpj;

	@Column(name = "documentos_rg", nullable = false, length = 20 )
	private String rg;

	@Column(name = "documentos_cpf", nullable = false, length = 20 )
	private String cpf;
	
	@Column(name = "documentos_cnh", length = 20 )
	private String cnh;

	@Column(name = "documentos_sexo", length = 1 , nullable = false)
	private String sexo;

	@Column(name = "documentos_datanascimento", nullable = false, columnDefinition = "datetime")
	private LocalDateTime datanascimento;

}
