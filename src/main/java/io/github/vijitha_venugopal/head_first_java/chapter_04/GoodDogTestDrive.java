package io.github.vijitha_venugopal.head_first_java.chapter_04;

/**
 * class to test working of eccapsulation
 * Created by vijitha on 04/08/16.
 */
public class GoodDogTestDrive {
    public static void main(String[] args) {
        GoodDog one=new GoodDog();
        one.setSize(70);
        GoodDog two=new GoodDog();
        two.setSize(28);
        GoodDog three=new GoodDog();
        three.setSize(0);
        System.out.println("Dog one : "+one.getSize());
        System.out.println("Dog two : "+two.getSize());
        System.out.println("Dog three : "+three.getSize());

        one.bark();
        two.bark();
        three.bark();
    }

}
class GoodDog {
    private int size;

    void setSize(int x) {
      size=x;
    }

    int getSize() {
        return size;
    }

    void bark() {
        if (size>60) {
            System.out.println("Wooof!  Wooof!");
        }
        else if (size>=20 && size<60) {
            System.out.println("Ruff!  Ruff!");
        }
        else if (size>=1 && size<=19) {
            System.out.println("Yip!  Yip!");
        }
        else {
            System.out.println("none");
        }
    }
}