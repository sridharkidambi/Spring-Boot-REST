package functionalInterfaceSamples;

import java.util.function.UnaryOperator;

public class unaryoperatorExample {

    static UnaryOperator<String> uop=(s -> {
        return s+" Kidambi";
    });
    public static void main(String[] args) {
        System.out.println(uop.apply("Sridhar"));
    }
}
