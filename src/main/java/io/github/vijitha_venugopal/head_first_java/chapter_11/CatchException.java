package io.github.vijitha_venugopal.head_first_java.chapter_11;
/**
 * class using catch keyword
 * Created by vijitha on 08/08/16.
 */
public class CatchException {
    private static int sum(int num1, int num2){
        if (num1 == 0)
            throw new ArithmeticException("First parameter is not valid");
        else
            System.out.println("Answer is : ");
        return num1+num2;
    }
    public static void main(String args[]){
        int res=sum(0,12);
        System.out.println(res);
        System.out.println("Continue Next statements");
    }
}