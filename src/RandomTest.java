import java.util.Random;
import java.util.Scanner;

public class RandomTest {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        System.out.println("input: ");
        int m = in.nextInt();
        int n = in.nextInt();
        System.out.println("output: ");
        System.out.println(random.nextInt(n-m+1)+m);
    }
}
