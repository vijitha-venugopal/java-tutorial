package io.github.vijitha_venugopal.head_first_java.chapter_11;

/**
 * class for user defined exceptions
 * Created by vijitha on 09/08/16.
 */
public class UserDefinedException {
    public static void main(String[] args)throws Exception
    {
        int price = 120;

        if(price < 0)
            throw new MyOwnExceptionClass(price);
        else
            System.out.println("Your price is :"+price);
    }
}
class MyOwnExceptionClass extends Exception {

    private int price;

    MyOwnExceptionClass(int price){
        this.price = price;
    }

    public String toString(){
        return "Price should not be in negative, you are entered" +price;
    }

}