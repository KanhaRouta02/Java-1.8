package org.kanha.L_Default_And_Static_Methods_In_Interface;

public class Client123 implements Interface1, Interface2, Interface3 {
    public static void main(String[] args) {
        Client123 client = new Client123();
        client.method1();
        client.method2();
        client.method3();
    }
}
