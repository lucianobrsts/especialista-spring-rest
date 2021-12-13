package com.algaworks.especialista;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.algaworks.especialista.modelo.Cliente;
import com.algaworks.especialista.service.AtivacaoClienteService;

@Controller
public class MeuPrimeiroController {

	private AtivacaoClienteService ativacaoClienteService;
	
	public MeuPrimeiroController(AtivacaoClienteService ativacaoClienteService) {
		this.ativacaoClienteService = ativacaoClienteService;
	}

	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
	    Cliente joao = new Cliente("João", "joao@xyz.com", "3499998888");
	    
	    ativacaoClienteService.ativar(joao);
		
		return "Hello!";
	}
}
