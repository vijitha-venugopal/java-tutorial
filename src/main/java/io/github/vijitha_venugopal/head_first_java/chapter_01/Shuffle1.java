package io.github.vijitha_venugopal.head_first_java.chapter_01;

/**
 * class with main
 * Created by vijitha on 03/08/16.
 */
public class Shuffle1 {
    public static void main(String[] args) {
        int x=3;
        while (x>0) {
            if(x>2) {
                System.out.print("a");
            }
            x=x-1;
            System.out.print("-");
            if(x==2) {
                System.out.print("b c");
            }
            if(x==1) {
                System.out.print("d");
                x=x-1;
            }
        }
    }
}
