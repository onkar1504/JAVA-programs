package Collection;

import java.util.ArrayList;
import java.util.List;


public class Listinterface {

	public static void main(String[] args) 
	{
		List values = new ArrayList();
		
		values.add(6);
		values.add(7);
		values.add(8);
		values.add("lonkar");
		
		for(Object o:values)
		{
			System.out.println(o);
		}
		
		

	}

}
