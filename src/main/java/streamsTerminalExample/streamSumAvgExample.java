package streamsTerminalExample;

import data.Student;
import data.StudentDataBase;

import java.util.stream.Collectors;
import java.util.stream.Collectors.*;

public class streamSumAvgExample {


    public static  int Sum(){
       return StudentDataBase.getAllStudents().stream().collect(Collectors.summingInt(Student::getNoteBooks));
    }

    public static  Double avgInt(){
        return StudentDataBase.getAllStudents().stream().collect(Collectors.averagingInt(Student::getNoteBooks));
    }
    public static void main(String[] args) {
        System.out.println(Sum());
        System.out.println(avgInt());
    }
}
