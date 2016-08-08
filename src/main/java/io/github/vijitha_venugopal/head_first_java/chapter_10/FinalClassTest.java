package io.github.vijitha_venugopal.head_first_java.chapter_10;

/**
 * class for testing Final class
 * Created by vijitha on 08/08/16.
 */
class FinalClassTest {
    private void demo(){
        System.out.println("FinalClassTest Method");
    }
    public static void main(String args[]){
        FinalClassTest obj= new FinalClassTest();
        obj.demo();

    }
}


final class FinalClass{
            void demo(){
                System.out.println("FinalClass method");
            }

}


