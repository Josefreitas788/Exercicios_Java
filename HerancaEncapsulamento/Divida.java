package br.com.prog2.HerancaEncapsulamento;

import java.time.LocalDate;
public class Divida {
	private Integer codigo;
	private Double valor;
	private LocalDate dataDeVencimento;
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public LocalDate getDataDeVencimento() {
		return dataDeVencimento;
	}
	public void setDataDeVencimento(LocalDate dataDeVencimento) {
		this.dataDeVencimento = dataDeVencimento;
	}
}
