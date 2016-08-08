package io.github.vijitha_venugopal.head_first_java.chapter_10;

/**
 * class for non static final variables
 * Created by vijitha on 08/08/16.
 */
public class NonStaticFinalVariable {
    private final int speedlimit=90;
    private void run(){
        System.out.println(speedlimit);
        System.out.println("Value of final variables are doesn't change");
    }
    public static void main(String args[]){
        NonStaticFinalVariable obj=new  NonStaticFinalVariable();
        obj.run();
    }
}