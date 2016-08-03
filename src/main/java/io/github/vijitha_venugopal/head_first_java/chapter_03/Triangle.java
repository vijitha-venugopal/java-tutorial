package io.github.vijitha_venugopal.head_first_java.chapter_03;

/**
 * Created by vijitha on 03/08/16.
 */
public class Triangle {
    double area;
    int length;
    int height;

    public static void main(String[] args) {
        int x=0;
        Triangle[] ta =new Triangle[4];
        while(x<4) {
            ta[x]=new Triangle();
            ta[x].height=(x+1)*1;
            ta[x].length=x+4;
            ta[x].setArea();
            System.out.print("triangle "+x+", area");
            System.out.println("="+ta[x].area);
            x+=1;
        }
        int y=x;
        x=27;
        Triangle t5=ta[2];
        ta[2].area=343;
        System.out.print("y = "+y);
        System.out.println(", t5 area = "+t5.area);
    }

    private void setArea() {
        area=(height*length)/2;
    }
}
