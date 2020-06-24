package streamsExample;

import data.StudentDataBase;

public class streamMatchExample {

    public static  boolean allmatch(){

      return   StudentDataBase.getAllStudents().stream().allMatch((student -> {
           return student.getGpa()>3.9;
        }));
    }

    public static  boolean anymatch(){

        return   StudentDataBase.getAllStudents().stream().anyMatch((student -> {
            return student.getGpa()>3.9;
        }));
    }


    public static  boolean nonematch(){

        return   StudentDataBase.getAllStudents().stream().noneMatch((student -> {
            return student.getGpa()>5;
        }));
    }
    public static void main(String[] args) {
        System.out.println(allmatch());
        System.out.println(anymatch());
        System.out.println(nonematch());

    }
}
