package projects03;

import java.util.Scanner;

public class SsnChecker {
public static void main(String[] args) {
	ssn();
	
	
}
static void ssn() {
	Scanner in=new Scanner(System.in);
	System.out.println("ssn?");
	String ssn=in.next().replaceAll("[/-]", "");
	String ssn1=String.format("*****%s",ssn.matches("\\d{9}")?ssn.substring(5):"Oppsss!!!!");
	System.out.println(ssn1.length()==9?"The ssn is "+ssn1:"SSN must be 9-digit long and nothing but numbers please!.");
}
}
