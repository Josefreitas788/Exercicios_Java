package br.com.prog2.classeAbstrataInterfaceRelClasses.ComposicaoAgregacao;

public class Equipe {
	private String nome;
	private Jogador[] jogadores;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Jogador[] getJogadores() {
		return jogadores;
	}
	public void setJogadores(Jogador[] jogadores) {
		this.jogadores = jogadores;
	}
	
}
