import java.util.*;
import java.util.function.Predicate;
import java.util.stream.*;


public class StreamTest{
    public static void main(String[] args){
        
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //use stream api to filter odd numbers from the stream
        List<Integer> odds = numbers.stream().filter((num)->num%2 != 0)
        .collect(Collectors.toList());
        System.out.println(odds);


        List<String> names = Arrays.asList("John", "Jane", "Tom", "Emily");
        // Use Collectors.joining() to create a single comma-separated string.
        // joining is used to join a list of words with a certain delimiter
        String res = names.stream().collect(Collectors.joining(","));
        System.out.println(res);


        List<Integer> nums = Arrays.asList(3, 6, 8, 2, 5, 7, 1);
        // Use Stream API's reduce method to find the maximum value.
        int num = nums.stream().max(Comparator.naturalOrder()).orElse(null);
        System.out.println(nums.stream().max(Comparator.naturalOrder()).orElse(null));


        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");
        // Use Stream API to convert the list of words into a list of their lengths.
        List<Integer> lens = words.stream().map(len->len.length())
        .collect(Collectors.toList());
        System.out.println(lens);
    }
}