package br.com.prog3.aula9.controller;

import java.util.List;

import br.com.prog3.aula9.model.Multa;
import br.com.prog3.aula9.model.Veiculo;
import br.com.prog3.aula9.util.HibernateUtil;

public class Teste {

	public static void main(String[] args) {
		HibernateUtil.getSessionFactory();
//		Veiculo v = new Veiculo();
//		VeiculoController vc = new VeiculoController();
//		v.setPlaca("JIB4590");
//		v.setAnoFabricacao(2015);
//		v.setAnoModelo(2016);
//		v.setCor("Prata");
//		vc.incluir(v);
//		Veiculo v = new Veiculo();
//		VeiculoController vc = new VeiculoController();
//		v.setPlaca("JIB4590");
//		v.setAnoFabricacao(2015);
//		v.setAnoModelo(2015);
//		v.setCor("Cinza");
//		vc.alterar(v);
//		Veiculo v = new Veiculo();
//		VeiculoController vc = new VeiculoController();
//		v.setPlaca("JIB4590");
//		vc.excluir(v);
//		Veiculo v = new Veiculo();
//		VeiculoController vc = new VeiculoController();
//		v.setPlaca("JIK1320");
//		v.setAnoFabricacao(2015);
//		v.setAnoModelo(2015);
//		v.setCor("Cinza");
//		vc.incluir(v);
//		v.setPlaca("JIB4560");
//		v.setAnoFabricacao(2012);
//		v.setAnoModelo(2012);
//		v.setCor("Prata");
//		vc.incluir(v);
//		v.setPlaca("PAZ1020");
//		v.setAnoFabricacao(2017);
//		v.setAnoModelo(2018);
//		v.setCor("Verde");
//		vc.incluir(v);
//		VeiculoController vc = new VeiculoController();
//		List<Veiculo> lista = vc.listarTodos();
//		if(lista != null){
//			for(Veiculo ve : lista){
//				System.out.println("Placa: "+ve.getPlaca());
//				System.out.println("Cor: "+ve.getCor());
//			}
//		}
//		VeiculoController vc = new VeiculoController();
//		Veiculo ve = vc.buscarPelaPlaca("PAZ1020");
//		if(ve != null){
//		System.out.println("Placa: "+ve.getPlaca());
//		System.out.println("Cor: "+ve.getCor());
//		System.out.println("Ano de fabricação: "+ve.getAnoFabricacao());
//		}
//		Multa m = new Multa();
//		Veiculo v = new Veiculo();
//		MultaController mc = new MultaController();
//		v.setPlaca("PAZ1020");
//		m.setCodigo(1);
//		m.setDescricao("Ultrapassou com sinal vermelho");
//		m.setArtigoviolado("Art. 3");
//		m.setVeiculo(v);
//		mc.incluir(m);
//		m.setCodigo(2);
//		m.setDescricao("Estacionamento proibido");
//		m.setArtigoviolado("Art. 5");
//		m.setVeiculo(v);
//		mc.incluir(m);
//		v.setPlaca("JIB4560");
//		m.setCodigo(3);
//		m.setDescricao("Parou na faixa de pedestre");
//		m.setArtigoviolado("Art. 10");
//		m.setVeiculo(v);
//		mc.incluir(m);
//		m.setCodigo(4);
//		m.setDescricao("Estacionamento proibido");
//		m.setArtigoviolado("Art. 5");
//		m.setVeiculo(v);
//		mc.incluir(m);
//		m.setCodigo(5);
//		m.setDescricao("Velocidade acima do permitido");
//		m.setArtigoviolado("Art. 8");
//		m.setVeiculo(v);
//		mc.incluir(m);
//		Multa m = new Multa();
//		Veiculo v = new Veiculo();
//		MultaController mc = new MultaController();
//		v.setPlaca("PAZ1020");
//		m.setCodigo(1);
//		m.setDescricao("Ultrapassou com sinal vermelho");
//		m.setArtigoviolado("Art. 35");
//		m.setVeiculo(v);
//		mc.alterar(m);
//		Multa m = new Multa();
//		MultaController mc = new MultaController();
//		m.setCodigo(1);
//		mc.excluir(m);
//		MultaController mc = new MultaController();
//		List<Multa> lista = mc.listarTodos();
//		if(lista != null){
//			for(Multa mu : lista){
//				System.out.println("Placa: "+mu.getVeiculo().getPlaca());
//				System.out.println("Descrição: "+mu.getDescricao());
//			}
//		}
//		MultaController mc = new MultaController();
//		Multa mu = mc.buscarPeloCodigo(3);
//		if(mu != null){
//			System.out.println("Placa: "+mu.getVeiculo().getPlaca());
//			System.out.println("Descrição: "+mu.getDescricao());
//		}
//		Veiculo v = new Veiculo();
//		v.setPlaca("JIB4560");
//		MultaController mc = new MultaController();
//		List<Multa> lista = mc.buscarPeloVeiculo(v);
//		if(lista != null){
//			for(Multa mu : lista){
//				System.out.println("Placa: "+mu.getVeiculo().getPlaca());
//				System.out.println("Descrição: "+mu.getDescricao());
//			}
//		}

	}

}
