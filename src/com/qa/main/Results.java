package com.qa.main;

public class Results {
	
	// variables
	int physics;
	int chemistry;
	int biology;
	double total;
	double percentage;
	
	//methods
	public Results(int phyMark, int chemMark, int bioMark) {
		physics = phyMark;
		chemistry = chemMark;
		biology = bioMark;
		total = (double) phyMark + chemMark + bioMark;
	}
	
	public void showResults() {
		System.out.println("The student has recieved the mark " + physics + " in their Physics exam.");
		System.out.println("The student has recieved the mark " + chemistry + " in their Chemistry exam.");
		System.out.println("The student has recieved the mark " + biology + " in their Biology exam.");
	}
	
	public double getTotal() {
		return total;
	}
	
	public float percentagecalc() {
		float result = (float) (this.total/450);
		return result*100;
	}
	
	public boolean passedSubject(double grade) {
		double result = grade/150;
		double pResult = result * 100;
		if (pResult >= 60) {
			return true;
		} else {
			return false;
		}
	}
	
	public void passedOverall() {
		double pBiology = (biology/150)*100;
		double pChemistry = (chemistry/150)*100;
		double pPhysics = (physics/150)*100;
		double pAverage = (pBiology + pChemistry + pPhysics)/3;
		System.out.println("Your average grade is: " + pAverage + "%");
		
		if (pBiology < 60) {
			System.out.println("You failed in Biology with a grade of: " + pBiology);
		}
		
		if (pChemistry < 60) {
			System.out.println("You failed in Chemistry with a grade of: " + pChemistry);
		}
		
		if (pPhysics < 60) {
			System.out.println("You failed in Physics with a grade of: " + pPhysics);
		}
	}
	
	}



