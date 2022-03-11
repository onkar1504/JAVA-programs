import java.util.Arrays;

public class CreatingArray {

	public static void main(String[] args)
	{
		int[] numbers = {5,4,3,2,1};
		
		
		
		for(int i=0 ;i<numbers.length;i++)
		{
			System.out.println(numbers[i]+" ");
		}

		//revers order
		System.out.println("**********in reverse order********");
		for(int i=numbers.length -1 ;i>=0;i--)
		{
			System.out.println(numbers[i]);
		}
	}

}
//print whole array
 
//op = 5 4 3 2 1 