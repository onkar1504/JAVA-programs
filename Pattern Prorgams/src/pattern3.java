//	  *****
//    ****
//    ***
//    **
//    *

public class pattern3
{

	public static void main(String[] args) 
	{
		int n =5;
		
		for (int row = 1 ; row <= n ; row++)
		{
			for (int column = n ; column >= row; column--)
			{
				System.out.print("*");
			}
			
			//when one row is printed , we need to add new line
			
			System.out.println();
		}

	}

}
