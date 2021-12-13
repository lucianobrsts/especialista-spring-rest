package com.algaworks.especialista.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.algaworks.especialista.notificacao.NivelUrgencia;
import com.algaworks.especialista.notificacao.Notificador;
import com.algaworks.especialista.notificacao.TipoDoNotificador;
import com.algaworks.especialista.service.ClienteAtivadoEvent;

@Component
public class NotificacaoService {
	@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
	@Autowired
	private Notificador notificador;

	@EventListener
	public void clienteAtivadoListener(ClienteAtivadoEvent event) {
		notificador.notificar(event.getCliente(), "Seu cadastro no sisema está ativo!");
	}

}
