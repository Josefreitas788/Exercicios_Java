package framework_collections;

public class Funcionario {
	private int matricula;
	private String nome;
	private Double salario;
	public void bonus(Double percentual) {
		this.salario = salario*(1+percentual/100);
	}
	public void bonus(int percentual) {
		this.salario = salario*(1+percentual/100);
	}
	public int getMatriula() {
		return matricula;
	}
	public void setMatriula(int matriula) {
		this.matricula = matriula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	public int compareTo(Funcionario func) {
		if(this.matricula< func.matricula){
			return -1;
		}
		if(this.matricula> func.matricula){
			return 1;
		}
			return 0;
		}

}
