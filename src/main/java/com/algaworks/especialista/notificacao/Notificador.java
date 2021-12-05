package com.algaworks.especialista.notificacao;

import com.algaworks.especialista.modelo.Cliente;

public interface Notificador {
	
	void notificar(Cliente cliente, String mensagem);

}
