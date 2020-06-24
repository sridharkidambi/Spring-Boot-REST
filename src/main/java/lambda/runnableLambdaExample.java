package lambda;

import static java.lang.Thread.*;

public class runnableLambdaExample {

    public static void main(String[] args) {

        Runnable _runnable=new Runnable() {
            @Override
            public void run() {
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("I am running runnable");
            }
        };

        new Thread(_runnable).start();
        System.out.println("I am running runnable outside");


        Runnable _runnableLambda =()->{
            System.out.println("I am running runnable lambda");

        };

        new Thread(_runnableLambda).start();

        new Thread(()->{
            System.out.println("I am running runnable lambda simple");

        }).start();
    }



}
