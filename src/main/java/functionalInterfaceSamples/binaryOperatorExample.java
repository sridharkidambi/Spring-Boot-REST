package functionalInterfaceSamples;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class binaryOperatorExample {

    static Comparator<Integer> compex = (a,v)->a.compareTo(v);

    static BinaryOperator<Integer> binOper=(s,k)->{
        return s*k;
    };
    public static void main(String[] args) {
        System.out.println(binOper.apply(5,4));

        BinaryOperator<Integer> maxby=BinaryOperator.maxBy(compex);
        BinaryOperator<Integer> minby=BinaryOperator.minBy(compex);
        System.out.println(maxby.apply(14,5));
        System.out.println(minby.apply(14,5));
    }

}
