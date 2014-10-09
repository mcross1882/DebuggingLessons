
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DebugFileMissingDemo {

    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        String filename = "this-file-does-not-exist.txt";
        
        byte[] buffer = new byte[2048];
        
        FileInputStream stream = new FileInputStream(filename);
        
        stream.read(buffer);
        
        System.out.println("Password: " + new String(buffer));
        
        stream.close();        
    }
}

