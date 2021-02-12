import java.util.*;
import java.net.*;
import java.io.*;
public class Server
{
		public static void main(String args[]) throws java.io.IOException
		{
			ServerSocket ss=new ServerSocket(4097);
			Socket s=ss.accept();
			String j;
			Scanner sc=new Scanner(System.in);
			System.out.println("Client Sameer is Online");
			String str;
			do
			{
			InputStreamReader in=new InputStreamReader(s.getInputStream());
			BufferedReader bf=new BufferedReader(in);
			str=bf.readLine();
			System.out.println("Sam : "+str);
			
			PrintWriter pr=new PrintWriter(s.getOutputStream());
			System.out.println("Server : ");
			j=sc.nextLine();
			pr.println(" "+j);
			pr.flush();
			}while(str!="Exit");
		}
}