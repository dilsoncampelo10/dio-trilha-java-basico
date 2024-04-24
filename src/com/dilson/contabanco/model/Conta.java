package com.dilson.contabanco.model;

public class Conta {
	private Integer numero;
	
	private String agencia;
	
	private String nomeCliente;
	
	private Double saldo;

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Olá "+this.nomeCliente+", obrigado por criar uma conta em nosso banco, "
				+ "sua agência é "+this.agencia+", conta "+this.numero+" e seu saldo "
				+this.saldo+" já está disponível para saque";
	}
	
	
	
}
