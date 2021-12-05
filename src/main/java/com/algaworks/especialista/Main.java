package com.algaworks.especialista;

import com.algaworks.especialista.modelo.Cliente;
import com.algaworks.especialista.notificacao.Notificador;
import com.algaworks.especialista.notificacao.NotificadorSMS;
import com.algaworks.especialista.service.AtivacaoClienteService;

public class Main {

	public static void main(String[] args) {
		Cliente joao = new Cliente("João", "joao@xyz.com", "3499998888");
		Cliente maria = new Cliente("Maria", "maria@xyz.com", "1177772222");

		Notificador notificador = new NotificadorSMS();

		AtivacaoClienteService ativacaoCliente = new AtivacaoClienteService(notificador);
		ativacaoCliente.ativar(joao);
		ativacaoCliente.ativar(maria);
	}

}
