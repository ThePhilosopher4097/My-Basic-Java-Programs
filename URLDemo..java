import java.io.*;
import java.net.*;
import java.util.*;
public class URLDemo{
	public static void main(String args[]){
		try{
		URL u=new  URL("http://a:80");
		URLConnection uc=u.getConnection();
		InetAddress i=InetAddress.getByName("www.google.com");
		System.out.println("Host Name : "+i.getHostName());
		System.out.println("Remote Host Address : "+i.getHostAddress());
		System.out.println("Content type : ");
		InputStream is=uc.getInputStream();
		int i;  
		while((i=is.read())!=-1){  
			System.out.print((char)i);  
		} 
		}catch(Exception e){}    	
		}
}
