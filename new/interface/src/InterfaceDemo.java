abstract class Writer
{
	public void write()
	{
		
	}
	
}

class Pen extends Writer
{
	public void write()
	{
		System.out.print("in pen");
	}
}

class Pencil extends Writer
{ 
	public void write()
	{
		System.out.print("in pencil");
	}
}

class Kit
{
	public void dosomething(Writer p)
	{
		p.write();
	}
}


public class InterfaceDemo {

	public static void main(String[] args) 
	{
			Kit k=new Kit();
			Writer p=new Pen();
			
			Writer pc=new Pencil();
			
			k.dosomething(p);
			k.dosomething(pc);
	
	}

}
