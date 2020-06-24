package streamsExample;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class streammapexample {

    public static void main(String[] args) {

        System.out.println(namesList());
        System.out.println(namesSet());
    }

    public  static List<String> namesList(){
       return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
               .map((String::toUpperCase))
               .collect(Collectors.toList());
    }

    public  static Set<String> namesSet(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .map((String::toUpperCase))
                .collect(Collectors.toSet());
    }
}
