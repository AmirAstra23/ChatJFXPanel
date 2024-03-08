
package bounds;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.*;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;


public class Client {

     public static void main(String[] args)  throws IOException {
        Data d = new Data();
        Socket sock = new Socket("localhost", 30333);
        
        BufferedWriter writer = new BufferedWriter(
            new OutputStreamWriter(sock.getOutputStream()));
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(sock.getInputStream()));
        String str;
        String msg;
        //Scanner scan = new Scanner(System.in);
        while(true){
            //System.out.print("> ");
           // str = scan.nextLine();
            //writer.write(d.getString());
           // writer.newLine();
            //writer.flush();
            if("exit".equals(d.getString())){break;}
            msg= reader.readLine();
            d.setString(msg);
            //System.out.println("server responded: " + msg);
        }

    }
}
