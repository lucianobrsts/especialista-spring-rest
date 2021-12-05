package com.algaworks.especialista;

import org.springframework.context.annotation.Bean;

import com.algaworks.especialista.notificacao.Notificador;
import com.algaworks.especialista.service.AtivacaoClienteService;

public class ServiceConfig {
	@Bean
	public AtivacaoClienteService ativacaoClienteService(Notificador notificador) {
		return new AtivacaoClienteService(notificador);
	}
}
