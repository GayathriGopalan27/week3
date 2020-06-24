package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class DupChar {
	
	public static void main(String[] args) {
		String input ="PayPal India";
		char[] ch = input.toCharArray();
		Set<Character> charset = new LinkedHashSet<Character>();
		Set<Character> dupCharSet = new LinkedHashSet<Character>();
		System.out.println(ch.length);
		System.out.println(ch);
		for (int i =0; i<ch.length; i++)
		{
			if (charset.add(ch[i])==false)
			{
				dupCharSet.add(ch[i]);
		}
		
	}
		System.out.println("Initial char set "+charset);

		System.out.println("Duplicate characters "+dupCharSet);
		charset.removeAll(dupCharSet);
		System.out.println("after removing duplicate " +charset);
		
		
		for (Character eachchar : charset) {
			if (eachchar != ' ') {
				System.out.println(eachchar);
			}
			
		}
		
}
}
