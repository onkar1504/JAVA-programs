//* 
//* * 
//* * * 
//* * * * 
public class Pattern2 
{

	public static void main(String[] args) 
	{
		int n =4;
		
		for (int row = 1 ; row <= n ; row++)
		{
			for (int column = 1 ; column <= row ; column++)
			{
				System.out.print("* ");
			}
			
			//when one row is printed , we need to add new line
			
			System.out.println();
		}
		
	}

}
