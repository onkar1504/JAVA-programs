package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collecionclass {

	public static void main(String[] args)
	{
		List<Integer> values = new ArrayList<> ();
		
		values.add(4);
		values.add(2);
		values.add(1);
		
		Collections.sort(values);  //sorted in ascending ordder
		Collections.reverse(values);  //soreted in descending order
		Collections.shuffle(values);   //every time values shuffles
		
		for(Integer o:values)
		{
			System.out.println(o);
		}

	}

}
