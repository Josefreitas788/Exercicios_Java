package framework_collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hashset1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> listaCursos = new HashSet<>();
		listaCursos.add("Computação");
		listaCursos.add("Física");
		listaCursos.add("Química");
		listaCursos.add("Eletromecânica");
		listaCursos.add("Pedagogia");
		System.out.println("Quantidade de cursos: "+listaCursos.size());
		
		Iterator<String> it = listaCursos.iterator();
		System.out.println("\nImprimindo com o while: ");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("\nImprimindo com o for each:");
		for(String s: listaCursos) {
			System.out.println(s);
		}
		
		listaCursos.remove("Eletromecânica");
		
		
	}

}
