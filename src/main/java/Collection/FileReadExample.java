package Collection;
import java.io.*;
public class FileReadExample {

    public static void main(String[] args) {
        try {

            BufferedReader br = new BufferedReader(new FileReader("data.txt"));
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
            br.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

}
