// Java program to illustrate Client side 
// Implementation using DatagramSocket 
import java.io.IOException; 
import java.net.DatagramPacket; 
import java.net.DatagramSocket; 
import java.net.InetAddress; 
import java.util.Scanner; 
import java.net.SocketException; 	
public class UDPClient 
{ 
	public static void main(String args[]) throws IOException 
	{ 
		Scanner sc = new Scanner(System.in); 
		DatagramSocket ds = new DatagramSocket(); 
		DatagramSocket ds2 = new DatagramSocket(4321); 
		InetAddress ip = InetAddress.getLocalHost(); 
		byte[] receive = new byte[65535]; 
		byte buf[] = null; 
		while (true) 
		{ 
			System.out.print("Client : ");
			String inp = sc.nextLine(); 
			buf = inp.getBytes(); 
			DatagramPacket DpSend = new DatagramPacket(buf, buf.length, ip, 1234); 
			ds.send(DpSend); 
			if (inp.equals("bye")) 
				break; 
			
			DatagramPacket DpReceive = new DatagramPacket(receive, receive.length); 
			ds2.receive(DpReceive); 
			System.out.println("Server :-" + data(receive)); 
			receive = new byte[65535]; 
		} 
	} 
	public static StringBuilder data(byte[] a) 
	{ 
		if (a == null) 
			return null; 
		StringBuilder ret = new StringBuilder(); 
		int i = 0; 
		while (a[i] != 0) 
		{ 
			ret.append((char) a[i]); 
			i++; 
		} 
		return ret; 
	} 
} 
