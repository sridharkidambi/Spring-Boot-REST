package streamsTerminalExample;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class partitionbyCollectorExample {



    public static void  partitioningbyExample(){
        Predicate<Student>  pred=student ->  student.getGpa()>3.8;
        Map<Boolean,List<Student>> items= StudentDataBase.getAllStudents().stream()
                .collect(Collectors.partitioningBy(pred));

        System.out.println(items);

    }


    public static void  partitioningbyExample2(){
        Predicate<Student>  pred=student ->  student.getGpa()>3.8;
        Map<Boolean, Set<Student>> items= StudentDataBase.getAllStudents().stream()
                .collect(Collectors.partitioningBy(pred,Collectors.toSet()));

        System.out.println(items);

    }
    public static void main(String[] args) {

        partitioningbyExample();
        partitioningbyExample2();


    }
}
