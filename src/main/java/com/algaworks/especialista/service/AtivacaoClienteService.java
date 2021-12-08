package com.algaworks.especialista.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.algaworks.especialista.modelo.Cliente;
import com.algaworks.especialista.notificacao.Notificador;

@Component
public class AtivacaoClienteService {

	@Autowired
	private List<Notificador> notificadores;

	public void ativar(Cliente cliente) {
		cliente.ativar();

		for (Notificador notificador : notificadores) {
			notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
		}
	}

}
