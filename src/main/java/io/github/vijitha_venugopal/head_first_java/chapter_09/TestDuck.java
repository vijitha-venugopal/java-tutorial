package io.github.vijitha_venugopal.head_first_java.chapter_09;

/**
 * class using constructors
 * Created by vijitha on 05/08/16.
 */
public class TestDuck {
    public static void main(String[] args) {
        int weight=8;
        float density=2.3f;
        String name="Donald";
        long[] feathers={1,2,3,4,5,6};
        boolean canFly=true;
        int airspeed=22;
        ConstructorDuckTest[] d=new ConstructorDuckTest[7];
        d[0]=new ConstructorDuckTest();
        d[1]=new ConstructorDuckTest(density,weight);
        d[2]=new ConstructorDuckTest(name,feathers);
        d[3]=new ConstructorDuckTest(canFly);
        d[4]=new ConstructorDuckTest(3.3f,airspeed);
        d[5]=new ConstructorDuckTest(false);
        d[6]=new ConstructorDuckTest(airspeed,density);
    }
}

class ConstructorDuckTest{
    private  int ponds=6;
    private  float floatability=2.1f;
    private String name="Generic";
    private long[] feathers={1,2,3,4,5,6};
    private boolean canFly=true;
    private int maxSpeed=25;

    ConstructorDuckTest() {
        System.out.println("type 1 duck");
    }
    ConstructorDuckTest(boolean fly) {
        System.out.println("type 2 duck");
    }
    ConstructorDuckTest(String n,long[] f) {
        name=n;
        feathers=f;
        System.out.println("type 3 duck");
    }
    ConstructorDuckTest(int w,float f) {
        ponds=w;
        floatability=f;
        System.out.println("type 4 duck");
    }
    ConstructorDuckTest(float density,int max){
        floatability=density;
        maxSpeed=max;
        System.out.println("type 5 duck");
    }

}
