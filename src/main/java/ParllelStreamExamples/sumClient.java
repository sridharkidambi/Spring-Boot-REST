package ParllelStreamExamples;

import java.util.stream.IntStream;

public class sumClient {

    public static void main(String[] args) {
        sum _sum=new sum();

//        IntStream.rangeClosed(1,5000).parallel().sum();
        IntStream.rangeClosed(1,1000).forEach(_sum::PerformSum);


        System.out.println(_sum.getTotal());

        _sum.setTotal(0);
        IntStream.rangeClosed(1,1000).parallel().forEach(_sum::PerformSum);


        System.out.println(_sum.getTotal());

    }
}
