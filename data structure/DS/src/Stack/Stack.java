package Stack;

public class Stack 
{
	int stack[] = new int[5]; // declare array size 5
	int top = 0;
	
	public void push(int data)
	{
		stack[top]=data;
		top++;
	}
	
	public void show()
	{
		for(int n: stack)
		{
			System.out.print(n+" ");
		}
	}


	public static void main(String[] args)
	{
		Stack nums =new Stack();
		
		nums.push(15);
		nums.push(8);
		nums.push(10);
		
		nums.show();
		
	
	}

}



