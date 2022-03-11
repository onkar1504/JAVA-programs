import java.util.*;
import java.io.*;
public class ArrayListt
{

	public static void main(String[] args) 
	{
		// Creating an Array of string type
			ArrayList<String> fruits =new ArrayList<>();

	    // Adding elements to ArrayList
	    // Cutom inpus
			
			fruits.add("apple");
			fruits.add("banana");
			fruits.add("mango");
			
			System.out.println(fruits);
			
			// Here we are mentioning the index
	        // at which it is to be added
			
			fruits.add(0 ,"grapes");
			System.out.println(fruits);
			
			// Printing all the elements in an ArrayList
	        System.out.println();
			
			
	}
	

}
