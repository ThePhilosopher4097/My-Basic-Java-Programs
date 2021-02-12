import java.util.*;
import java.net.*;
import java.io.*;
public class Client
{
		public static void main(String args[]) throws java.io.IOException
		{
			Socket s=new Socket("localhost",4097);
			Scanner sc2=new Scanner(System.in);
			PrintWriter pr=new PrintWriter(s.getOutputStream());
			String k;
			String str;
			do
			{
			System.out.println("Sam : ");
			k=sc2.nextLine();
			pr.println(" "+k);
			pr.flush();
			
			InputStreamReader in=new InputStreamReader(s.getInputStream());
			BufferedReader bf=new BufferedReader(in);
			str=bf.readLine();
			System.out.println("Server : "+str);
			}while(str!="Exit");
		}
}