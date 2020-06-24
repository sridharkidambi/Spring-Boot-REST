package methodReference;

import java.util.function.Function;

public class FunctionMethodReferenceExample {


    static Function<String,String> toUpperCaseLambda=(s)->{
      return   s.toUpperCase();
    };

    static Function<String,String> toUpperCaseLambda1= String::toUpperCase;
    public static void main(String[] args) {
        System.out.println(toUpperCaseLambda.apply("skidambi"));
        System.out.println(toUpperCaseLambda1.apply("skidambi"));
    }
}
