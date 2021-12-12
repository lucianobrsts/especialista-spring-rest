package com.algaworks.especialista.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.algaworks.especialista.modelo.Cliente;
import com.algaworks.especialista.notificacao.NivelUrgencia;
import com.algaworks.especialista.notificacao.Notificador;
import com.algaworks.especialista.notificacao.TipoDoNotificador;

@Component
public class AtivacaoClienteService {

	@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
	@Autowired
	private Notificador notificador;
	
	public void ativar(Cliente cliente) {
		cliente.ativar();

			notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}

}
