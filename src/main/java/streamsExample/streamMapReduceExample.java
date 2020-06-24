package streamsExample;

import data.Student;
import data.StudentDataBase;

public class streamMapReduceExample {

    public static int noOfNotebooks(){
       return StudentDataBase.getAllStudents().stream()
               .map(student -> { return student.getNoteBooks();})
               .reduce(0,(a,b)->a+b);

    }

    public static int noOfNotebooksUsingSum(){
        return StudentDataBase.getAllStudents().stream()
                .map(student -> { return student.getNoteBooks();})
                .reduce(0,Integer::sum);

    }

    public static void main(String[] args) {
        System.out.println(noOfNotebooks());
        System.out.println(noOfNotebooksUsingSum());
    }
}
