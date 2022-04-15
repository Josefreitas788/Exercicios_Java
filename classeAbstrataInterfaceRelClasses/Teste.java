package br.com.prog2.classeAbstrataInterfaceRelClasses;

public class Teste {

	public static void main(String[] args) {
		Bicicleta b = new Bicicleta(1,0);
		Carro c = new Carro(1,0);
		b.aumentarVelocidade(5);
		b.trocarMarcha(2);
		b.aplicarFrenagem(2);
		System.out.println("Estado da bicicleta");
		b.mostraEstado();
		c.aumentarVelocidade(54);
		c.trocarMarcha(2);
		c.aplicarFrenagem(15);
		System.out.println("Estado do carro");
		c.mostraEstado();
		
	}

}
