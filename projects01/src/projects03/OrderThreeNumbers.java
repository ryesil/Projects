package projects03;

public class OrderThreeNumbers {
	public static void main(String[] args) {
		orderThreeIntegers(-1,-2,-3);
	}
	static void orderThreeIntegers(int a, int b, int c) { //orders three numbers.
		int x=a<=b?a<=c?a:c:b<=c?b:c;
		int y=0;
		int z=0;
		if(x==a) {
			if(b<=c) {
				y=b;
				z=c;
			} else {
				y=c;
				z=b;
			}
				
		} else if(x==b) {
			if(a<=c) {
				y=a;
				z=c;
			}else {
				y=c;
				z=a;
			}
			
		}else if(x==c) {
			if(a<=b) {
				y=a;
				z=b;
			} else {
				y=b;
				z=a;
			}
		}
		System.out.println(x+" < "+y+" < "+z);
		
		
	}

}
