package Home_Tasks;

import java.util.Scanner;

public class StudentMark {
  public static void main(String args[])
  {
	  Scanner in = new Scanner(System.in);
	  System.out.println("Enter student Name:");
	  String name = in.nextLine();
	  System.out.println("Enter mark:");
	  int mark = in.nextInt();
	  System.out.println("---------------");
	  System.out.println("Student Name:" + name);
	  System.out.println("Mark:" +mark);
	  if(mark>=90)
	  {
		  System.out.println("your grade is: A+");
	  }
	  else if(mark>=80)
	  {
		  System.out.println("Your grade is: B");
	  }
	  else if(mark>=70)
	  {
		  System.out.println("Your grade is: C");
	  }
	  else if(mark>=60)
	  {
		  System.out.println("Your grade is: D");
	  }
	  else if(mark>=50)
	  {
		  System.out.println("Your grade is: E");
	  }
	  else
	  {
		  System.out.println("Fail");
	  }
	  
	  
	  
  }
}
