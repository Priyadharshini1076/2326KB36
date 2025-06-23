package day2_tasks;

import java.util.Scanner;

public class StringAnalyzer {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a String:");
		String str=in.nextLine();
		String[] word = str.split(" ");
		int word_count=word.length;
		System.out.println("No of words in "+str +" are:" +word_count );
		String[] ch = str.split("");
		int char_count=str.replace(" ","").length();
		System.out.println("No of charecters in "+str +" are:" +char_count );
		String longest="";
		for (String string : word) {
			if(string.length() > longest.length())
			{
				longest=string;
			}
		}
		int a = longest.length();
		System.out.println("Longest Word is:"+longest);
		System.out.println("Longest word count is:" +a);
		String reverse=new StringBuilder(str).reverse().toString();
		System.out.println("Reversed String is :"+reverse);
	}

}
