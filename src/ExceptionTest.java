import java.lang.reflect.Array;
import java.util.Arrays;

public class ExceptionTest {
    public static void main(String[] args) {
        int[] array = new int[5];

        Arrays.fill(array,5 );

        for (int i = 4; i>-1;i--){
            if (i == 0){
                throw new MyAriException("there is an exception occured.");
            }
        }
    }
}
