package com.algaworks.especialista.notificacao;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("notificador.email")
public class NotificadorProperties {
	
	private String hostServidor;
	private Integer portaServidor;

}
