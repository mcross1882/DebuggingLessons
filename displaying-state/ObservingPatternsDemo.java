
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class ObservingPatternsDemo {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader reader = openSampleFile();
        
        String result = "";
        String line = "";
        while (null != (line = reader.readLine())) {
            result += line;
        }
        
        System.out.println(result);
        System.out.println("Finished!");
    }
    
    protected static BufferedReader openSampleFile() throws FileNotFoundException {
        return new BufferedReader(new InputStreamReader(new FileInputStream("sample.json")));
    }
}

