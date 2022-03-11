import java.net.InetAddress;

public class Ipaddress 
{

	public static void main(String[] args) throws Exception
	{
		InetAddress addr = InetAddress.getLocalHost();
		System.out.println("local host address:"+addr.getHostAddress());
		String hostname=addr.getHostName();
		System.out.println("local host name:"+hostname);
		// TODO Auto-generated method stub

	}

}
