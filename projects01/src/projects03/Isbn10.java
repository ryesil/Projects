package projects03;


public class Isbn10 {

	public static void main(String[] args) {

//		isbn10(013601267);
		
		isbn10(100123456);
		System.out.println(Integer.parseInt(Integer.toString(100123456,8)));// work on this later.
//		isbn10(000222458);
	
	}
	static void isbn10(int num){ //generates the 10 digit ISBN-10 number.
	int num2=Integer.parseInt(Integer.toString(num,8));
	StringBuilder string=new StringBuilder();
	int lastDigit=0;
		for(int i=1;i<10;i++) {
			int e=num2%10;
			int d=(num2%10)*(10-i);
			num2/=10;
			lastDigit+=d;
			lastDigit=lastDigit%11;
			string.append(e);
			
	}
		System.out.println(lastDigit);
	System.out.println(string.reverse().append((lastDigit==10?'X':lastDigit)));
		
	}

}
