
import java.net.*;
import java.io.IOException;

public class UDPClient {

	public static void main(String[] args) throws IOException {
		
		DatagramSocket ds= new DatagramSocket();

		String msg="\033[1;92m"+"Hola, Como estas ?";
		
		InetAddress ip=InetAddress.getByName("localhost");
		DatagramPacket dp=new DatagramPacket(msg.getBytes(),msg.length(),ip,37);
		ds.send(dp);
		
		ds.close();
	}

}
