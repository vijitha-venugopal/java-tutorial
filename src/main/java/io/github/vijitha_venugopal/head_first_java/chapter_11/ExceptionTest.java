package io.github.vijitha_venugopal.head_first_java.chapter_11;

import java.util.Scanner;

/**
 * class for testing exception
 * Created by vijitha on 08/08/16.
 */
public class ExceptionTest {
    public static void main(String[] args) {
        int a,b,result;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Two intergers :- ");

        a=scanner.nextInt();
        b=scanner.nextInt();

        try {
            result=a/b;
            System.out.println("Result : "+result);
        }
        catch (ArithmeticException ae) {
            System.out.println(" Exception caught: Division by zero.");
        }
    }
}
