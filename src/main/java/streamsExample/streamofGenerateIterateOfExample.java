package streamsExample;

import java.util.Random;
import java.util.stream.Stream;

public class streamofGenerateIterateOfExample {


    public static void main(String[] args) {
        Stream<String> _stream = Stream.of("adam", "eval", "annasipayzham");
        _stream.forEach(System.out::println);

        Stream.iterate(1,x->x*2)
                .limit(10)
                .forEach(System.out::println);

        Stream.generate((new Random())::nextInt)
                .limit(5)
                .forEach(System.out::println);
    }
}
