package streamsExample;

import data.Student;
import data.StudentDataBase;

import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class streamreduceexample {

    public  static  int performMulti(List<Integer> intList){
      return   intList
                .stream()
                .reduce(1,(a,b)->{ return  a*b;   });
    }


    public  static Optional<Integer> performMultiWithoutIdentity(List<Integer> intList){
        return   intList
                .stream()
                .reduce((a,b)->{ return  a*b;   });
    }


    public  static Optional<Student>  GetHighestGPA(){
        return StudentDataBase.getAllStudents().stream().reduce((s1,s2)->{
            if(s1.getGpa()>s2.getGpa()){
                return  s1;
            }
            return  s2;
        });
    }


    public  static Optional<Student>  GetHighestGPATernary(){
        return StudentDataBase.getAllStudents().stream().reduce((s1,s2)->s1.getGpa()>s2.getGpa()? s1:s2);
    }

    public static void main(String[] args) {
        List<Integer> items= Arrays.asList(1,3,5,7);
        System.out.println(performMulti(items));
        System.out.println(performMultiWithoutIdentity(items));
        System.out.println(performMultiWithoutIdentity(items).isPresent());
        System.out.println(performMultiWithoutIdentity(items).get());
        System.out.println(GetHighestGPA().isPresent());
        System.out.println(GetHighestGPA().get());
        System.out.println(GetHighestGPA());
        System.out.println(GetHighestGPATernary());
        System.out.println(GetHighestGPATernary().get());

    }
}
