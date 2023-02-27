package task_9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaFilterString {

    public static void main(String[] args) {
            List<String> stringList = Arrays.asList("apple", "banana", "cat", "dog", "elephant", "fish");

            List<String> filteredList = stringList.stream()
                    .filter(str -> str.length() < 4)
                    .collect(Collectors.toList());

            System.out.println("Filtered strings: " + filteredList);
        }
    }
