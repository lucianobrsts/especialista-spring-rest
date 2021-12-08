package com.algaworks.especialista.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.algaworks.especialista.modelo.Cliente;
import com.algaworks.especialista.notificacao.Notificador;

@Component
public class AtivacaoClienteService {

	@Qualifier("urgente")
	@Autowired
	private Notificador notificador;
	
	public void ativar(Cliente cliente) {
		cliente.ativar();

			notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}

}
