package functionalInterfaceSamples;

import java.util.function.Predicate;

public class predicateexample {

    static  Predicate<Integer> p2 =(num)-> {
        if(num%2==0)
            return true;
        return false;
    };

    static  Predicate<Integer> p5 =(num)-> {
        if(num%5==0)
            return true;
        return false;
    };

    public static void main(String[] args) {

        Predicate<String> p =(s)->{
            System.out.println(s);
            return true;
        };

        p.test("Sridhar Kidambi");

        System.out.println(p2.and(p5).test(8));
        System.out.println(p2.or(p5).test(8));
        System.out.println(p2.or(p5).negate().test(8));
    }



}
