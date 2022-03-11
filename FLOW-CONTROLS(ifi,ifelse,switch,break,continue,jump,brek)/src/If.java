import java.util.Scanner;

public class If {

	public static void main(String[] args)
	{
			int number= -2;
			
			if(number > 0)
			{
				System.out.println("greter");
			}
			
			else if(number == 0)
			{
				System.out.print("equal");
			}
			
			System.out.println("no number ");
		
			//example even odd num
			System.out.println("enter the no:");
			Scanner s =new Scanner(System.in);
			int n = s.nextInt();
			
			if( n %2==0)
			{
				System.out.println("its even num ");
			}
			
			if( !(n %2== 0))
			{
				System.out.println("its odd num ");
			}
			
			
	}

}
