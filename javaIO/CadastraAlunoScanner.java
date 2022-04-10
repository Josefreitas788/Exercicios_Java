package br.com.prog2.javaIO;

import java.util.Scanner;

import br.com.prog2.util.DataPadraoBrasil;

public class CadastraAlunoScanner {

	public static void main(String[] args) {
		
		//System.in indica leitura do teclado
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite a matricula: ");
		int matricula = leitor.nextInt();
		System.out.print("Digite o nome: ");
		String nome = leitor.next();
		//Só para fins didáticos, isto será melhorado mais para frente
		System.out.print("Digite o dia do nascimento: ");
		String dia = leitor.next();
		System.out.print("Digite o mês do nascimento: ");
		String mes = leitor.next();
		System.out.print("Digite o ano do nascimento: ");
		String ano = leitor.next();
		DataPadraoBrasil dataDeNascimento = new DataPadraoBrasil(dia, mes, ano);
		Aluno aluno = new Aluno(matricula,nome,dataDeNascimento);
		leitor.close();
		
	}

}
