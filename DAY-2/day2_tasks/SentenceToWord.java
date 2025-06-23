package day2_tasks;

import java.util.Scanner;

public class SentenceToWord {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a Sentence:");
		String sentence = in.nextLine();
		String[] words =sentence.split(" ");
        System.out.println("Splited words are:");
        for (String string : words) {
			System.out.println(string);
		}
	in.close();
	}
	
}
