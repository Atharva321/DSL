import java.io.*;
import java.net.*;

public class FileServer{
    public static void main(String[] args) throws Exception{
        ServerSocket s = new ServerSocket(6777);
        Socket sr = s.accept();
        FileInputStream fr = new FileInputStream("abc.txt");
        byte b[] = new byte[76];
        fr.read(b,0,b.length);
        OutputStream os = sr.getOutputStream();
        os.write(b,0,b.length);
    }
}