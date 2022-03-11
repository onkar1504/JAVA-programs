//Q. print even numbers between 1 to 100 in incresing and decresing  oreder
package loops;

public class Ex1loop 
{

	public static void main(String[] args) 
	{
		
		//even numnes in incresing  orders 
		for(int i =1; i<=100 ;i++)
		{
			if(i %2 ==0)
				System.out.print(" "+i);
		}
		
		
		//even numnes in decresing orders 
		for(int j=100 ; j>=1 ;j--)
		{
			if(j %2 ==0)
				System.out.println(" "+j);
		}
		
	}

}
