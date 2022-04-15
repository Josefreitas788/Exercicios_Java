package br.com.prog2.classeAbstrataInterfaceRelClasses;

public class Pedido {
	private Double valor;
	private ClienteAssociacao cliente;
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public ClienteAssociacao getCliente() {
		return cliente;
	}
	public void setCliente(ClienteAssociacao cliente) {
		this.cliente = cliente;
	}
	
}
