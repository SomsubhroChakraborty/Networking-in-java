package SocketProgramming;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class SocClient1 {
    public static void main(String[] args) throws Exception
    {
        String ip="127.0.0.1";
        int port =5050;
        Socket s1= new Socket(ip,port);

        String str1 = "Somsubhro 1";
        OutputStreamWriter os = new OutputStreamWriter(s1.getOutputStream());
        PrintWriter out = new PrintWriter(os,true);
        out.println(str1);
    }
}
