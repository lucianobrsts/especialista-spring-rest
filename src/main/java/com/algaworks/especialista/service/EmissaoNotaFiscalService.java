package com.algaworks.especialista.service;

import com.algaworks.especialista.modelo.Cliente;
import com.algaworks.especialista.modelo.Produto;
import com.algaworks.especialista.notificacao.Notificador;

public class EmissaoNotaFiscalService {

	private Notificador notificador;

	public EmissaoNotaFiscalService(Notificador notificador) {
		this.notificador = notificador;
	}

	public void emitir(Cliente cliente, Produto produto) {
		// TODO emite a nota fiscal aqui...

		this.notificador.notificar(cliente, "Nota fiscal do produto " + produto.getNome() + " foi emitida!");
	}

}
