package numericStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamExample {


    public static Integer sumOfnNos(List<Integer> nnos){

        return nnos.stream().reduce(0,(a,b)->a+b);
    }

    public static int  intStream(){
       return IntStream.rangeClosed(0,10).sum();
    }
    public static void main(String[] args) {

        List<Integer> nnos= Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        System.out.println(sumOfnNos(nnos));
        System.out.println(intStream());

        IntStream.rangeClosed(1,50).forEach((x->{
            System.out.println(x);
        }));

        System.out.println("range only");
        IntStream.range(1,50).forEach((x->{
            System.out.println(x);
        }));
        System.out.println(IntStream.range(1,50).count());

         IntStream.rangeClosed(1,50).asDoubleStream().forEach((x->{
             System.out.println(x);
        }));
    }
}
