package io.github.vijitha_venugopal.head_first_java.chapter_08;

/**
 * class using inheritance and abstraction
 * Created by vijitha on 05/08/16.
 */


class TestBank{
    public static void main(String args[]){
        Bank b=new SBI();
        Bank b1=new PNB();
        int interest=b.getRateOfInterest();
        int interest1=b1.getRateOfInterest();
        System.out.println("Rate of Interest is: "+interest+" %");
        System.out.println("Rate of Interest is: "+interest1+" %");

    }
}
abstract class Bank{
    abstract int getRateOfInterest();
}

class SBI extends Bank{
    int getRateOfInterest(){return 7;}
}
class PNB extends Bank{
    int getRateOfInterest(){return 10;}
}