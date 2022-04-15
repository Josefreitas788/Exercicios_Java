package br.com.prog2.classeAbstrataInterfaceRelClasses;

public class ClienteAssociacao {
	private String cpf;
	private String nome;
	private Pedido[] pedidos;
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Pedido[] getPedidos() {
		return pedidos;
	}
	public void setPedidos(Pedido[] pedidos) {
		this.pedidos = pedidos;
	}
	
}
