//Write a java program to reset the pattern of a regular expression?

package com.BridgeLabz_Workshop3;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ResetPattern {
	private static String regex="(a*b)(foo)";
	private static String input="aabfooaabfooabfoobbaaa";

	public static void main(String[] args) {
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher=pattern.matcher(input);
		matcher.region(10, 15);
		char[] ch = new char[input.length()];

		System.out.println("before reset, regionStart(): " + matcher.regionStart());
		System.out.println("before reset, regionEnd(): " + matcher.regionEnd());
		int start =matcher.regionStart();
		int end=matcher.regionEnd();
		for(int i=start;i<end;i++){
			ch[i] = input.charAt(i);
			System.out.println("The Regex letters are: " + ch[i] );	
		}

		matcher.reset();
		System.out.println("After reset, regionStart(): " + matcher.regionStart());
		System.out.println("After reset, regionEnd(): " + matcher.regionEnd());
		int start1 =matcher.regionStart();
		int end1=matcher.regionEnd();
		for(int i=start1;i<end1;i++){
			ch[i] = input.charAt(i);
			System.out.println("The Regex letters are: " + ch[i] );	
		}
	}
}
