package io.github.vijitha_venugopal.head_first_java.chapter_11;
/**
 * class using catch keyword
 * Created by vijitha on 08/08/16.
 */
public class CatchException   {
    private static int sum(int num1, int num2)throws ArithmeticException {
        if (num2 == 0) {
            throw new ArithmeticException("second parameter is zero can,t find division");
        }

        else
            System.out.println("Answer is : ");
            return num1/num2;
    }
    public static void main(String args[]){
        int res=sum(1,1);
        System.out.println(res);
        System.out.println("Continue Next statements");
    }
}