package optional;

import data.Bike;
import data.Student;
import data.StudentDataBase;

import javax.swing.text.html.Option;
import java.util.Optional;

public class optionalMapFlatMapExample {

    public static void optionalFlatMap(){
        Optional<String> bikeName=Optional.empty();
        Optional<Student> studentList=Optional.ofNullable(StudentDataBase.studentSupplier.get());
        bikeName=studentList.filter(student -> student.getGpa()>=3.5).flatMap(Student::getBike).map(Bike::getName);
        System.out.println("Bike name is :" + bikeName.get());
    }

    public  static  void optionalFilter(){
        Optional<Student> optionalStudent=Optional.ofNullable(StudentDataBase.studentSupplier.get());
        optionalStudent.filter((student -> student.getGpa()>3.5)).ifPresent(student -> System.out.println(student));
    }
    public static void main(String[] args) {
//        optionalFilter();
        optionalFlatMap();
    }
}
