//swap two no without temp
package introduction;

public class Swap2
{

	public static void main(String[] args) 
	{
		int no1=5;
		int no2=2;
		
		//before swapping
		
		System.out.println("first no:"+no1);
		
		System.out.println("second no:"+no2);
		
		no1=no1-no2;  // no1= 5 -2 =3
		
		no2=no1 +no2;  //no2= 3 + 2 =5
		 
		
		no1=no2-no1;   //  no1 = no2- no1 = 5-3 =2

		System.out.println("--after swapping--");
		
		System.out.println("first no:"+no1);
		
		System.out.println("second no:"+no2);
		

	}

}
