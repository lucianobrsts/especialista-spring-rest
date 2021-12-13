package com.algaworks.especialista.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;

import com.algaworks.especialista.modelo.Cliente;

//@Component
public class AtivacaoClienteService {

//	@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
//	@Autowired
//	private Notificador notificador;
//
//	@PostConstruct
//	public void init() {
//		System.out.println("INIT " + notificador);
//	}
//
//	@PreDestroy
//	public void destroy() {
//		System.out.println("DESTROY ");
//	}

	@Autowired
	private ApplicationEventPublisher eventPublisher;

	public void ativar(Cliente cliente) {
		cliente.ativar();

		eventPublisher.publishEvent(new ClienteAtivadoEvent(cliente));

//		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}

}
