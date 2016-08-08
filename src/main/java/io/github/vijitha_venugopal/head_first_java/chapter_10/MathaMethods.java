package io.github.vijitha_venugopal.head_first_java.chapter_10;

/*
  class to test the working of Math Methods
  Created by vijitha on 05/08/16.
 */
import java.util.Scanner;
import static java.lang.System.out;
class MathaMethods {
    public static void main(String angt[]) {
        Scanner data = new Scanner(System.in);
        double num1, num2, num;
        System.out.println("Enter a number");
        num1 = data.nextInt();
        System.out.println("Enter a number");
        num2 = data.nextInt();

        num = Math.abs(-4.5);
        System.out.println("absolute of -4.5 is :"+ num);

        num = Math.min(num1, num2);
        System.out.println("min of:"+num1+" and "+num2+" : " + num);

        num = Math.max(num1, num2);
        System.out.println("Max of:"+num1+" and "+num2+" : " + num);

        num = Math.ceil(8.4);
        System.out.println("ceil of 8.4 is: " + num);

        num = Math.floor(8.4);
        System.out.println("floor of 8.4 is :" + num);

        num = Math.pow(num1, num2);
        System.out.println("power of "+num1+" and "+num2+" is  :" + num);

        num = Math.sqrt(num1);
        System.out.println("sqrt of "+num1+" is : " + num);

        num = Math.cbrt(num2);
        System.out.println("cbrt of"+num2+" is : " + num);

        num = Math.exp(2);
        System.out.println("exp:" + num);

        num = Math.expm1(2);
        System.out.println("expm1:" + num);

        num = Math.round(2.15);
        System.out.println("Rounding 2.15 .... :" + num);

        double r1=Math.random();
        int r2=(int)(Math.random()*5);

        System.out.println("Random r1 :"+r1);
        System.out.println("Random r2 :"+r2);

    }
}