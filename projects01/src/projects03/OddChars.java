package projects03;

import java.util.Scanner;

public class OddChars {

	public static void main(String[] args) {
		
oddChars();
	}
	static void oddChars() {
		Scanner in=new Scanner(System.in);
		System.out.println("String");
		String str=in.nextLine();
		String temp="";
		int i=1;
		while(i<=str.length()/2) {
			temp+=str.charAt(2*i-1)==' '?"":str.charAt(2*i-1);
			i++;
		}
		System.out.println(temp);
	}
}
