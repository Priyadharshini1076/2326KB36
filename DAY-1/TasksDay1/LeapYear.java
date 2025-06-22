package TasksDay1;
/*
 * leap year must be divisible by 4
 * if the year divisible by 4 it must be divisible by 400 and not divisible bt 100
 * if the condition is true year is a leap year
 * ex: 2000--div by 4 and also div by 400 and 100 so is a leap year
 * 1990--not div by 4 so it is not a leap year*/

import java.util.Scanner;

public class LeapYear {

	public int operation(int year) {
		if((year%4==0) && (year%400==0 || year%100 !=0))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter year:");
		int year = in.nextInt();
		LeapYear yr = new LeapYear();
		int result = yr.operation(year);
		if(result==1)
		{
			System.out.println( year + "is a leap year");
		}
		else
		{
			System.out.println( year + "is not a leap year");
		}
	}

}