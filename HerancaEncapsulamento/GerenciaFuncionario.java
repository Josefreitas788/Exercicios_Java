package br.com.prog2.HerancaEncapsulamento;

public class GerenciaFuncionario {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario();
		CaixaAgencia caixa = new CaixaAgencia();
		GerenteOperacional gerente = new GerenteOperacional();
		caixa.aumentarSalario();
	}

}
