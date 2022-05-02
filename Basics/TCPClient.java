
import java.io.*;
import java.net.*;

public class TCPClient {
     
    public static void main(String[] args) throws IOException {

        Socket s = new Socket("localhost", 1234);
        System.out.println("\nClient Ready....");
        System.out.println("\n********************* Private Chat ************************\n");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        DataInputStream dis = new DataInputStream(s.getInputStream());
        while(true){
            try{
                //Read Client message
                System.out.print("\033[0;93m"+"\nType message:  ");
                String str = br.readLine();            
                dos.writeUTF(str);
                if(str.equals("exit"))
                    break;

                //Send Server message    
                str = (String)dis.readUTF();
                System.out.println("\033[1;92m"+"\nServer : "+str);
                if(str.equals("exit"))
                    break;
            }catch(IOException e){
                System.out.println("Oops...something went wrong !");
            }
        }
        br.close();
        dos.close();
        dis.close();
        s.close();
    }
}
