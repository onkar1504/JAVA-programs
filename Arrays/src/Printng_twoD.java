
public class Printng_twoD {

	public static void main(String[] args)
	{
		 int[][] arr = 
			 {
					 { 3,5,7 }, 
					 { 10,2,9 }
		 	};
		  
	        for (int i = 0; i < 3; i++)  //outer loops for columns 
	       {
	            
	        	for (int j = 0; j < 2; j++) //innner loops for rows
	            {
	                System.out.print(arr[j][i] + " ");
	            }
	  
	           System.out.println();
	       }
	  
	        
	        
	        System.out.println("********another variation below**********");
	   
	        	int [][] integers= 
	        
	       {
	        		{3,5,7}, 
	        		{10,2,9}
	        	};
	        	
	        		//print 1 column
	      		System.out.print(integers[0][0]+" ");
	      		System.out.print(integers[1][0]+" ");
	      		
	      		
	       }

	
	 
	 	
	 	
		{	
			System.out.println("********another variation belowww**********");
				int[][] array = 
					{
	 					{3,5,7},
	 					{10,2,9}
	 				};
	 	
				for(int i=0 ; i<array.length ;i++)
				{
					for(int j = 0 ; j < array[i].length;j++)
					{
							System.out.print(array[j][i]);
					}
					
//					System.out.println()j
					}
}	
	   
}

