import java.util.*;
import java.net.*;
import java.io.*;
public class Server
{
		public static void main(String args[]) throws java.io.IOException
		{
			System.out.println("Server is Listening !");
			try
			{
			new Server();
			ServerSocket ss=new ServerSocket(4097);
			Socket s=ss.accept();
			String j="";
			InetAddress ad=s.getInetAddress();
			System.out.println("Client Connected : "+ad.getHostName()+" "+ad.getHostAddress());
			System.out.println("Client Sameer is Online");
			Scanner sc=new Scanner(System.in);
			String str;
			do
			{
			InputStreamReader in=new InputStreamReader(s.getInputStream());
			BufferedReader bf=new BufferedReader(in);
			str=bf.readLine();
			//if(str.equals("Exit"))	System.out.println("\nClient Closed Connection !");
			System.out.println("Sam : "+str);
			
			PrintWriter pr=new PrintWriter(s.getOutputStream());
			System.out.print("Server : ");
			j=sc.nextLine();
			pr.println(" "+j);
			pr.flush();
			}while(str!="Exit");
			}catch(Exception e)
				{
						System.out.println("Exit !");
				}
		}
}