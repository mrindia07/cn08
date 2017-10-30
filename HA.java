import java.net.*;
public class HA
{
public static void main (String[] args)
{
try
{
InetAddress[] address =
InetAddress.getAllByName("www.github.com");
for (int i = 0; i<address.length; i++)
{
System.out.println(address[i]);
}

InetAddress thisHost=InetAddress.getLocalHost();
System.out.println("\n Address:"+thisHost);
String localhost = thisHost.getHostName();
String localip = thisHost.getHostAddress();
System.out.println("\n Host:"+localhost);
System.out.println("\n Address:"+localip);
}
catch (UnknownHostException e)
{
System.out.println("Could not find address");
}
}
}
