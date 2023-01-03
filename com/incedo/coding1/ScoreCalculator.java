package com.incedo.coding1;

import java.util.ArrayList;
import java.util.List;

public class ScoreCalculator {
	
	static List<Assessment> assessments = new ArrayList<>();
	
	
	
	public static double calculateScore() {
		Trainee t1 = new Trainee("Ravi");
		t1.takeAssessment(assessments);
		System.out.println(t1);
		
		Trainee t2 = new Trainee("Priya");
		t2.takeAssessment(assessments);
		System.out.println(t2);
		
		return t1.score;
	}
	
	public static String  assignRating() {
		return "";
	}
	
	public static void main(String[] args) {
		Assessment codingAssessment = new CodingAssessment();
		codingAssessment.setWeightage();
		
		Assessment onlineAssessment = new OnlineAssessment();
		onlineAssessment.setWeightage();
		
		Assessment classPerfAssessment = new ClassPerformanceAssessment();
		classPerfAssessment.setWeightage();
		

		
		assessments.add(classPerfAssessment);
		assessments.add(codingAssessment);
		assessments.add(onlineAssessment);
		
		calculateScore();
		
		
		// calculate score
		
	}

}
