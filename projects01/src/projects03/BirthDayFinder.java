package projects03;

import java.util.Scanner;

public class BirthDayFinder {
public static void main(String[] args) {
birthDayFinder();

}
static void birthDayFinder() {
	String set1="{1,3,5,7,9,11,13,15,17,19,21,23,25,27,29,31}";
	String set2="{2,3,6,7,10,11,14,15,18,19,22,23,26,27,30,31}";
	String set3="{4,5,6,7,12,13,14,15,20,21,22,23,28,29,30,31}";
	String set4="{8,9,10,11,12,13,14,15,24,25,26,27,28,29,30,31}";
	String set5="{16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31}";
	Scanner in=new Scanner(System.in);
	int a=0;
	int b=0;
	int c=0;
	int d=0;
	int e=0;
	System.out.println("Does your birthday appear in the following set, Y/N?"+"\n"+set1);
	String answer1=in.next();
	System.out.println("Does your birthday appear in the following set, Y/N?"+"\n"+set2);
	String answer2=in.next();
	System.out.println("Does your birthday appear in the following set, Y/N?"+"\n"+set3);
	String answer3=in.next();
	System.out.println("Does your birthday appear in the following set, Y/N?"+"\n"+set4);
	String answer4=in.next();
	System.out.println("Does your birthday appear in the following set, Y/N?"+"\n"+set5);
	String answer5=in.next();
	if(answer1.equalsIgnoreCase("y")) {
		a=Integer.parseInt(Character.toString(set1.charAt(1)));
	}if(answer2.equalsIgnoreCase("y")) {
		b=Integer.parseInt(Character.toString(set2.charAt(1)));
	}if(answer3.equalsIgnoreCase("y")) {
		c=Integer.parseInt(Character.toString(set3.charAt(1)));
	}if(answer4.equalsIgnoreCase("y")) {
		d=Integer.parseInt(Character.toString(set4.charAt(1)));
	}if(answer5.equalsIgnoreCase("y")) {
		e=Integer.parseInt(set5.substring(1,3));
	}
	int birthday=a+b+c+d+e;
	System.out.println("Your birthDay is : "+birthday);
}
}
