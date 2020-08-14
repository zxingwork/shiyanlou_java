import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        File f1 = new File("./1.txt");
        File f2 = new File("./", "2.txt");

        File f3 = new File("./");
        File f4 = new File(f3, "3.txt");
        try {
            System.out.println(f1);
            System.out.println(f2.createNewFile());
            System.out.println(f3.delete());
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }

        File[] files = File.listRoots();
        for (File file:files){
            System.out.println(file);
            if (file.length()>0){
                String[] filenames = file.list();
                for (String filename:filenames){
                    System.out.println(filename);
                }
            }
        }

    }
}
