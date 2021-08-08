package projects03;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

anagram("post","stop");
	}
	static void anagram(String a,String b) {
		char[] c=a.toCharArray();
		char[] d=b.toCharArray();
		Arrays.sort(c);
		Arrays.sort(d);
		if(Arrays.equals(c, d)) {
			System.out.println(a+" and "+b + " are anagrams.");
		}else {
			System.out.println(a+" and "+b + " are not anagrams.");
		}
	}
}
