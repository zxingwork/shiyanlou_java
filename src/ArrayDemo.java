import java.util.Arrays;
import java.util.Random;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = new int[10];

        Arrays.fill(arr, 9);
        System.out.println("fill:" + Arrays.toString(arr));
        Random random = new Random();
        System.out.println(random);

        for (int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(101);
        }
        System.out.println("refill:"+Arrays.toString(arr));

        arr[5] = 50;

        Arrays.sort(arr);
        System.out.println("sort:"+Arrays.toString(arr));

        int i = Arrays.binarySearch(arr, 50);
        System.out.println("index of value=50:"+i);

        int[] newArr = Arrays.copyOf(arr, arr.length);

        System.out.println("equals:"+Arrays.equals(arr, newArr));
    }
}
