package projects03;

public class IsPrime {
public static void main(String[] args) {
	
}
static void isPrime(int num) {
	 int dividers=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				dividers++;
			}
		}
		System.out.println(dividers==1?num+" is a prime number.":num+" is not a prime number");
	}
}
