package io.github.vijitha_venugopal.head_first_java.chapter_10;

/**
 * class for Testing Final method
 * Created by vijitha on 08/08/16.
 */

class FinalMethodTest extends FinalMethod{
    public static void main(String args[]){
        FinalMethodTest obj= new FinalMethodTest();
        obj.demo();
    }
}
class FinalMethod{
    final void demo(){
        System.out.println("XYZ Class Method");
    }
}