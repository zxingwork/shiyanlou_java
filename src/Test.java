import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Test{
    public static void main(String[] args) {
        List<String>strings = Arrays.asList("efg", "", "abc", "bc", "ghij", "", "lmn");

        long count = strings.stream().filter(string->string.length()==2).count();
//        System.out.println(count);

        Random random = new Random();
        random.ints().limit(10).forEach(System.out::print);

        random.ints().limit(10).sorted().forEach(System.out::println);
    }
}