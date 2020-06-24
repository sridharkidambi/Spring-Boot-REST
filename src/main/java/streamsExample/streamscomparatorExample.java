package streamsExample;

import data.Student;
import data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class streamscomparatorExample {

    public  static List<Student> sortStudents(){
       return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
    }


    public  static List<Student> sortGpa(){
        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        sortStudents().forEach((student -> {
            System.out.println(student.getName());
        }));

        sortStudents().forEach(System.out::println);
        sortGpa().forEach(System.out::println);
    }
}
