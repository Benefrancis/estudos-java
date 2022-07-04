package br.com.benefrancis.estudos.ordenando;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

/**
 * 
 * @author Francis
 * @Referencia https: www.mballem.com/post/java-8-ordenando-dados-com-stream/
 */
public class Main {

	public static void main(String[] args) {

		List<Person> persons = new ArrayList<>();

		persons.add(new Person("Ana Maria", 25, 3200.50));
		persons.add(new Person("Bianca", 35, 3440.50));
		persons.add(new Person("Marta", 28, 5500.00));
		persons.add(new Person("Breno", 22, 3330.70));
		persons.add(new Person("Mario", 34, 2200.50));
		persons.add(new Person("Ricardo", 55, 3200.00));
		persons.add(new Person("Pietra", 26, 3400.50));
		persons.add(new Person("Fabiana", 44, 4200.60));
		persons.add(new Person("Airton", 29, 1500.50));

 		System.out.println("Ordena��o por nomes ascendente");
 		testSortForNameAsc(persons);
 		
 		System.out.println("Ordena��o por nomes decresente");
 		testSortForNameDesc(persons);
 		
 		System.out.println("Ordena��o por idade ascendente");
 		testSortForAgeAsc(persons);
 		
 		System.out.println("Ordenando por sal�rio");
 		testSortForSalaryAsc(persons);
		
 		System.out.println("Exibindo apenas sal�rios");
 		showOnlySalary(persons);
 		
 		System.out.println("Exibindo apenas sal�rios maiories que 3000");
 		showOnlySalaryHigherThan(persons, 3000d);
 		
 		System.out.println("Exibindo a soma dos sal�rios de funcionarios com mais de 30 anos");
 		showSumOfSalaryOfPersonWithAgeHigherThan(persons, 30);
 	
 		getList(persons);
		getMaxSalary(persons);
	}

	@SuppressWarnings("unused")
	private static void testSortForNameAsc(List<Person> persons) {

		persons.stream()
		    	.sorted((p1, p2) -> p1.getName().compareTo(p2.getName()))
				.forEach(p -> System.out.println(p));
	}
	
	@SuppressWarnings("unused")
	private static void testSortForNameDesc(List<Person> persons) {

		persons.stream()
		    	.sorted((p1, p2) -> p2.getName().compareTo(p1.getName()))
				.forEach(p -> System.out.println(p));
	}
	@SuppressWarnings("unused")
	private static void testSortForAgeAsc(List<Person> persons) {
		persons.stream()
				.sorted((p1,p2)->p1.getAge().compareTo(p2.getAge()))
				.forEach(p->System.out.println(p));
	}
	@SuppressWarnings("unused")
	private static void testSortForSalaryAsc(List<Person> persons) {
		persons.stream()
				.sorted((p1,p2)->p1.getSalary().compareTo(p2.getSalary()))
				.forEach(p->System.out.println(p));
	}
	@SuppressWarnings("unused")
	private static void showOnlySalary(List<Person> p) {
		p.stream()
		 .mapToDouble((s)->s.getSalary())
		 .sorted()
		 .forEach(s->System.out.println(s));
	}
	
	@SuppressWarnings("unused")
	private static void showOnlySalaryHigherThan(List<Person> p, Double salary) {
		p.stream()
		 .mapToDouble((s)->s.getSalary())
		 .filter(s-> s>salary )
		 .sorted() 
		 .forEach(s->System.out.println(s));
	}
	
	@SuppressWarnings("unused")
	private static void showSumOfSalaryOfPersonWithAgeHigherThan(List<Person> p, Integer a) {
	Double total =	p.stream()
		 .filter(o->o.getAge()>a)
		 .mapToDouble(o->o.getSalary())
		 .sum();
	
	System.out.printf("A soma dos sal�rios �: %.2f", total);
	}
	
	@SuppressWarnings("unused")
	private static void getList(List<Person> persons) {
		List<Person> lP = persons.stream()
						.filter((Person p)->p.getSalary() > 3400)
						.collect(Collectors.toList());
		
		lP.forEach(System.out::println);
	}
	
	private static void getMaxSalary(List<Person> persons) {
		OptionalDouble max = persons.stream()
				.mapToDouble(p->p.getSalary())
				.max();
		
		System.out.println(max.orElse(0));
		
	}
	
}