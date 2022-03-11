package ex;

class A
{
	protected char c='A';
	char getvalue()
	{
		return c;
	}
}

class B extends A
{
	protected char c='B';
	char getsupervalue()
	{
		return super.c;
	}
}

public class runtimepoly
{
	public static void main(String[] args)
	{
		A a=new B();
		B b = new B();
		System.out.println(a.c+""+a.getvalue()+""+b.getvalue()+""+b.getsupervalue());
	}
}
