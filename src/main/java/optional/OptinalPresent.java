package optional;

import java.util.Optional;

public class OptinalPresent {

    public static void ifPresentEx(){
        Optional<String> items=Optional.ofNullable("SK");
        items.ifPresent(s -> System.out.println(s));
    }
    public static void main(String[] args) {
        ifPresentEx();
    }
}
