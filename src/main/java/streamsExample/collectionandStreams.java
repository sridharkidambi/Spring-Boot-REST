package streamsExample;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class collectionandStreams {
    public static void main(String[] args) {
        ArrayList<String> alist=new ArrayList<>();
        alist.add("a");
        alist.add("b");
        alist.add("v");
        alist.add("d");

        alist.remove("v");

        Map<String ,Integer> mlist=alist.stream().peek((s -> {
            System.out.println(s);
        })).collect(Collectors.toMap(String::toString,String::length));

        System.out.println(mlist);

    }
}
