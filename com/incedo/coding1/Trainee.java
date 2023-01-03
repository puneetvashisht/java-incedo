package com.incedo.coding1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Trainee {
	
	String name;
	double score;
	
	
	public Trainee(String name) {
		super();
		this.name = name;
	}

	void takeAssessment(List<Assessment> assessments) {
		// mock implementation to take assessments
		// set score
		
		
		
		
		for(Assessment assessment : assessments) {
			// random number 0 to 100 range
			
			
			Random random = new Random();
			int score = random.nextInt(101);
			System.out.println("Random score " + score);
			
			// multiply with assessment weightage
			double assessmentScore = assessment.getWeightage() * score;
			System.out.println("Weighted score : " + assessmentScore);
			// add to final score
			this.score += assessmentScore;
		}
		
		
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Trainee [name=" + name + ", score=" + score + "]";
	}

	
	
	

	
}
