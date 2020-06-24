package streamsExample;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMapExample {


    public  static List<List<String>> allactivities(){
       return StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities).collect(Collectors.toList());
    }

    public  static List<String> allactivities1(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }


    public  static long allactivities2() {
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .count();
    }

    public static void main(String[] args) {
        System.out.println(allactivities());
        System.out.println(allactivities1());
        System.out.println("total count is " +allactivities2());
    }
}
