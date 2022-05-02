import java.io.*;
import java.net.*;

public class URLDemo {
    
    public static void main(String[] args) throws IOException {

        URL url = new URL ("https://www.linkedin.com/in/sameer-patil-16022316b/");

        System.out.println("Protocol----->"+url.getProtocol());
        System.out.println("Host----->"+url.getHost());
        System.out.println("Port----->"+url.getPort());
        System.out.println("Path----->"+url.getPath());
    }
}
