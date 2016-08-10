package io.github.vijitha_venugopal.head_first_java.chapter_14;

/**
 * class for parsing with string split()
 * Created by vijitha on 10/08/16.
 */
public class ParsingWithStringSplit {
    public static void main(String[] args) {

        String toTest="What is Blue + Yellow/green\n";
        String[] result=toTest.split("/");

        String toTest1="What is Blue + Yellow@green";
        String[] result1=toTest1.split("@");


        for (String token : result) {
            System.out.println(token);
        }

        for (String token1 : result1) {
            System.out.println(token1);
        }
    }
}

