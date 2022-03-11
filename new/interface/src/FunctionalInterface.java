//functional inerface - lambda expresssion

interface Abcd
{
	 void display();           //declared here
}

public class FunctionalInterface 
{

	public static void main(String[] args) 
	
   {
		Abcd obj =() ->
							System.out.println("i can i will");
						

							obj.display();
							
							
    }
}
						
		


