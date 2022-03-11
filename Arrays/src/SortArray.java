import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) 
	{
		//sort(): sort the whole array 
		int[] numbers = {3,-0,9,1,2};
		Arrays.sort(numbers); //{-0 1 2 3 9}

		System.out.println(Arrays.binarySearch(numbers, 2));
		System.out.println(Arrays.binarySearch(numbers, 9));
	}

}
