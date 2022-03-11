import java.util.Scanner;

//Q: write a program that displays the number of occurence of an element in the array


public class ex3_arraysOccrunce {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		//declare the array size
		int n;
		System.out.print("enter the total elements of array:");
		n=sc.nextInt();//initializng array
		
		//declare array
		
		int arr[] = new int[n];
		System.out.print("enter element in array:");
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		//enter no who want to know how many occrenace
		
		System.out.print("enter no who want to know how many occrenace :");
		
		int element=sc.nextInt();
		
		int occrance=0;
		
		//traverse through map and check occurance
		
		for(int i=0 ; i<n; i++)
		{
			if(element == arr[i])
			{
				occrance++;
			}
			
		}
		System.out.println(element+" occred "+occrance+" times ");
		
	        
	}

}
