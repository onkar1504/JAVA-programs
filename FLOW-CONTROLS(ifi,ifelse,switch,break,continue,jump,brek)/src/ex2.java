import java.util.Scanner;

//Q . developing luckey number
public class ex2 {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter four digit number");
		int n  = s.nextInt();
		
		if(!(n > 999  && n <10000))
		{
			System.out.println("num is not fourth digit number");
		}
		else
		{
			//ABCD
			int fourthdigit = n % 10 ;  //d
			int thirddigit = ( n/10) %10 ; //abc%10 =c
			int seconddigit =(n/100)%10 ; 	//ab %10 =b
			int firstdigit =(n/1000)%10 ;   //a%10 =a
			
			if(firstdigit + seconddigit == thirddigit + fourthdigit)
				System.out.println("luckey number");
			else
				System.out.println("unluckey number");
		}
		
		
			
	}
	
	

}
