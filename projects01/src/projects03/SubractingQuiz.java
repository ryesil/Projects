package projects03;

import java.util.Scanner;

public class SubractingQuiz { //how good are you at subtraction.
public static void main(String[] args) { // another great example
	Scanner in=new Scanner(System.in);
	int num1=(int) (Math.random()*10);
	int num2=(int) (Math.random()*10);
	if(num1<num2) {
		num2=num1+num2;
		num1=num2-num1;
		num2=num2-num1;
	}
	System.out.println(num1+" - "+num2+" ?");
	System.out.println((num1-num2)==in.nextInt());
	
	
}
}
