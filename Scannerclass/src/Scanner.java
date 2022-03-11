import java.io.InputStream;


public class Scanner {

	public Scanner(InputStream in) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in); //sys.in points to keyboard
		System.out.println("enter your name:");
		System.out.println("your name is"+ input.next());

	}

}
