import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
        int[] arr = {6, 17, 92, 32, 58, 22, 84, 66, 36, 33};
        System.out.println("before sort the index of value:33: "+Arrays.binarySearch(arr, 33));
        Arrays.sort(arr);
        System.out.println("sorted: "+Arrays.toString(arr));
        int i = Arrays.binarySearch(arr, 33);
        System.out.println("index of value 33: "+i);
    }
}
