package methodReference;

import data.Student;
import data.StudentDataBase;

import java.util.function.Predicate;

public class refactormethodreference {


    static Predicate<Student> studentGrade =refactormethodreference::getGradeLevel;

    public static void main(String[] args) {

        System.out.println(studentGrade.test(StudentDataBase.getAllStudents().get(0)));
    }


    public  static  boolean getGradeLevel(Student s){
        return  s.getGradeLevel()>1;
    }
}
