package functionalInterfaceSamples;

import data.Student;
import data.StudentDataBase;

import java.util.function.Supplier;

public class supplierExample {

    static Supplier<Student> supex =()->{
      return   StudentDataBase.getAllStudents().get(0);
    };

    public static void main(String[] args) {
        System.out.println(supex.get());
    }
}
