package io.github.vijitha_venugopal.head_first_java.package_16;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * Created by vijitha on 13/08/16.
 */
public class SortMoutains {
    LinkedList <Mountain> mtn=new LinkedList <Mountain>();
    class NameCompare implements Comparator <Mountain> {
        public int compare(Mountain one,Mountain two){
            return one.name.compareTo(two.name);
        }
    }
    class Heightcompare implements Comparator <Mountain> {
        public int compare(Mountain one,Mountain two){
            return two.height-one.height;
        }
    }

    public static void main(String[] args) {
        new
                SortMoutains().go();

    }

    private void go() {
        mtn.add(new Mountain("Longs",14255));
        mtn.add(new Mountain("Elbert",14433));
        mtn.add(new Mountain("Maroon",14156));
        mtn.add(new Mountain("Castle",14265));

        System.out.println("as entered :\n"+mtn);
        NameCompare nc=new NameCompare();
        Collections.sort(mtn,nc);
        System.out.println("by name :\n"+mtn);
        Heightcompare hc=new Heightcompare();
        Collections.sort(mtn,hc);
        System.out.println("by height :\n"+mtn);
    }
}
class Mountain {
    String name;
    int height;
    Mountain(String n,int h){
        name=n;
        height=h;
    }
    public String toString(){
        return name+" "+height;
    }
}
