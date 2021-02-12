import java.io.*;
import java.net.*;
public class ChatDemo{
	public static int sport = 888;
	public static int cport = 889;
	public static DatagramSocket ds;
	public static int buffer_size = 1024;
	public static byte[] buffer = new byte[buffer_size];
	public static void main(String args[]) throws Exception{
		if(args.length==1){
			ds=new DatagramSocket(sport);
			Server();
		}
		else{
			ds=new  DatagramSocket(cport);
			Client();
		}
	}
	public static void Server() throws Exception{
		int pos=0;
		while(true){
			int c=System.in.read();
			switch(c){
				case -1 :	System.out.println("\nServer Quits");	return;
				case '\r' : break;
				case '\n' : 	ds.send(new DatagramPacket(buffer,pos,InetAddress.getLocalHost(),cport));
				pos=0;
			default : buffer[pos++]=(byte)c;
			}
		}
	}
	public static void Client() throws Exception{
		while(true){
			DatagramPacket dp= new DatagramPacket(buffer,buffer.length);
			ds.receive(dp);
			System.out.println("new String(dp.gatData(),0,dp.getLength())");
		}
	}
}