package com.algaworks.especialista.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.algaworks.especialista.service.ClienteAtivadoEvent;

@Component
public class NotificacaoService {
	
	@EventListener
	public void clienteAtivadoListener(ClienteAtivadoEvent event) {
		System.out.println("Cliente " + event.getCliente().getNome() + " agora está ativo!");
	}

}
