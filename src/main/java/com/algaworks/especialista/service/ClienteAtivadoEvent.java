package com.algaworks.especialista.service;

import com.algaworks.especialista.modelo.Cliente;

public class ClienteAtivadoEvent {

	private Cliente cliente;

	public ClienteAtivadoEvent(Cliente cliente) {
		super();
		this.cliente = cliente;
	}

	public Cliente getCliente() {
		return cliente;
	}

}
