package projects03;

import java.util.ArrayList;
import java.util.Scanner;

public class UpperVsLowerCase {

	public static void main(String[] args) {
		vowelConsanant();
		constsVsVows();
		
	}
	static void vowelConsanant() {
		Scanner in=new Scanner(System.in);
		System.out.println("String");
		String str=in.nextLine().replaceAll("[^a-zA-Z]","").toLowerCase();
		int consts=0;
		int vows=0;
		int i=0;
		ArrayList<Character> a=new ArrayList<>();
		a.add('a');
		a.add('e');
		a.add('i');
		a.add('o');
		a.add('u');
		
		
		while(i<str.length()) {
			str.toLowerCase();
			if(a.contains(str.charAt(i))) {
				vows++;
			}else {
				consts++;
			}
			i++;
		}
		System.out.printf("Number of Consanants is %d",consts);
		System.out.println();
		System.out.printf("Number of Vowels is %d",vows);
		System.out.println();
	}
	
static void constsVsVows() {
	Scanner in=new Scanner(System.in);
	System.out.println("String");
	String str=in.nextLine().replaceAll("[^a-zA-Z]","").toLowerCase();
	String str2=str.replaceAll("[^aeiou]", "");
	System.out.printf("Consanants %d",(str.length()-str2.length()));
	System.out.println();
	System.out.printf("Vowels %d",str2.length());
}

}
