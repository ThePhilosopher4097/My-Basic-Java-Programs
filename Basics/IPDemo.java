
import java.io.*;
import java.net.*;

public class IPDemo {

    public static void main(String[] args) throws IOException {
        
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter Resource URL: ");
       String Web = br.readLine();
       InetAddress in = InetAddress.getByName(Web);
       System.out.println("IP Address: "+in+"\n");
       System.out.println("Local Machine info: "+InetAddress.getLocalHost());

       InetAddress address_1 = InetAddress.getByName("mitaoe.ac.in");
       InetAddress address_2 = InetAddress.getByName("192.168.1.1");
       System.out.println("Comparision of address1 and address2: "+address_1.equals(address_2));

       InetAddress[] address_3 = InetAddress.getAllByName(Web);
       System.out.println("Result of getAllByName"+address_3);
    }
}
