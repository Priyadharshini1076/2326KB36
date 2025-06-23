package day2_tasks;

import java.util.Scanner;

public class VowelsConsonants {
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a String:");
		int vowels=0,consonants=0;
		String str=in.nextLine().toLowerCase();
		for (int i = 0; i < str.length(); i++) 
		{
	        char ch = str.charAt(i);

	        if (ch >= 'a' && ch <= 'z')
	        {
	            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
	            {
	                vowels++;
	            } 
	            else
	            {
	                consonants++;
	            }
	        }
	    }
		System.out.println("Vowels: " + vowels);
	    System.out.println("Consonants: " + consonants);
	    in.close();
	}
}
