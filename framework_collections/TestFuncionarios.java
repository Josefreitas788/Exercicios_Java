package framework_collections;

import java.util.ArrayList;
import java.util.List;

public class TestFuncionarios {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
		Funcionario f3 = new Funcionario();
		f1.setNome("JOSE");
		f2.setNome("Helo");
		f3.setNome("Carla");
		f1.setSalario(1500.56);
		f2.setSalario(1000.00);
		f3.setSalario(8000.89);
		f1.bonus(10);
		f2.bonus(12);
		f3.bonus(9);
		List<Funcionario> funcionarios = new ArrayList<>();
		funcionarios.add(f1);
		funcionarios.add(f2);
		funcionarios.add(f3);
		System.out.println(funcionarios.size());
		for(int i = 0; i < funcionarios.size(); i++){
			
			Funcionario func = (Funcionario)funcionarios.get(i);
			System.out.println(func.getNome()+" recebe "+func.getSalario());
		}
	}

}
