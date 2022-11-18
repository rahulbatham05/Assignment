package assignment2;

import java.util.Scanner;

public class Student {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the number of Student");
		int count=sc.nextInt();
		String [] SName=new String [count];
		String [] SEmail=new String [count];
		String [] SPhone=new String [count];
		String [] SAddress=new String [count];
		String [] SStatus=new String [count];
		
		
		for(int i=0; i<count; i++)
		{
			System.out.println("Please enter the name");
			 SName[i]=sc.next();
			 System.out.println("Please enter the Email");
			 SEmail[i]=sc.next();
			 System.out.println("Please enter the Phone");
			 SPhone[i]=sc.next();
			 System.out.println("Please enter the Address");
			 SAddress[i]=sc.next();
			 System.out.println("Please enter the Staus");
			 SStatus[i]=sc.next();
		}
		
		System.out.println("Please enter which student details you are looking");
		int details=sc.nextInt();
		
		System.out.println("Name "+SName[details]);
		System.out.println("Email "+SEmail[details]);
		System.out.println("Phone "+SPhone[details]);
		System.out.println("Address "+SAddress[details]);
		System.out.println("Status "+SStatus[details]);
		
		sc.close();

	}

}
