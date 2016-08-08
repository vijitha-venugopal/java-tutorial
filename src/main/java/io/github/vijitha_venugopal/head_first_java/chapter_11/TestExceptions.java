package io.github.vijitha_venugopal.head_first_java.chapter_11;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * class using throw clause
 * Created by vijitha on 08/08/16.
 */
public class TestExceptions {


    private void divide() throws ArithmeticException {
        int a, b, result;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two integers");
        a = s.nextInt();
        b = s.nextInt();

        if (b == 0) {
            throw new ArithmeticException("You can't divide by zero!");
        }

        else {
            result = a / b;
            System.out.println("result :" + result);
        }
    }
    public static void main(String[] args) {
        TestExceptions t1 = new TestExceptions();
        t1.divide();
    }
}
