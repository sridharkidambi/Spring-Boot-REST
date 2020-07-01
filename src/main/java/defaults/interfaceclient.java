package defaults;

public class interfaceclient implements interface1,interface4 {

    public void methodA(){
        System.out.println("method A class");
    }

    public static void main(String[] args) {
        interfaceclient bj=new interfaceclient();
        bj.methodA();
    }
}
