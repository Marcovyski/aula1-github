package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrrayList001 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");

		
		System.out.println("Tamanho da minha list = " + list.size());
		
		for (String x : list) { //para cada String x pertencente a minha lista list
			System.out.println(x); 
		}
		System.out.println("------------------------");
		list.remove(1);
		list.remove("Anna");
		list.removeIf(x -> x.charAt(0) == 'M'); // x tal que LAMBDA
		for (String x : list) { //para cada String x pertencente a minha lista list
			System.out.println(x); 
		}
		System.out.println("------------------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		System.out.println("------------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'B').collect(Collectors.toList());
		for (String x : result) { //para cada String x pertencente a minha lista list
			System.out.println(x); 
		}
		System.out.println("------------------------");
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		//String name = list.stream().filter(x -> x.charAt(0) == 'J ').findFirst().orElse(null));

		
	}

}
