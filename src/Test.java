import java.io.*;

public class Test{
    public static void main(String[] args) {
        try {
            File inFile = new File("1.txt");
            File outFile = new File("creatNewFile.txt");
            FileInputStream fis = new FileInputStream(inFile);
            FileOutputStream fos = new FileOutputStream(outFile);

            int c;
            while ((c = fis.read()) != -1){
                System.out.print(c+"\t");
                fos.write(c);
            }
            fis.close();
            fos.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}