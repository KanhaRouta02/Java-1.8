package org.kanha.L_Default_And_Static_Methods_In_Interface;

interface Interface3 extends Interface2 {
    default void method3() {
        System.out.println("Interface3.method3");
    }
}
