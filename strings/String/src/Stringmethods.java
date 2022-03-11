
public class Stringmethods 
{

	public static void main(String[] args) 
	{
		String name  ="OnkaR";
		
		//length()=return string length
		int value = name.length();
		System.out.println(value);  //5
		
		//tolower() = return small case
		String lstring =name.toLowerCase();
		System.out.println(lstring);		//onkar
		
		//toupper=  return capital
		String upstring =name.toUpperCase();
		System.out.println(upstring);			//ONKAR
		
		// trim method = remove spaces
		String trime = "     onakkkkr "; 
		System.out.println(trime.trim());
		
		//substring = jo indexno dily tithun survat te shevat paryant
		String substring = "kondhwa";
		System.out.println(substring.substring(2));  //ndhwa
		
		System.out.println(substring.substring(1,4));  //ond 1 start index 4 stop index chya adicha

       // replace method = return new string after replacing characters
		String repl= "abcdef";
		System.out.println(repl.replace('a','z'));	//zbcdef
		
		//startwith = it return boolean
		
		String strwith ="gaurva ";
		System.out.println(strwith.startsWith("ga"));//true
		System.out.println(strwith.startsWith("aa"));//false
		
		//endswith
		String nammee ="ooookkkkkrrr";
		System.out.println(nammee.endsWith("r")); //true
		
		//charAt = return charcter at given index
		String name1 ="ooookkkkkrrr";
		System.out.println(name1.charAt(4)); //k
		
		//indexof = return the position no of that caharacter
		String name2 ="pune";
		System.out.println(name2.indexOf("p"));//0
		
		//startindex
		String name3 ="mumbai";
		System.out.println(name3.indexOf('u', 3));//0
		
		//lastindex
		System.out.println(name3.lastIndexOf("a"));  //4
	}

}
