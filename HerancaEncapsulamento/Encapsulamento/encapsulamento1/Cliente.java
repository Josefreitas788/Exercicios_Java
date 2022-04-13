package br.Encapsulamento.encapsulamento1;

import br.Encapsulamento.encapsulamento2.PessoaJuridica;

public class Cliente {
	public Integer codigo;
	private String nome;
	protected String endereco;
	String uf;
	private String cep;
	
	public String inserirCliente() {
		return "Ciente inserido";
		}
		public String atualizarCliente() {
		return "Ciente atualizado";
		}
		public void testarVisibilidade() {
		PessoaFisica pf = new PessoaFisica();
		PessoaJuridica pj = new PessoaJuridica();
		Cliente c = new Cliente();
		}
}
