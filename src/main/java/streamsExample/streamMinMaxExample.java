package streamsExample;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class streamMinMaxExample {

    public static Optional<Integer> maxnum(List<Integer> lstItems){

        return lstItems.stream()
                .skip(1)
                .reduce(Integer::max);

    }

    public static Optional<Integer> minnum(List<Integer> lstItems){

        return lstItems.stream()
                .reduce(Integer::min);

    }

    public static void main(String[] args) {

        List<Integer> lstItems= Arrays.asList(1,3,5,7,9,10);
        System.out.println(maxnum(lstItems).get());
        System.out.println(minnum(lstItems).get());

    }
}
