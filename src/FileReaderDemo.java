import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("1.txt");
        int data;
        while ((data=file.read())!=-1){
            System.out.println((char)data);
        }
    }
}
