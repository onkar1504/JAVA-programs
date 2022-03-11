package likedl_ist;

public class LinkedList
{
	Node head;
	
class Node 
	{
		int data;
		Node next;  			 //reference next node

	}

	
	public void insert(int data)
	{
		
		//creating node
		
		Node node =new Node();
		
		node.data=data;
		
		
		if(head==null)
		{
			head =node;
		}
		
		else
		{
			Node n=head;
		}
	
	}


	public void show() 
	{
		Node node =head;
		
		while(node.next!=null)
		{
			System.out.println(node.next);
			node=node.next;
		}
		
	}
}

class Runner 
{

	public static void main(String[] args)
	{
		LinkedList list =new LinkedList();
		
		list.insert(18);
		list.insert(19);
		list.insert(20);
		
		list.show();		

	}

}