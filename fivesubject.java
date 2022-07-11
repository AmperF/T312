package workspace;
import java.util.*;
public class fivesubject {
	String InputPersonalData;
	String Name;
	String address;
	String age;
	String phone;
	
	String StudentGrades;
	String Physics;
	String Chemistry;
	String Biology;
	String Mathematics;
	String Computer;
	void print() {
		
	}
	

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("[Input Personal Data]");
		System.out.println("Enter your name: ");
		String name =in.next();
		System.out.println("Enter your address: ");
		String address =in.next();
		System.out.println("Enter your age: ");
		String age =in.next();
		System.out.println("Enter your phone: ");
		String phone =in.next();
		
		System.out.println("[Student Grades]");
		
		System.out.println("Grade Physics: ");
		int phy = in.nextInt();
		System.out.println("Grade Chemistry: ");
		int che = in.nextInt();
		System.out.println("Grade Biology: ");
		int bio = in.nextInt();
		System.out.println("Grade Mathematics: ");
		int math = in.nextInt();
		System.out.println("Grade Computer: ");
		int comp = in.nextInt();
		
		
		{
			System.out.println("\n[Input Personal Data]");
		}
		{
			System.out.println("Enter your name: "+name);	
		}
		{
			System.out.println("Enter your address: "+address);
		}
		{
			System.out.println("Enter your age: "+age);
		}
		{
			System.out.println("Enter your phone: "+phone);
		}
		
		{
			System.out.println("\n[Student Grades]");
		}
		{
			System.out.println("Physics: "+ phy);
			
		}
		
		{
			System.out.println("Chemistry: "+ che);
			
		}
		
		{
			System.out.println("Biology: "+ bio);
			
		}
		
		{
			System.out.println("Mathematics: "+ math);
			
		}
		
		{
			System.out.println("Computer: "+ comp);
			
		}
		
		
	}	

}
