
import java.io.*;
import java.net.*;

public class TCPServer {
    
    public static void main(String[] args) throws IOException {

        ServerSocket ss = new ServerSocket(1234);
        System.out.println("\n********************* Server is on ************************\n");
        Socket s = ss.accept();

        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            try{
                //Read Client message
                String str = (String)dis.readUTF();
                System.out.println("\nClient : "+str);
                if(str.equals("exit"))
                    break;

                //Send Server message    
                System.out.print("\nType Reply:  ");
                str = br.readLine();
                dos.writeUTF(str);
                if(str.equals("exit"))
                    break;
            }catch(IOException e){
                System.out.println("Oops...something went wrong !");
            }
        }
        dis.close();
        dos.close();
        s.close();
        ss.close();
    }
}
