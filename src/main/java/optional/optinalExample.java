package optional;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class optinalExample {


    public static Optional<String> getStudentName(){
//        Optional<Student> itmStudent =Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> itmStudent =Optional.ofNullable(null);

      if(itmStudent.isPresent())
      return itmStudent.map(Student::getName);
      else
          return Optional.empty();

    }

    public static void main(String[] args) {

        if(getStudentName().isPresent()){
            System.out.println(getStudentName().get());
            System.out.println(getStudentName().get().length());
        }

    }
}
