package operators;

public class assignmentoperator {

	public static void main(String[] args) 
	{
		int x;
		int y =x = 4+1;
		System.out.println(y);	//op 5
		
		int i2 =10;
		i2 = i2+10;
		System.out.println(i2); //op 20
		
		// augmented assignment opeartor
		
		int i1=1;
		i1+=1;
		System.out.println(i1);
		
		i1 *=5+1;          // equivalent to = i1 * (5+1)
		System.out.println(i1); //12
	}

}
