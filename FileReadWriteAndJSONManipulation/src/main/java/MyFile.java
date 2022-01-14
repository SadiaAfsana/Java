import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyFile {
    public static void main(String[] args) throws IOException {
         // writeFile();
        readFile();
    }
    public static void writeFile(){
        try {
            FileWriter fw = new FileWriter("MyFile.txt", true);
            fw.write("Hello World");
            fw.write("\n");   // write new line
            fw.write("Hello Java!");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void readFile() throws IOException {
        FileReader reader = new FileReader("MyFile.txt");
        int character;
        while ((character = reader.read()) != -1) {
            System.out.print((char) character);
        }
        reader.close();
    }

}
