//	  1
//    1 2
//    1 2 3
//    1 2 3 4
//    1 2 3 4 5

public class Pattter4 {

	public static void main(String[] args) 
	{
		int n = 5;
		
		for (int row=1; row <= n ; row++)
		{
			for (int column = 1 ; column <= row ; column++ )
			{
				System.out.print(column);
			}
			
			System.out.println();
		}

	}

}
