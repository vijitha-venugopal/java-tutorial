package io.github.vijitha_venugopal.head_first_java.chapter_10;

/**
 * class for testing number formats
 * Created by vijitha on 08/08/16.
 */
public class NumberFormattingTest {
    public static void main(String[] args) {
        String s=String.format("%, d",1000);
        String s1=String.format("%.2f ",15450.76885);
        String s2=String.format(" I have %,.2f bugs to fix. ",15450.76885);
        String s3=String.format(" I have %,6.1f bugs to fix. ",15564450.76885);
        String s4=String.format(" %d ",22);
        String s5=String.format("%x",45);
        String s6=String.format("%c",42);

        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
    }
}
