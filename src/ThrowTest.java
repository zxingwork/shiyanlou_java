import java.util.Scanner;

public class ThrowTest {
    public static void main(String[] args) {
        Integer a = 1;
        Integer b = null;

        if (a == null || b == null){
            throw new NullPointerException();
        }
        else {
            System.out.println(a + b);
        }
    }
}
