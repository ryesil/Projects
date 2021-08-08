package projects03;

public class Lottery {

	public static void main(String[] args) {
	
		lottery(12);
		lottery2(12);
	}
	static void lottery(int num) { //Enter a two digit integer from 00 to 99 and learn if you win the lottery.
		String random=String.format("%02d",(int)(Math.random()*100));
		char x=random.charAt(0);
		char y=random.charAt(1);
		char a=String.format("%02d",num).charAt(0);
		char b= String.format("%2d",num).charAt(1);
		int price=0;
		if(a==x&&b==y) {
			price=10000;
		} else if(a==y&&b==x) {
			price=3000;
		}else if((a==x^b==y)||(a==y^b==x)) {
			price=1000;
		}
		System.out.println(price);	 
	}
	static void lottery2(int num) {//Another version of the above code.
		int random=((int) Math.random()*100);
		int a=num%10;
		int b=(num/10)%10;
		int c=random%10;
		int d=(random/10)%10;
		int e=0;
		if(a==c&&b==d) {
			e=10000;
		}else if(a==d&&b==c) {
			e=3000;
		} else if((a==c^b==d)||(a==d^b==c)) {
			e=1000;
		}
		System.out.println(e);
	}

}
