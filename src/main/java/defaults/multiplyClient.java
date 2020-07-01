package defaults;

import java.util.Arrays;

public class multiplyClient {
    public static void main(String[] args) {
        impMultiply _imp=new impMultiply();
        System.out.println(_imp.multiply(Arrays.asList(1,2,3,4)));
        System.out.println(_imp.size(Arrays.asList(1,2,3,4)));
    }
}
