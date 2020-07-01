package defaults;

import java.util.List;

public interface multipleInterface {

    int multiply(List<Integer> integerList);
    default int size(List<Integer> integerList){
       return integerList.size();
    }

    static boolean isEmpty(List<Integer> items){
            return  items!=null && items.size()>0;
    }

}
