package projects03;

import java.util.Scanner;

public class SubtractionWith5Questions {

	public static void main(String[] args) {
	
		subtractionQuiz();

	}
	static void subtractionQuiz() {
		long startTime=System.currentTimeMillis();
		int correct=0;
		int wrong=0;
		for(int i=1;i<6;i++) {
			Scanner in=new Scanner(System.in);
			int random=(int)(Math.random()*101);
			int random2=(int)(Math.random()*101);
			String x="";
			if(random>random2) {
				x=random+" - "+random2;
			}else {
				x=random2+" - "+random;
			}
		System.out.println("What is "+x+" ?");
		int result=in.nextInt();
		if(result==Math.abs(random-random2)) {
			System.out.println("Correct.");
			correct++;
		}else {
			System.out.println("false, the correct answer was "+Math.abs(random-random2));
			wrong++;
		}
		}
		long endTime=System.currentTimeMillis();
		long timePassed=(endTime-startTime)/1000;
		System.out.println("Correct answers: "+ correct+"\n"+ "Wrong answers: "+wrong+"\n"+"in "+timePassed+" seconds.");
		
	}
}
