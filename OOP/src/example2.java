//Java Rock Paper Scissors/Snake, Water, Gun: In this video, we will see how to create a console game in Java.
//This video will teach you the concepts of if else and logic development in programming.

import java.util.Scanner;
import java.util.Random;

public class example2 {

	public static void main(String[] args) 
	{
		//0 for rock
		//1 for paper
		//2 for seasor
		
		Scanner sc =new Scanner(System.in);
		System.out.print("enter 0 for rock - enter 1 for paper - enter 2 for seasor :" );
		int userinput = sc.nextInt();
		
		Random ran = new Random();
		int computerinput = ran.nextInt(3);
		
		if(userinput == computerinput)
		{
			System.out.println("draw");
		}

		else if(userinput==0 && computerinput== 2 || userinput==1 && computerinput== 0 
				|| userinput==2&& computerinput== 1 )
		{
			System.out.println("yow win");
		}
		else
		{
			System.out.println("computer win");
		}
		System.out.println("computer choice"+computerinput);
		
		if(computerinput==0)
		{
			System.out.println("computer choice : rock");
		}
		else if (computerinput==1)
		{
			System.out.println("computer choice : paper");
		}
		else if (computerinput==2)
		{
			System.out.println("computer choice : seasor");
		}
		
	}

}
