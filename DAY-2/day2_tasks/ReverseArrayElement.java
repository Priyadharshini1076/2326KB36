package day2_tasks;

import java.util.Scanner;

public class ReverseArrayElement {
	public static void main(String[] args)
	{
		  Scanner in = new Scanner(System.in);
		  System.out.println("Enter the number of element:");
		  int num = in.nextInt();
		  int[] numbers = new int[num];
		  System.out.println("Enter " + num + " numbers");
		  for(int i=0;i<num;i++)
		  {
			  numbers[i]=in.nextInt();
		  }
		  System.out.println("reversed array");
		  for(int i=num-1;i>=0;i--)
		  {
			  System.out.print(numbers[i] + "  ");
		  }
		  in.close();
		}
}
