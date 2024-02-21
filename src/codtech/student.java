package codtech;

import java.util.ArrayList;
import java.util.Arrays;

public class student {
	private String name;
	private static  int roll_no;
	
	private int numberOfSubjects;
	private int marks;
	private double avgPercentage;
	private String grade;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static int getRoll_no() {
		return roll_no;
	}
	public static void setRoll_no(int roll_no) {
		student.roll_no = roll_no;
	}
	public int getNumberOfSubjects() {
		return numberOfSubjects;
	}
	public void setNumberOfSubjects(int numberOfSubjects) {
		this.numberOfSubjects = numberOfSubjects;
	}
	public int getMarks() {
		return marks;
	}
	public  void setMarks(int mark) {
		this.marks = mark;
	}
	public double getAvgPercentage() {
		return avgPercentage;
	}
	public void setAvgPercentage(double avgPercentage) {
		this.avgPercentage = avgPercentage;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "student [name=" + name + ", numberOfSubjects=" + numberOfSubjects + ", marks=" + marks
				+ ", avgPercentage=" + avgPercentage + ", grade=" + grade + "]";
	}
	public student(String name, int numberOfSubjects, int marks, double avgPercentage, String grade) {
		super();
		this.name = name;
		this.numberOfSubjects = numberOfSubjects;
		this.marks = marks;
		this.avgPercentage = avgPercentage;
		this.grade = grade;
	}
	public student() {
		super();
	}
	public student(String studName, int roll_no2, int numberOfSubjects2, double totalMarks, double percentage,
			String grade2) {
		// TODO Auto-generated constructor stub
	}
	
}