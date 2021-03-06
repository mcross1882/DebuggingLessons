
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

class ObservingPatternsDemo {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader reader = openSampleFile();
        
        StringBuilder builder = new StringBuilder();
        char[] buffer = new char[2048];

        while (-1 != reader.read(buffer)) {
            builder.append(buffer);
        }
        
        System.out.println(builder.toString());
        System.out.println("Finished!");
    }
    
    protected static BufferedReader openSampleFile() throws FileNotFoundException {
        return new BufferedReader(new InputStreamReader(new FileInputStream("sample.json")));
    }
}

