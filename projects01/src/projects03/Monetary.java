package projects03;

import java.util.Scanner;

public class Monetary {// computes change of the given money amount.
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter money");
		double money=in.nextDouble();
		int cents=(int) Math.round(money*100);
		int maxDollar=cents/100;
		int remainingCents=cents%100;
		int quarters=remainingCents/25;
		int remainingCentsAfterQuarters=remainingCents%25;
		int dimes=remainingCentsAfterQuarters/10;
		int remainingCentsAfterDimes=remainingCentsAfterQuarters%10;
		int nickels=remainingCentsAfterDimes/5;
		int remainingCentsAfterNickels=remainingCentsAfterDimes%5;
		String dollar= maxDollar>0?maxDollar+" Dollars ":"";
		String quarter= quarters>0?quarters+" Quarters ":"";
		String dime= dimes>0?dimes+" dimes ":"";
		String nickel=nickels>0?nickels+" Nickels ":"";
		String pennies=remainingCentsAfterNickels>0?remainingCentsAfterNickels+" Pennies ":"";
		System.out.println(cents+" cents equals: ".concat(dollar).concat(quarter).concat(dime).concat(nickel).concat(pennies).concat("."));
		
		
		
	}

}
