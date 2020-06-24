package functionalInterfaceSamples;

import java.util.function.Function;

public class functionExample {

    static Function<String,String> simpfunc=(s)->{
        return  s+" Kidambi";
    };

    static Function<String,String> simpfunc1=(s)->{
        return  s+" is an architect da";
    };

    public static void main(String[] args) {

        System.out.println(simpfunc.apply("Sridhar"));
        System.out.println(simpfunc.andThen(simpfunc1).apply("Sridhar"));
        System.out.println(simpfunc.compose(simpfunc1).apply("Sridhar"));

    }
}
