package br.com.prog2.IntroducaoOO;

public class Veiculo {
	String placa;
	String cor;
	String  ano;
	Double velocidade;
	String descricao;
	public Veiculo() {
		this.velocidade = 0.0;
	}
	
	void aumentarVelocidade() {
		this.velocidade =+ 10.0;
	}
	void diminuirVelocidade() {
		if(this.velocidade >= 10.0) {
			this.velocidade =- 10.0;
		}
		else {
			this.velocidade = 0.0;
			System.out.println("O veiculo parou!");
		}
	}
	void pararVeiculo() {
		this.velocidade = 0.0;
		
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
}
