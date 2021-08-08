package projects03;

import java.util.Scanner;

public class Bank {//calculates loan.
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	
	System.out.println("annual interest rate in percent(%)");
	double interest=in.nextDouble();
	System.out.println("The number of years");
	double years=in.nextDouble();
	System.out.println("Loan amount");
	double loanAmount=in.nextDouble();
	double monthlyInterestRate=interest/1200;
	double monthlyPayment=(loanAmount*monthlyInterestRate)/(1-(1/Math.pow(1+monthlyInterestRate,years*12)));
	double totalPayment=monthlyPayment*12*years;
	System.out.println("Montly payment is : $"+ (int)(monthlyPayment*100)/100.0 +" and the total is: $"+ (int)(totalPayment*100)/100.0);
	
}
}
