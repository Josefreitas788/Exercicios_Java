package br.com.prog2.classeAbstrataInterfaceRelClasses.ComposicaoAgregacao;

public class TesteAgregacaoComposicao {

	public static void main(String[] args) {
		/*
		Jogador j1 = new Jogador();
		Jogador j2 = new Jogador();
		Equipe e1 = new Equipe();
		e1.setNome("Equipe A");
		j1.setNome("Zico");
		j2.setNome("Pelé");
		Jogador[] jogadores = new Jogador[2];
		jogadores[0] = j1;
		jogadores[1] = j2;
		e1.setJogadores(jogadores);
		for(Jogador j : jogadores){
		System.out.println(e1.getNome()+", Jogador: "+j.getNome());
		}
		*/
		Edificio e1 = new Edificio();
		e1.setNome("Edificío de Luxo 1");
		Andar a1 = new Andar();
		Andar a2 = new Andar();
		Andar a3 = new Andar();
		Andar a4 = new Andar();
		Andar a5 = new Andar();
		Andar a6 = new Andar();
		a1.setOrdem(1);
		a2.setOrdem(2);
		a3.setOrdem(3);
		a4.setOrdem(4);
		a5.setOrdem(5);
		a6.setOrdem(6);
		e1.andares[0] = a1;
		e1.andares[1] = a2;
		e1.andares[2] = a3;
		e1.andares[3] = a4;
		e1.andares[4] = a5;
		e1.andares[5] = a6;
		for(Andar a : e1.andares) {
			System.out.println("Edifício: "+e1.getNome()+", andar: "+
					a.getOrdem());
		}
		
		
	}

}
