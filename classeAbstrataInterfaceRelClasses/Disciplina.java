package br.com.prog2.classeAbstrataInterfaceRelClasses;

public class Disciplina {
	private String codigo;
	private String descricao;
	private Integer cargaHoraria;
	private Matricula[] matriculas;
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Integer getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(Integer cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public Matricula[] getMatriculas() {
		return matriculas;
	}
	public void setMatriculas(Matricula[] matriculas) {
		this.matriculas = matriculas;
	}
	
	
}