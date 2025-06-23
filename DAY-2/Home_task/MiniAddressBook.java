package Home_task;

import java.util.Scanner;


	public class MiniAddressBook {
		  public static void main(String args[])
		  {
			  Scanner in = new Scanner(System.in);
			  final int count=3;
			  String[] name = new String[count];
			  String[] phone = new String[count];
			  String[] email = new String[count];
			  System.out.println("Enter detail upto "+count+" contacts");
			  for(int i=0;i<count;i++)
			  {
				  System.out.println("\nContact "+(i+1)+" :");
				  System.out.println("Name: ");
				  name[i]=in.nextLine();
				  System.out.println("Phone No: ");
				  phone[i]=in.nextLine();
				  System.out.println("Email: ");
				  email[i]=in.nextLine();
			  }
			  System.out.println("---Mini Address Book---");
			  for(int i=0;i<count;i++)
			  {
				  System.out.println("Name: "+name[i]);
				  System.out.println("Phone No: "+phone[i]);
				  System.out.println("Email: "+email[i]);
				  System.out.println("\n");
			  }
			  in.close();
		  }
	}
