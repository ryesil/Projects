package projects03;

import java.util.Scanner;

public class Palindrome {
public static void main(String[] args) {
	
	palindrome2("ramazan");
	palindrome2("ab<c>cb?a");
	palindrome("ab<c>cb?a");
	palindrome("abcc><?cab");
	palindrome("112211");
	//palindrome("asdfghjukijytrefds123456yt/.,098765532AZ");
	//palindrome2("as134,<a>");
	//
}
static void  palindrome(String st) {// checks if the given string is a palindrome.
	st = st.replaceAll("[^a-zA-Z0-9]", "");
	StringBuilder sb=new StringBuilder(st).reverse();
	String ts=sb.toString();
	//System.out.println(st+"*****"+ts);
	if(st.equals(ts)) {
		System.out.println(st+ " is a pelindrome");
	}else {
		System.out.println(st + " is not a pelindrome");
	}
	
}
static void palindrome2(String st) { //another version of palindrome
	StringBuilder sb=new StringBuilder();
	for(int i=0;i<st.length();i++) {
		if (Character.isLetterOrDigit(st.charAt(i))) {
			sb.append(st.charAt(i));
		}
	}
	st=sb.toString();
	String ts=sb.reverse().toString();
	if (st.equals(ts)) {
		System.out.println(st + " is a palindrome");
	} else {
		System.out.println(st + " is not a palindrome");
	}
	
	
}

static void palindrome3() {
	Scanner in=new Scanner(System.in);
	System.out.println("string");
	String x=in.nextLine();	
	int count=0;
	boolean isPalindrome=true;
	while(count<x.length()) {
		if(x.charAt(0+count)!=x.charAt(x.length()-1-count)) {
			isPalindrome=false;
			break;
		}
		count++;
	}
	System.out.println(isPalindrome);
}
}
