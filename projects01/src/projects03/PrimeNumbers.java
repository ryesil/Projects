package projects03;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		// Prime numbers up to the given number.
primeNumbers();

	}
	static void primeNumbers() {
		Scanner in=new Scanner(System.in);
		System.out.println("integer");
		int count=0;
		String list="";
		int x=in.nextInt();
		for(int i=1;i<=x;i++) {
			int k=i/2;
			for(int j=1;j<=k;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==1) {
				list=list+i+", ";
			}
			count=0;
		}
		System.out.println(list);
	}

}
