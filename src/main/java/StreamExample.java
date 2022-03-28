import java.util.Arrays;

public class StreamExample {
    public static void main(String[] args) {
        int no [] = {12, 21, 32, 45, 52, 63};
        Arrays.stream(no)
                .filter(n -> n%2 == 0)
                .map(n -> ++n)
                .filter(n -> n%3 == 0)
                .forEach(System.out::println);
    }
}