/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leonardo Araujo
 */

import java.io.*;
import java.net.*;
import java.util.StringTokenizer;

public class WebServe {
    Socket soc;
    OutputStream os;
    DataInputStream is;
    String resource;
    
    public static void main(String args[]) throws IOException{
        ServerSocket s = new ServerSocket(8080);
        WebServe w = new WebServe(s.accept());
        w.getRequest();
        w.returnResponse();
    }
    
    WebServe(Socket s) throws IOException{
        soc = s;
        os = soc.getOutputStream();
        is = new DataInputStream(soc.getInputStream());
    }
    
    public void getRequest() throws IOException{
        String message;
        while((message = is.readLine()) != null){
            if(message.equals("")){
                break;
            }
            System.err.println(message);
            StringTokenizer t = new StringTokenizer(message);
            String token = t.nextToken();
            if(token.equals("GET"))
                resource = t.nextToken();
        }
    }
    
    public void returnResponse() throws FileNotFoundException, IOException{
        int c;
        FileInputStream f = new FileInputStream("." + resource);
        while((c = f.read()) != -1){
            os.write(c);            
        }
        f.close();
    }
}
