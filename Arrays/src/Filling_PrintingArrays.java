import java.util.Arrays;

public class Filling_PrintingArrays 
{

	public static void main(String[] args) 
	{
		//fill(arrayname , value): fill whole array
		
		int[] num1 =new int[5]; //{0 0 0 0 0}
		Arrays.fill(num1, 3);
		System.out.println(Arrays.toString(num1)); // op [3, 3, 3, 3, 3]
		
		//fill(arrayname , fromindex ,toindex ,value)
		int[] num2 =new int[5];
		Arrays.fill(num2, 0, 3, 4); 
		System.out.println(Arrays.toString(num2)); // op- [4, 4, 4, 0, 0]
		
		
		String[] str1= new String[3];
		Arrays.fill(str1,"hello");  

		System.out.println(Arrays.toString(str1));//[hello, hello, hello]

	}

}
