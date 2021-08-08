package projects03;

import java.util.Scanner;

public class HighestTwoStudents {

	public static void main(String[] args) {
	
		highestTwoScore();

	}
	static void highestTwoScore() {
		Scanner in=new Scanner(System.in);
		System.out.println("Number of Students");
		int number=in.nextInt();
		double temp1=0;
		String most="";
		String most2="";
		String list[]=new String[number];
		 for(int i=0;i<=list.length-1;i++) {
			 System.out.println("Student "+(i+1));
			 list[i]=list();
			 if(Double.parseDouble(list[i].substring((list[i].indexOf('#')+1)))>temp1) {
				 temp1= Double.parseDouble(list[i].substring((list[i].indexOf('#')+1)));
				 most2=most;
				most=list[i].replace('#', ' ');
			 }
			 
			 }
		
System.out.printf("The student with the highest score is %s with a score of %.0f.",most.substring(0,most.lastIndexOf(' ')),Double.parseDouble(most.substring(most.lastIndexOf(" ")+1)));
System.out.println();
System.out.printf("The student with the second highest score is %s with a score of %.0f.",most2.substring(0,most.lastIndexOf(' ')),Double.parseDouble(most2.substring(most2.lastIndexOf(" ")+1)));
	}
		
	
	static String list() {
		Scanner in=new Scanner(System.in);
		System.out.println("Name?");
		String name=in.nextLine();
		System.out.println(name+"'s Score");
		double score=in.nextDouble();
		return name+"#"+score;
		
	}
	

}
