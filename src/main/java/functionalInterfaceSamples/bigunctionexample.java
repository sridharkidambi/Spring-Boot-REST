package functionalInterfaceSamples;

import data.Student;
import data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class bigunctionexample {

    static  Predicate<Student> _mypred=(student -> {
        return student.getGradeLevel()>3;
    });

    static BiFunction<List<Student>, Predicate<Student>, Map<String,Double>> _bifunc=((students, studentsPred)->{
        Map<String ,Double> _sampMap=new HashMap<>();
        students.forEach(student -> {
            if(studentsPred.test(student)){
                _sampMap.put(student.getName(),student.getGpa());
            }
        });
        return _sampMap;
    });
    public static void main(String[] args) {
        Map<String,Double> resutl=_bifunc.apply(StudentDataBase.getAllStudents(),_mypred);
        System.out.println(resutl);

    }
}



