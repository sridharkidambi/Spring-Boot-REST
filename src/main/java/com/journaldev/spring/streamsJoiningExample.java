import data.Student;
import data.StudentDataBase;

import java.util.stream.Collectors;

public class streamsJoiningExample {


    public  static  String JoiningEx(){
       return StudentDataBase.getAllStudents().stream().map(Student::getName).collect(Collectors.joining("-","SRI-","-Hari") );
    }

    public static void main(String[] args) {
        System.out.println(JoiningEx());
    }
}
