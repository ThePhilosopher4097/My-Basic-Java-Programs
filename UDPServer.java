// Java program to illustrate Server side 
// Implementation using DatagramSocket 
import java.io.IOException; 
import java.util.Scanner;
import java.net.DatagramPacket; 
import java.net.DatagramSocket; 
import java.net.InetAddress; 
import java.net.SocketException; 

public class UDPServer 
{ 
	public static void main(String[] args) throws IOException 
	{ 
		// Step 1 : Create a socket to listen at port 1234 
		Scanner sc = new Scanner(System.in); 
		DatagramSocket ds = new DatagramSocket(1234); 
		DatagramSocket ds2 = new DatagramSocket(); 
		InetAddress ip = InetAddress.getLocalHost(); 
		byte[] receive = new byte[65535]; 
		byte buf[] = null;
		DatagramPacket DpReceive = null; 
		while (true) 
		{ 
			DpReceive = new DatagramPacket(receive, receive.length); 
			ds.receive(DpReceive);
			System.out.println("Client:-" + data(receive));
			if (data(receive).toString().equals("bye")) 
			{ 
				System.out.println("Client sent bye.....EXITING"); 
				break; 
			} 
			receive = new byte[65535]; 

			System.out.print("Server : ");
			String inp = sc.nextLine(); 
			buf = inp.getBytes(); 
			DatagramPacket DpSend = new DatagramPacket(buf, buf.length, ip, 4321); 
			ds2.send(DpSend); 
		} 
	} 

	// A utility method to convert the byte array 
	// data into a string representation. 
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
