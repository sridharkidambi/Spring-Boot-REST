package functionalInterfaceSamples;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerInterfaceExample {

    static void squareNum(Integer s){

        System.out.println(s*s);
    }
    static  Consumer<Student> _cs1= (student -> System.out.print(student.getName()));
    static  Consumer<Student> _cs2= (student -> System.out.println(student.getActivities()));

    public static void PrinitNameAndActivities() {


        StudentDataBase.getAllStudents().forEach(_cs1.andThen(_cs2));

    }

    public static void PrinitNameAndActivitiesWithFilter() {


        StudentDataBase.getAllStudents().forEach( (student -> {
            if(student.getGradeLevel()>3){
                _cs1.andThen(_cs2).accept(student);
            }
        }));

    }

    public static void main(String[] args) {

        Consumer<Integer> cInt= ConsumerInterfaceExample::squareNum;
        cInt.accept(5);
        int k=10;
        Consumer<String> _c1=(s)->{
            System.out.println(s.toUpperCase());
//           int  k=12;
            return;
        };
//        k=11;
        _c1.accept("Skidambi");

        Consumer<Student> ls=(student)->{
            System.out.println(student);

        };
        ls.accept( StudentDataBase.getAllStudents().get(0));
        List<Student> _student= StudentDataBase.getAllStudents();

        _student.forEach(ls);

        PrinitNameAndActivities();
        System.out.println("PrinitNameAndActivitiesWithFilter");
        PrinitNameAndActivitiesWithFilter();



        System.out.println("BiConsumer");
        BiConsumer<String,String> _bicon=(a,b)->{
            System.out.println("a is :" + a+" b is :" + b);
        };

        _bicon.accept("sridhar ","Kidambi");

        System.out.println("BiConsumer List");

        BiConsumer<String,List<String>> _biconsumerList=(name,activities)->{
            System.out.printf("name is : "+ name + " Activities are: " + activities);
        };
        StudentDataBase.getAllStudents().forEach((student -> {
            _biconsumerList.accept(student.getName(),student.getActivities());
        }));

    }

    private  void TestConsumer(){
        Consumer<Integer> cInt= ConsumerInterfaceExample::squareNum;
        cInt.accept(5);
    }
}
