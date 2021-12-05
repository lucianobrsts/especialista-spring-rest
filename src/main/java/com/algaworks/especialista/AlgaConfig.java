package com.algaworks.especialista;

import org.springframework.context.annotation.Bean;

import com.algaworks.especialista.notificacao.NotificadorEmail;
import com.algaworks.especialista.service.AtivacaoClienteService;

//@Configuration
public class AlgaConfig {
	@Bean
	public NotificadorEmail notificadorEmail() {
		NotificadorEmail notificador = new NotificadorEmail("smtp.algamail.com.br");
		notificador.setCaixaAlta(true);
		
		return notificador;
	}
	
	@Bean
	public AtivacaoClienteService ativacaoClienteService() {
		return new AtivacaoClienteService(notificadorEmail());
	}
}
