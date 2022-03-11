import java.util.Scanner;

public class Switch {

	public static void main(String[] args) 
	{
		System.out.println("enter your age");
		Scanner s=new Scanner(System.in);
		int n =s.nextInt();
		
		switch(n % 2) 
		{
		
		case 18:
			System.out.println("=10");
			break;
		case 20:
			System.out.println("=30");
			break;
		case 40:
			System.out.println("=40");
			break;
		case 60:
			System.out.println("=60");
			break;
			
		case 0:
			System.out.println("even");
			break;
		case 1:
			System.out.println("odd");
			break;
			
		default:
			System.out.println("not above");
		}

	}

}
