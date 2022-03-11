//Paramerterized constructor :
//A constructor with some specified number of parameters is known as a parameterized constructor.

class main
{
	String languages;
	int id;
	String name;
	
	//creting constructor
	
		public main()
		{
			id=15;
			name="lonkarrr";
			
		}
		//creting constructor parameterize
		
		public main(String myname , int myid)
		{
			name= myname;
			id = myid; 
			System.out.println(name + id);
		}
		
	
		public main(String lang)
	{
		languages = lang;
		System.out.println(languages);
	}
	
	
}
public class Parameterized_Constructor {

	public static void main(String[] args)
	{
		main obj = new main();
		
	}

}
