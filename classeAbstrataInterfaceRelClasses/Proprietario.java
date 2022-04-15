package br.com.prog2.classeAbstrataInterfaceRelClasses;

public class Proprietario extends Morador{
	private Integer qtdeApartamento;
	
	public Integer getQtdeApartamento() {
		return qtdeApartamento;
	}

	public void setQtdeApartamento(Integer qtdeApartamento) {
		this.qtdeApartamento = qtdeApartamento;
	}

	@Override
	public double calcularTaxaDeposito(int qtdeVolume){
		return qtdeVolume*3.0;
	}
}
