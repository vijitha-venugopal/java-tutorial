package io.github.vijitha_venugopal.head_first_java.chapter_11;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * class for testing exception
 * Created by vijitha on 08/08/16.
 */
public class ExceptionTest {
    public static void main(String[] args) {


        try {
            int a,b,result;

            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter Two intergers :- ");

            a=scanner.nextInt();
            b=scanner.nextInt();

            result=a/b;
            System.out.println("Result : "+result);
        }

        catch (InputMismatchException ee) {
            System.out.println("Exception caught: InputMismatchException");
            System.out.println("Enter integer numbers");

        }
        catch (ArithmeticException ae) {
            System.out.println(" Exception caught: Division by zero.");
            System.out.println("Can't divide by zero");

        }
    }
}
