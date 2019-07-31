package course_java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListExe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<>();

		list.add("Maria");
		list.add("Alex");
		list.add("Jose");
		list.add("bob");
		list.add(1, "Marcão");

		System.out.println(list.size());

		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("-------------");
		//list.remove(1);
		list.removeIf(x -> x.charAt(0) == 'M');
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-------------");
		System.out.println("index of Bob" + list.indexOf("Bob"));
		System.out.println("-------------");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());		// imprimindo somente com a letra A
		for (String x : result) {
			System.out.println(x);
		}
		System.out.println("------------");
		

		 
	}

}
