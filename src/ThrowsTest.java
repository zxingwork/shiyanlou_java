import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsTest {
    public static void main(String[] args) throws FileNotFoundException {
        throwsTest();
        throwsTest2();
    }

    public static void throwsTest() throws FileNotFoundException{
        new FileInputStream("/home/project/shiyanlou.file");
    }

    public static void throwsTest2() throws NullPointerException{
        throw new NullPointerException();
    }
}
