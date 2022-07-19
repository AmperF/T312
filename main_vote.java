package Package_1;
import java.util.Scanner;
public class main_vote {

	public static void main(String[] args) {
	
		
	Scanner input = new Scanner (System.in);	
		
		String name;
		int voterId;
		int age;
		
		
		System.out.println("Input Name: ");
		name = input.next();
		
		System.out.println("Input Age: ");
		age = input.nextInt();
		
		System.out.println("Input Voter ID: ");
		voterId = input.nextInt();
		
		
		if(age>=18)
		{
			System.out.print("\nYou Eligible to Vote! Have a Nice Day!");
		}
		else
		{
			System.out.print("\nYou're Not Eligible to Vote!");
		}
		
		// Display results and user input.
				System.out.println();
				System.out.println("\n[INFO]");
				System.out.println("Input Name: " + name);
				System.out.println("Input Age: " + age);
				System.out.println("Input Voter Id: " + voterId);
				
		
		

	}

}
