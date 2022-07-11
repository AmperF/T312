package workspace;
import java.util.Scanner;
public class Area {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		
		
		System.out.print("Choose the type of object to find area: ");
		System.out.println("\n\n\t1. Rectangle");
		System.out.println("\t2. Square");
		System.out.println("\t3. Triangle");
		System.out.println("\t4. Circle");
		
		
		
		int option=scan.nextInt();
	  if(option==1)
	  {
		  System.out.println("Enter the dimension of the rectangle");
		  int width=scan.nextInt();
		  int length=scan.nextInt();
		  double area=width*length;
		  System.out.println("The area of the rectangle is "+area);  
	  }
	  else if(option==2)
	  {
		  System.out.println("Enter the dimension of the square");
		  int side1=scan.nextInt();
		  int side2=scan.nextInt();
		  double area=side1*side2;
		  System.out.println("The area of the rectangle is "+area);
	  }
	  else if(option==3)
	  {
		  System.out.println("Enter the dimension of the triangle");
		  int base=scan.nextInt();
		  int height=scan.nextInt();
		  double area=1/2*base*height;
		  System.out.println("The area of the rectangle is "+area);
	  }
	  else if(option==4)
	  {
		  System.out.println("Enter the dimension of the circle");
		  double PI=3.142;
		  int radius=scan.nextInt();
		  double area=PI*radius*radius;
		  System.out.println("The area of the circle is "+area);
	  }
	}

}
