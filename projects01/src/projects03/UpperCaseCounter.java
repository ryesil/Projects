package projects03;

import java.util.Scanner;

public class UpperCaseCounter {
public static void main(String[] args) {
	upperCaseCount();
	
}
static void upperCaseCount() {
	Scanner in=new Scanner(System.in);
	System.out.println("String");
	String str=in.nextLine();
	int i=0;
	int count=0;
	while(i<str.length()) {
		if(str.charAt(i)<='Z'&&str.charAt(i)>='A') {
			count++;
		}
		i++;
	}
	System.out.println("# of UpperCases is: "+count+".");
	
}
}
