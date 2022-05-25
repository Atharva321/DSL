import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.Socket;

public class FileClient {
    public static void main(String[] argv) throws Exception{
        byte []b = new byte[76];
        Socket sr = new Socket("localhost", 6777);
        InputStream is= sr.getInputStream();
        FileOutputStream fr = new FileOutputStream("Output.txt");
        is.read(b, 0, b.length);
        fr.write(b, 0, b.length);
    }
}
