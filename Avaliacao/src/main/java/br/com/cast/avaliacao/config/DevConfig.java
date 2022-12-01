package br.com.cast.avaliacao.config;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.cast.avaliacao.service.DbService;

@Configuration
@Profile("dev")
public class DevConfig {

	@Autowired
	private DbService dbService;

	@Value("${spring.jpa.hibernate.ddl-auto}")
	private String strategy;
	

	@Bean
	public boolean instanciaBaseDeDados() throws ParseException {
		System.out.println("*********************************** "+strategy);
		if (strategy.equals("create")) {
			this.dbService.instanciaBaseDeDados();
		}
		return false;
	}
}