package org.kanha.B_Lambda_Expression;

public class RunnableLambdaExample {
    public static void main(String[] args) {
        /*
        *  prior java 8
        */
        Runnable runnable  = new Runnable()  {  // Anonymous Class
            public void run() {
                System.out.println("Inside Runnable 1");
            }
        };
        new Thread(runnable).start(); // Inside Runnable 1
        /*
        * using lambda
        */
        Runnable runnable1 = () -> {
            System.out.println("Inside Runnable 2");
        };
        new Thread(runnable1).start(); // Inside Runnable 2

        Runnable runnable2 = () -> System.out.println("Inside Runnable 3");
        new Thread(runnable2).start(); // Inside Runnable 3

        new Thread(() -> System.out.println("Inside Runnable 4")).start(); // Inside Runnable 4
    }
}
