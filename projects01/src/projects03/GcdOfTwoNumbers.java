package projects03;

public class GcdOfTwoNumbers {

	public static void main(String[] args) {
		gcd(12,21);

	}
	static void gcd(int num1, int num2) {
		int temp=num1<num2?num1:num2;
		int divisor=1;
		for(int i=1;i<=temp;i++) {
			if(num1%i==0&&num2%i==0) {
				divisor=divisor>i?divisor:i;
			}
		}
		System.out.println(divisor);
	}
}
