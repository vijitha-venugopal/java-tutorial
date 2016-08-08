package io.github.vijitha_venugopal.head_first_java.chapter_10;

/**class for Wrappers Static Utility Method
 * Created by vijitha on 08/08/16.
 */
public class WrappersStaticUtilityMethod {
    public static void main(String[] args) {
        String s="2";
        int x=Integer.parseInt(s);
        double d=Double.parseDouble("420.24");
        boolean b=new Boolean("true").booleanValue();
        String d1=""+d;
        String d2=Double.toString(d);
        System.out.println(s);
        System.out.println(x);
        System.out.println(d);
        System.out.println(b);
        System.out.println(d1);
        System.out.println(d2);

//        String s="2";
//        int i=Integer.parseInt(s);
//        System.out.println(i);
//
//        String s1="2.23";
//        double d=Double.parseDouble(s1);
//        System.out.println(d);
    }
}
