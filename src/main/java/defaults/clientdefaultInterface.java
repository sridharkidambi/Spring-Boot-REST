package defaults;

public class clientdefaultInterface implements  interface1,interface2,interface3 {

    public static void main(String[] args) {
        clientdefaultInterface obj=new clientdefaultInterface();
        obj.methodA();
        obj.methodB();
        obj.methodC();
    }

    public void methodA(){
        System.out.println("method A interface class");
    }
}
