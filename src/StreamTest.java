import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] args) {
        System.out.println("Java version:"+System.getProperty("java.version"));

        //统计空字符串的数量
        List<String>strings = Arrays.asList("efe", "", "efr", "", "232", "frf");
    }

    private static long getCountEmptyStringUsingJava7(List<String> strings){
        long n = strings.stream().filter(String::isEmpty).count();
        return n;
    }

    private static List<String> deleteEmptyStringUsingJava7(List<String> strings){
        return strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
    }

    private static String getMergedStringUsingJava7(List<String> strings, String separator){
        StringBuilder stringBuilder = new StringBuilder();
        for (String string:strings){
            if (!string.isEmpty()){
                stringBuilder.append(string);
                stringBuilder.append(separator);
            }
        }
        String mergedString = stringBuilder.toString();
        return mergedString.substring(0, mergedString.length()-2);
    }

    private static List<Integer> getSquares(List<Integer> numbers){
        return numbers.stream().map(i->i*i).collect(Collectors.toList());
    }

    private static int getMax(List<Integer> numbers){
        int max = numbers.get(0);
        for (int number:numbers){
            if (number>max){
                max = number;
            }
        }
        return max;
    }

    private static int getMin(List<Integer> numbers){
        int min = numbers.get(0);
        for (int number:numbers){
            if (number<min){
                min = number;
            }
        }
        return min;
    }

    private static int getSum(List<Integer> numbers){
        int sum = 0;
        for (int number:numbers){
            sum += number;
        }
        return sum;
    }
}
