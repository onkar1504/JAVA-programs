import java.util.Arrays;
import java.util.Scanner;

public class Ex1_Arrays {

	public static void main(String[] args) 
	{
		Scanner input =new Scanner(System.in);
		
		System.out.print("how many elements ? (max is 20):");
		
		int n=input.nextInt();
		
		while(n>20 || n<=0)
		{
			System.out.println("invalid no , try again");
			n=input.nextInt();
		}
		
		int[] numbers = new int[n];
		fillarrayofintegers(numbers);
		printarrayofintegers(numbers);
		
		//calulating sum , prduct , average : this is ex2
		
		int sum=0;
		int product=1;
		double average;
		
		for(int i =0;i<numbers.length;i++)
		{
			sum+=numbers[i];
			product*=numbers[i];
		}
		
		average=sum/numbers.length;
		System.out.print("sum ="+ sum +",product="+product +",average="+average);
		
	}

	private static void printarrayofintegers(int[] numbers)
	{
		System.out.print("the elements are:");
		System.out.println(Arrays.toString(numbers));
		
	}

	private static void fillarrayofintegers(int[] numbers) 
	{
		Scanner input =new Scanner(System.in);
		
		for(int i=0 ; i<numbers.length;i++)
			numbers[i]=input.nextInt();
	}

	
}
