package lambda;

import javax.jnlp.IntegrationService;
import java.util.Comparator;

public class comparatorlambdaexample {
    public static void main(String[] args) {

        Comparator<Integer> _comparator =new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

//        Integer s= _comparator.compare(1,2);
        Integer s= _comparator.compare(11,2);
       System.out.println(s.toString());

       Comparator<Integer> _comLambda=( a,  b)->{
           return a.compareTo(b);
       };

        System.out.println("SK comparator lambda");;
        System.out.println( _comLambda.compare(3,2));;
    }
}
