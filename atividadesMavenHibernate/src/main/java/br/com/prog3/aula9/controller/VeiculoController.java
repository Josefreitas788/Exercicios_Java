package br.com.prog3.aula9.controller;

import java.util.List;

import br.com.prog3.aula9.model.Veiculo;
import br.com.prog3.aula9.persistence.VeiculoDaoImp;

public class VeiculoController {
	public void incluir(Veiculo veiculo){
		VeiculoDaoImp vd = new VeiculoDaoImp();
		vd.incluir(veiculo);
		}
	public void alterar(Veiculo veiculo){
		VeiculoDaoImp vd = new VeiculoDaoImp();
		vd.alterar(veiculo);
		}
	public void excluir(Veiculo veiculo){
		VeiculoDaoImp vd = new VeiculoDaoImp();
		vd.excluir(veiculo);
		}
	public List<Veiculo> listarTodos(){
		VeiculoDaoImp vd = new VeiculoDaoImp();
		return vd.listarTodos();
		}
	public Veiculo buscarPelaPlaca(String placa){
		VeiculoDaoImp vd = new VeiculoDaoImp();
		return vd.buscarPelaPlaca(placa);
		}

}
