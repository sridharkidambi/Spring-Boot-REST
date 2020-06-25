package streamsTerminalExample;

import data.Student;
import data.StudentDataBase;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class streamsEx {

    public static void main(String[] args) {
        Map<String, List<String>> results=new HashMap<>();

        System.out.println(LocalDateTime.now());
        results= StudentDataBase.getAllStudents().stream()
                .filter((student -> student.getGradeLevel()>3))
                .filter(student -> student.getGpa()>3)
                .collect(Collectors.toMap(Student::getName,Student::getActivities));
        System.out.println(LocalDateTime.now());
        System.out.println(LocalDateTime.now());
        results= StudentDataBase.getAllStudents().parallelStream()
                .filter((student -> student.getGradeLevel()>3))
                .filter(student -> student.getGpa()>3)
                .collect(Collectors.toMap(Student::getName,Student::getActivities));
        System.out.println(LocalDateTime.now());
        System.out.println(LocalDateTime.now());

        System.out.println(results);
    }
}
