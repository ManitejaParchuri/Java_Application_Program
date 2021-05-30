package com.vm.java.features;

import java.util.*;
import java.util.stream.Collectors;

public class StreamDemo2 {

	public static void main(String[] args) {
		
		ArrayList<Employe> employees=new ArrayList<Employe>();
		employees.add(new Employe(1, "a", "cse", 19, 20000));
		employees.add(new Employe(2, "b", "ece", 21, 30000));
		employees.add(new Employe(3, "c", "ecm", 22, 40000));
		employees.add(new Employe(4, "d", "cse", 23, 50000));
		employees.add(new Employe(5, "e", "ece", 24, 60000));
		employees.forEach(System.out::println);
		
		System.out.println("========count od employes========");
		long employee =employees.stream().count();
		System.out.println(employee);
		System.out.println("========employee in cse========");
		employees.stream().filter(s1->s1.getDep().equalsIgnoreCase("cse")).forEach(s->System.out.println(s));
		System.out.println("======employe start with a========");
		employees.stream().filter(s1->s1.getName().startsWith("a")).forEach(s->System.out.println(s));
		
		long empcountofsalary= employees.stream().filter(s1->s1.getSalary()>20000).count();
		System.out.println(empcountofsalary);
		
		
		employees.stream().map(m->m.getId()+"  "+m.getName()+" "+m.getName().length()).forEach(System.out::println);
		
		
		
		employees.stream().map(m->m.getSalary()*0.20+m.getSalary()+"  "+m.getName()+" "+m.getName().length()).forEach(System.out::println);

		long sum=employees.stream().filter(s->s.getDep().equals("cse")).collect(Collectors.summarizingInt(Employe::getSalary)).getSum();
		System.out.println(sum);
		
		employees.stream().distinct().forEach(System.out::println);
		System.out.println("--------=");
		employees.stream().skip(2).forEach(System.out::println);


	}

}
