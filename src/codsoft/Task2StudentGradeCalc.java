package codsoft;
import java.util.*;
public class Task2StudentGradeCalc {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		System.out.println("");
		System.out.print("Enter the number of Subjects : ");
		
		int numSubjects = sc.nextInt();
		int[] subjects = new int [numSubjects];
		int totalMarks = 0;
		
		for (int i = 0 ; i < numSubjects ; i++) {
			System.out.print("Enter Marks in Subject "+ (i+1) + ": ");
			subjects[i]=sc.nextInt();
			totalMarks += subjects[i];
		}
		System.out.println("");
		System.out.println("-----------RESULT-----------");
		System.out.println("");
		System.out.println("Total Marks : "+ (totalMarks) + "/" + (numSubjects * 100));
		
		int avgMarks = totalMarks / numSubjects ;
		System.out.println("Average Percentage : "+ avgMarks + "%");
		
		if(avgMarks <100 && avgMarks >89) {
			System.out.println("Grade : A");
		}
		else if(avgMarks <90 && avgMarks >79) {
			System.out.println("Grade : B");
		}
		else if(avgMarks <80 && avgMarks >69) {
			System.out.println("Grade : C");
		}
		else if(avgMarks <70 && avgMarks >59) {
			System.out.println("Grade : D");
		}
		else if(avgMarks <60 && avgMarks >0) {
			System.out.println("Grade : F");
		}
		
		sc.close();
	}

}
