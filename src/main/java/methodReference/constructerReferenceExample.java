package methodReference;

import data.Student;

import java.util.function.Function;
import java.util.function.Supplier;

public class constructerReferenceExample {

    static Supplier<Student> supStudent = Student::new;

    static Function<String,Student> myfunc=Student::new;


    public static void main(String[] args) {
        System.out.println(supStudent.get());
        System.out.println(myfunc.apply("sridharkidambi"));
    }
}
