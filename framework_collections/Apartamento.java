package framework_collections;

public class Apartamento{
	Integer codigo;
	Double area;
	Integer numeroComodo;
	

	public Integer getCodigo() {
		return codigo;
	}


	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}


	public Double getArea() {
		return area;
	}


	public void setArea(Double area) {
		this.area = area;
	}


	public Integer getNumeroComodo() {
		return numeroComodo;
	}


	public void setNumeroComodo(Integer numeroComodo) {
		this.numeroComodo = numeroComodo;
	}


	@Override
	public boolean equals(Object obj){
		if((obj instanceof Apartamento) && ((Apartamento)obj).getCodigo().equals(this.codigo)){
		return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return codigo;
	}
	
	
}
