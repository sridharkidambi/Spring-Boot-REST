package methodReference;

import data.Student;
import data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodfReference {


    static Consumer<Student> c1= (System.out::println);
    public static void main(String[] args) {
        c1.accept(StudentDataBase.getAllStudents().get(0));
        StudentDataBase.getAllStudents().forEach(c1);
    }
}
