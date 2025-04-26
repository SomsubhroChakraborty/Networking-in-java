package SocketProgramming;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
public class SocClient {
    public static void main(String[] args) throws Exception
    {
        
            String ip ="localhost";
            int port =5050;
            Socket s= new Socket(ip,port);
        
            String str = "Somsubhro Chakraborty";
            OutputStreamWriter os = new OutputStreamWriter(s.getOutputStream());
            PrintWriter out = new PrintWriter(os,true);
            out.println(str);
            System.out.println("message is sent");
        
    }
}
