
public class Variable_Arguments
{

	public static void main(String[] args) 
	{
			System.out.println(sum(2,3,4));
			System.out.println(sum(2,-3,4));

	}
	
	private static int sum(int...number) 
	{
		int sum=0;
		
		for(int i=0; i<number.length ;i++)
		
			sum +=number[i];
		
		return sum;
	}

}
