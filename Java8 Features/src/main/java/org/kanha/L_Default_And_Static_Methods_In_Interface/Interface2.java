package org.kanha.L_Default_And_Static_Methods_In_Interface;

interface Interface2 extends Interface1 {
    default void method2() {
        System.out.println("Interface2.method2");
    }
    default void method1(){
        System.out.println("Interface2.method1" + Interface2.class);
    }
}
