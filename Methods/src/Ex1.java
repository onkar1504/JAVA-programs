import java.util.Scanner;

//Q.Writing a method that gets the name of the user and a method that gets the age of the user.
public class Ex1 {

	public static void main(String[] args) 
	{
		System.out.println("enter ur name and age");
		System.out.println("ur name and age is:"+getName()+getname2()+getage());

	}
	public static String getName()
	{
		Scanner input =new Scanner(System.in);
		
		String name =input.nextLine();
		
		return name;
	}
	//another way 
	public static String getname2()
	{
		return new Scanner(System.in).nextLine();
	}
	
	public static double getage()
	{
		return new Scanner(System.in).nextDouble();
	}
	
}
