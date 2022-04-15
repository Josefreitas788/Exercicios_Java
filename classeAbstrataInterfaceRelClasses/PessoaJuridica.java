package br.com.prog2.classeAbstrataInterfaceRelClasses;

public class PessoaJuridica extends Cliente {
	private String cnpj;
	private String incricaoEstadual;
	private String razaoSocial;
	public PessoaJuridica(Integer codigo, String nome, String endereco, String uf, String cep, String cnpj,
			String incricaoEstadual, String razaoSocial) {
		super(codigo, nome, endereco, uf, cep);
		this.cnpj = cnpj;
		this.incricaoEstadual = incricaoEstadual;
		this.razaoSocial = razaoSocial;
	}
	@Override
	public void inserir() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void alterar() {
		// TODO Auto-generated method stub
		
	}
	public void validarCnpj() {
		
	}
	public void pessoaJuridica() {
		
	}
	public void operatio4() {
		
	}
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getIncricaoEstadual() {
		return incricaoEstadual;
	}
	public void setIncricaoEstadual(String incricaoEstadual) {
		this.incricaoEstadual = incricaoEstadual;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	
	
	
}
