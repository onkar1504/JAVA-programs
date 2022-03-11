interface bicycle
{
	int a = 45; //prorperty canit override  //final int a =45
	void applaybreak(int decrement);
	void speedup(int increment);
	
}
interface hornbicycle
{
	void hornbicycle();
	void blowhorn();
}

class Aonecycle implements bicycle , hornbicycle
{
//	public int x=45;  garaj nhi
	
	@Override
	public void applaybreak(int decrement) 
	{
		System.out.println("applaying break");
	}

	@Override
	public void speedup(int increment)
	{
		System.out.println("sppedd up");
	}

	// 2 interface methods
	@Override
	public void hornbicycle() {
		
		System.out.println("horn ok");
	}

	@Override
	public void blowhorn() {
		
		System.out.println(" please");
	}
	
}
public class Interface 
{

	public static void main(String[] args)
	{
		Aonecycle obj = new Aonecycle();
		obj.applaybreak(1);
		System.out.println(obj.a);  // 45 output  you cacreate prorperties in interfaces
		
		//u canit modify propeerties in interface as they are final
//		obj.a=222;
//		System.out.println(obj.a);
		
		obj.blowhorn();  // 2interface method accesing
		obj.hornbicycle();
		
		// we can crete obj by interface name
		
		bicycle obj2 = new Aonecycle();
		obj2.applaybreak(0);
	}

}
