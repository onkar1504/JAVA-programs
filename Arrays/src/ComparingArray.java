import java.util.Arrays;

public class ComparingArray {

	public static void main(String[] args) 
	{
		int number1[]= {2,3,4,5};
		int number2[]= {2,3,4,5};
		int number3[]= {2,3,4,5,6};
		
		System.out.println(number1==number2);//false bcaz it compare index address
		System.out.println(Arrays.equals(number1, number2)); //true caz it compare arary elements
		
		
		String[] str1= {"a","b","c"};
		String[] str2 ={"a","b","c"};
		
		System.out.println(str1==str2); //false
		System.out.println(Arrays.equals(str1, str2));//true
		
		String str3= ("hello");
		String str4 =("hello");
		System.out.println(str3.equals(str4));  //true
		 
	}

}
