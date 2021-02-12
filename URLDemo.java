import java.io.*;
import java.net.*;
import java.util.*;
public class URLDemo{
	public static void main(String args[]){
		try{
		URL u=new  URL("http://abmspcoerpune.org:80");
		URLConnection uc=u.openConnection();
		InetAddress in=InetAddress.getByName("www.google.com");
		System.out.println("Host Name : "+in.getHostName()+" PORT : "+u.getPort()+" Protocol : "+u.getProtocol());
		System.out.println("Remote Host Address : "+in.getHostAddress());
		System.out.println("Content type : "+uc.getContentType());
		InputStream is=uc.getInputStream();
		int i,k=0;  
		while((i=is.read())!=-1 && k!=200){  
			System.out.print((char)i);
			k++;  
		} 
		}catch(Exception e){}    	
		}
}
