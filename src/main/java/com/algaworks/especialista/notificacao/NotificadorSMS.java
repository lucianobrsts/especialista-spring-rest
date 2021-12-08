package com.algaworks.especialista.notificacao;

import org.springframework.stereotype.Component;

import com.algaworks.especialista.modelo.Cliente;

@Component
public class NotificadorSMS implements Notificador {

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s através do telefone %s: %s\n", 
				cliente.getNome(), cliente.getTelefone(), mensagem);
	}

}
