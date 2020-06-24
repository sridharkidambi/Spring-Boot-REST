package functionalInterfaceSamples;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class predicateConsumerExample {

    Predicate<Student> p1=(student -> {
      return   student.getGpa()>3;
    });

    Predicate<Student> p2=(student -> {
        return   student.getGradeLevel()>3;
    });

    BiPredicate<Integer,Double> _bipreidcateTest =(gradeLvel,GPA)->{
        return gradeLvel>3 && GPA>3;
    };

    BiConsumer<String, List<String>> _bicon= (name,activities)->{
        System.out.println("name is : "+name +" activities are : "+ activities);
    };

    Consumer<Student> _cons=(student -> {

        if(p1.or(p2).test(student)){
            _bicon.accept(student.getName(),student.getActivities());
        }
    });


    Consumer<Student> _cons1=(student -> {

        if(_bipreidcateTest.test(student.getGradeLevel(),student.getGpa())){
        _bicon.accept(student.getName(),student.getActivities());
    }
    });

    public void SampleMethod(){

        StudentDataBase.getAllStudents().forEach(_cons);
        StudentDataBase.getAllStudents().forEach(_cons1);

    }
    public static void main(String[] args) {
        new predicateConsumerExample().SampleMethod();
    }
}
