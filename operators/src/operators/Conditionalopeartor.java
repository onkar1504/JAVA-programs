package operators;

public class Conditionalopeartor {

	public static void main(String[] args) 
	{
		//boolean-expression ?expression1 : expression2
		
		//max of two nos
		int a=10;
		int b=15;
		int max= a>b ? a : b;
		
		System.out.println(max);//15
		
		int max2= a<b ? a : b;
		System.out.println(max2); //10
		
		//print name if exsist
		
		String name ="";
		System.out.println(name.isEmpty() ? "the name is not valid" : name);
		
		
 
		
		
	}

}
