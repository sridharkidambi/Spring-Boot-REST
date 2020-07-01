package optional;

import data.Student;
import data.StudentDataBase;

import javax.swing.text.html.Option;
import java.util.Optional;

public class OptionalOfEmptyNullableExample {

    public static Optional<String> ofNullable(){
        Optional<String> stingOptional=Optional.ofNullable("Hi");

        return stingOptional;
    }

    public static String optionOrElse(){
        Optional<Student> studentOptional= Optional.ofNullable(null);

        String name =    studentOptional.map(Student::getName).orElse("Default");
        return name;
    }

    public static String optionOrElseGet(){
        Optional<Student> studentOptional= Optional.ofNullable(null);

        String name =    studentOptional.map(Student::getName).orElseGet(()->{return  "Default";});
        return name;
    }


    public static String optionOrElseThrow(){
        Optional<Student> studentOptional= Optional.ofNullable(null);

        String name =    studentOptional.map(Student::getName).orElseThrow(() -> new RuntimeException("no data"));

        return name;
    }

    public static void main(String[] args) {
        System.out.println(ofNullable().get());
        System.out.println(optionOrElse());
        System.out.println(optionOrElseGet());
        System.out.println(optionOrElseThrow());
    }
}
