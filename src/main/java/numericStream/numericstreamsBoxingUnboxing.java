package numericStream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class numericstreamsBoxingUnboxing {


    public  static  void Boxing(){

    }

    public static void main(String[] args) {

      List<Integer> intItems=  IntStream.rangeClosed(1,50).boxed().collect(Collectors.toList());
        System.out.println(intItems);

        System.out.println(intItems.stream().mapToInt((x->{
            return x.intValue();
        })).sum());

        System.out.println(intItems.stream().mapToInt(Integer::intValue).sum());
        ;
    }
}
