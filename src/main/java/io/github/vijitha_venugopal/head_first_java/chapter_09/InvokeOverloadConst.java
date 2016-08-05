package io.github.vijitha_venugopal.head_first_java.chapter_09;

/**
 * class for invoking one overloaded constructor from another
 * Created by vijitha on 05/08/16.
 */
public class InvokeOverloadConst {

    private InvokeOverloadConst(){
        System.out.println("In default constructor...");
    }
    private InvokeOverloadConst(int i){
        this();
        System.out.println("In single parameter constructor...");
    }
    private InvokeOverloadConst(int i,int j){
        this(j);
        System.out.println("In double parameter constructor...");
    }

    public static void main(String a[]){
        InvokeOverloadConst ch = new InvokeOverloadConst(10,11);
    }
}

