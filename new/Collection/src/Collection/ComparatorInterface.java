package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorInterface {

	public static void main(String[] args)
	{
		List<Integer> values = new ArrayList<> ();
		
		values.add(402);
		values.add(201);
		values.add(1003);
		
		
		Comparator<Integer> c =new Comparator<Integer> ()
				{
						public int compare(Integer i, Integer j)
						{
							if(i%10 > j%10)
								return 1;
							
							else
								return -1;
						}
			
				};
				
				
				Collections.sort(values,c);  
				
				for(Integer o:values)
				{
					System.out.println(o);
				}

		
	}

}
