package org.kanha.M_Var_Keyword;

public class VarKeyword {
    public static void main(String[] args) {
        var name = "Knaha";     // inferred as String
        var age = 22;           // inferred as int
        
        System.out.println(name + " is " + age + " years old");
    }
}
