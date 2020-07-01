package defaults;

import data.Student;
import data.StudentDataBase;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class defaultMethodsExample {

    static Consumer<Student>  _consumer= (student -> System.out.println(student));
    public static  Comparator<Student> nameComparator= Comparator.comparing(Student::getName);
    public static  Comparator<Student> gradeComparator= Comparator.comparingInt(Student::getGradeLevel);

    public static void sortbyName(){

        Comparator<Student> nameComparator= Comparator.comparing(Student::getName);
        Comparator<Student> gradeComparator= Comparator.comparingInt(Student::getGradeLevel);
        List<Student> items=StudentDataBase.getAllStudents();
        items.sort(nameComparator);
        items.forEach(_consumer);

    }


    public static void sortbyGpa(){

        Comparator<Student> nameComparator= Comparator.comparingDouble(Student::getGpa);
        List<Student> items=StudentDataBase.getAllStudents();
        items.sort(nameComparator);
        items.forEach(_consumer);

    }

    public static void comparatorChaining(List<Student> lst){
        List<Student> items=StudentDataBase.getAllStudents();
        items.sort(gradeComparator.thenComparing(nameComparator));
        items.forEach(_consumer);

    }
    public static void comparatorWithNullVaues(List<Student> lst){
        List<Student> items=StudentDataBase.getAllStudents();
        Comparator<Student>  stuComp=  Comparator.nullsFirst(nameComparator);
        items.sort(stuComp);
        items.forEach(_consumer);

    }
    public static void comparatorWithNullVaues2(List<Student> lst){
        List<Student> items=StudentDataBase.getAllStudents();
        Comparator<Student>  stuComp=  Comparator.nullsLast(nameComparator);
        items.sort(stuComp);
        items.forEach(_consumer);

    }
    public static void main(String[] args) {
        List<String>  items= Arrays.asList("apple","bat","cat","dog","elephant");
        items.sort(Comparator.reverseOrder());
//        System.out.println(items);
//        sortbyName();
//        sortbyGpa();
//        comparatorChaining(null);
        comparatorWithNullVaues(null);
        comparatorWithNullVaues2(null);

    }
}
