package Collection;

import java.util.ArrayList;
import java.util.List;

public class ListinterfaceGenric {

	public static void main(String[] args) 
	{
		List<Integer> values = new ArrayList<> ();
		
		values.add(6);
		values.add(7);
		values.add(8);
//		values.add("lonkar");
		
//		for(Integer o:values)
//		{
//			System.out.println(o);
//		}
//		
		System.out.println("values are"+values);
		
		int num = values.get(0);
		System.out.println("access element"+num);
		
		int remove = values.remove(1);

		System.out.println("remove element"+remove);
		
			


	}

}
