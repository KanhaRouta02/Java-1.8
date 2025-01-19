package org.kanha.L_Default_And_Static_Methods_In_Interface;

interface  Interface1 {
    default void method1(){
        System.out.println("Interface1.method1" + Interface1.class);
    }
}
