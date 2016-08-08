package io.github.vijitha_venugopal.head_first_java.chapter_10;

import java.util.Calendar;
import static java.lang.System.out;
/**
 * class using calender and static variables
 * Created by vijitha on 08/08/16.
 */
public class FullMoons {
    private static int DAY_IM=1000*60*60*24;

    public static void main(String[] args) {
        Calendar c=Calendar.getInstance().getInstance();
        c.set(2004,0,7,15,40);
        long day1=c.getTimeInMillis();
        for(int x=0;x<60;x++){
            day1+=(DAY_IM*29.52);
            c.setTimeInMillis(day1);
            out.println(String.format("full moon on %tc",c));
        }
    }
}
