package defaults;

import java.util.List;

public class impMultiply implements multipleInterface {
    @Override
    public int multiply(List<Integer> integerList) {
        return integerList.stream().reduce(1,(x,y)->{ return x*y;});
    }
}
