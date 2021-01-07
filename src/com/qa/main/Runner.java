package com.qa.main;

public class Runner {
	public static void main(String[] args) {
		
		// new instances
		Results student1 = new Results(10, 16, 11);
		Results student2 = new Results(150, 149, 145);
		Results student3 = new Results(100, 86, 40);
		
		// prints
		System.out.println(student1.getTotal());
		System.out.println(student1.percentagecalc());
		student1.showResults();
		student1.passedOverall();
		
		System.out.println(student2.getTotal());
		System.out.println(student2.percentagecalc());
		student2.showResults();
		student2.passedOverall();
		
		System.out.println(student3.getTotal());
		System.out.println(student3.percentagecalc());
		student3.showResults();
		student3.passedOverall();
		
		
		
	}

}
