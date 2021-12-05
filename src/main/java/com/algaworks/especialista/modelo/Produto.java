package com.algaworks.especialista.modelo;

import java.math.BigDecimal;

public class Produto {

	private String nome;
	private BigDecimal valotTotal;

	public Produto(String nome, BigDecimal valotTotal) {
		super();
		this.nome = nome;
		this.valotTotal = valotTotal;
	}

	public String getNome() {
		return nome;
	}

	public BigDecimal getValotTotal() {
		return valotTotal;
	}

}
