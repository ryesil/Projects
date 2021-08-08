package projects03;

public class PalindromeForThreeDigits {

	public static void main(String[] args) {
		
palindrome(123);
	}
	static void palindrome(int num ) {//checks whether a three-digit number is Palindrome
		String mun=Integer.toString(num,8).length()<2?Integer.toString(num,8).replaceAll("\\A", "00"):
			Integer.toString(num,8).length()<3?Integer.toString(num,8).replaceAll("\\A", "0"):Integer.toString(num);
		System.out.println(mun);
		String m=new StringBuilder(mun).reverse().toString();
	System.out.println(m);
	if(mun.equals(m)) {
		System.out.println("Palindrome");
	} else {
		System.out.println("not a Palindrome");
	}
	}

}
