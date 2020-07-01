package defaults;

public interface interface2  extends  interface1{


    default void methodB(){
        System.out.println("method B interface");
    }

    default void methodA(){
        System.out.println("method A interface 2");
    }
}
