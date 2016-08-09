package io.github.vijitha_venugopal.head_first_java.chapter_11;

/**
 * class using exception
 * Created by vijitha on 09/08/16.
 */
class MyEx extends Exception {

}
public class ExTestDrive {
    public static void main(String[] args) {
        String test=args[0];
        try {
            System.out.print("t");
            doRisky(test);
            System.out.print("o");
        }
        catch (MyEx e){
            System.out.print("a");
        }
        finally {
            System.out.print("w");
        }
        System.out.println("s");
    }
    private static void doRisky(String t) throws MyEx {
        System.out.print("h");
        if("yes".equals(t)) {
            throw new MyEx();
        }
        System.out.print("r");
    }
}



