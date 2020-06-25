package streamsTerminalExample;

import data.Student;
import data.StudentDataBase;

import java.util.*;
import java.util.stream.Collectors;

public class streamGroupByExample    {

    public static void groupbyGender(){
     Map<String, List<Student>> studentMap= StudentDataBase.getAllStudents().stream().collect(Collectors.groupingBy(Student::getGender));

        System.out.println(studentMap);
    }


    public static void groupbyGpa(){
        Map<String, List<Student>> studentMap= StudentDataBase.getAllStudents().stream().collect(Collectors.groupingBy(student->{
          return   student.getGpa()>=3.8?"outstanding":"Average";
        }));

        System.out.println(studentMap);
    }




    public static void twoLevelFGrouping() {
        Map<Integer,Map<String,List<Student>>>  gradeGpa  = StudentDataBase.getAllStudents().stream().collect(Collectors.groupingBy(Student::getGradeLevel, Collectors.groupingBy(student->student.getGpa()>=3.8?"outstanding":"average")));
        System.out.println(gradeGpa);
    }


    public static void twoLevelFGrouping2() {
        Map<String,Integer>  gradeGpa  = StudentDataBase.getAllStudents().stream().collect(Collectors.groupingBy(Student::getName, Collectors.summingInt(Student::getNoteBooks)));
        System.out.println(gradeGpa);
    }

    public static void threeLevelFGrouping1() {
        LinkedHashMap<String, Set<Student>>  gradeGpa  = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::getName, LinkedHashMap::new,Collectors.toSet()));
        System.out.println(gradeGpa);
    }

    public static void  CalculateTopGpa(){
        Map<Integer,Optional<Student>> itnmList=
        StudentDataBase.getAllStudents().stream().collect(Collectors.groupingBy(Student::getGradeLevel,Collectors.maxBy(Comparator.comparing(Student::getGpa))));
    }

    public static void  CalculateTopGpaRemoveOptional(){
        Map<Integer,Student> itnmList=
                StudentDataBase.getAllStudents()
                        .stream()
                        .collect(Collectors.groupingBy(Student::getGradeLevel, Collectors.collectingAndThen(  Collectors.maxBy(Comparator.comparing(Student::getGpa)), Optional::get)));
        System.out.println(itnmList);
    }


    public static void  CalculateLeastGpaRemoveOptional(){
        Map<Integer,Student> itnmList=
                StudentDataBase.getAllStudents()
                        .stream()
                        .collect(Collectors.groupingBy(Student::getGradeLevel, Collectors.collectingAndThen(  Collectors.minBy(Comparator.comparing(Student::getGpa)), Optional::get)));
        System.out.println(itnmList);
    }

    public static void main(String[] args) {
//        groupbyGender();
//        groupbyGpa();
//        groupbyGpa();
//        twoLevelFGrouping();
//        twoLevelFGrouping2();
//        threeLevelFGrouping1();
//        CalculateTopGpa();
//        CalculateTopGpaRemoveOptional();
        CalculateLeastGpaRemoveOptional();

    }


}
