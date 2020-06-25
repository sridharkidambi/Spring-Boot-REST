package numericStream;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class numericStreamAggregateExample {

    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(1,50).max().getAsInt();
        System.out.println(sum);

        OptionalLong optionalLong= LongStream.range(1,50).min();
        OptionalDouble db= LongStream.range(1,50).average();

        System.out.println(optionalLong.isPresent()?optionalLong.getAsLong():0);
        System.out.println(db.isPresent()?db.getAsDouble():0);


    }
}
