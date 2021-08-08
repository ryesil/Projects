package projects03;

import java.util.Scanner;

public class LongestCommonString {

	public static void main(String[] args) {
	longestString();

	}
	static void longestString() {
		Scanner in=new Scanner(System.in);
		System.out.println("String 1");
		String one=in.nextLine();
		System.out.println("String 2");
		String two=in.nextLine();
		String a="";
		String b="";
		String aa=one.length()>=two.length()?two:one;
		for(int i=0;i<aa.length();i++) {
			if(one.charAt(i)==two.charAt(i)) {
				a+=aa.charAt(i);
				if(a.length()>b.length()) {
				b=a;
			}
			}else {
				
				a="";
			}
		}
		System.out.println("Second Longest String: "+"("+a+")");
		System.out.println("-----------------");
		System.out.println("Longest String: "+"("+b+")");
	}
}
