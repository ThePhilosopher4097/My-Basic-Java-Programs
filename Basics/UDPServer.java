
import java.net.*;
import java.io.IOException;

public class UDPServer {

	public static void main(String[] args) throws IOException {
		DatagramSocket ds= new DatagramSocket(37);
		
		byte [] temp=new byte[1000];//buffer to receive msg from client
		
		DatagramPacket dp=new DatagramPacket(temp,1000);
		
		ds.receive(dp);
		
		String str=new String(temp);
		System.out.println("\033[0;93m"+"Client Message : "+str);
		
		ds.close();

	}

}