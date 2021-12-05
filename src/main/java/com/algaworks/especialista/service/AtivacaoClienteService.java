package com.algaworks.especialista.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.algaworks.especialista.modelo.Cliente;
import com.algaworks.especialista.notificacao.Notificador;

@Component
public class AtivacaoClienteService {

	@Autowired(required = false)
	private Notificador notificador;
	
	public void ativar(Cliente cliente) {
		cliente.ativar();

		if (notificador != null) {
			notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
		} else {
			System.out.println("Não existe notificador, mas cliente foi ativado");
		}
	}

}
