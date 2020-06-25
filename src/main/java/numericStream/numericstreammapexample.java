package numericStream;

import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalLong;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class numericstreammapexample {

    public  static  List<Integer> mapToObj(){
      List<Integer> itmList= IntStream.rangeClosed(1,5).mapToObj((x->{
        return new Integer(x);
        })).collect(Collectors.toList());

      return  itmList;
    }


    public  static OptionalLong maptoLong(){
       return IntStream.rangeClosed(1,5).mapToLong((i->{
            return  i;
        })).min();
    }

    public  static OptionalDouble maptoDouble(){

       List<Double> itemDOuble=IntStream.rangeClosed(1,5).mapToDouble((i->{
            return  i;
        })).mapToObj((i->{
            return i;
        })).collect(Collectors.toList());

        System.out.println("itemDouble");
        System.out.println(itemDOuble);

        return IntStream.rangeClosed(1,5).mapToDouble((i->{
            return  i;
        })).min();
    }
    public static void main(String[] args) {

        System.out.println(mapToObj());
        System.out.println(maptoLong().getAsLong());
        System.out.println(maptoDouble().getAsDouble());
    }



}
