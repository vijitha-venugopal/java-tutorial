package io.github.vijitha_venugopal.head_first_java.chapter_10;

import java.util.Calendar;

/**
 * class for working with a calender objects
 * Created by vijitha on 08/08/16.
 */
public class WorkingWithCalenObjects {

    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();
        System.out.println("The current date is : " + cal.getTime());
        cal.add(Calendar.DATE, 20);
        System.out.println("20 days later: " + cal.getTime());
        cal.add(Calendar.MONTH, -2);
        System.out.println("2 months ago: " + cal.getTime());
        cal.add(Calendar.YEAR, -5);
        System.out.println("5 years ago: " + cal.getTime());

        System.out.println("ERA: " + cal.get(Calendar.ERA));
        System.out.println("Day of week: " + cal.get(Calendar.DAY_OF_WEEK));
        System.out.println("Day of week in month: " + cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println("December: " + cal.get(Calendar.DECEMBER));
        System.out.println("Date: " + cal.get(Calendar.DATE));
        System.out.println("MONTH: " + cal.get(Calendar.MONTH));
        System.out.println("YEAR: " + cal.get(Calendar.YEAR));

        System.out.println(cal.getTimeInMillis());

        cal.set(Calendar.DATE,1);
        System.out.println("set to 1 : " + cal.getTime());

        cal.roll(Calendar.DATE,30);
        System.out.println("roll 30 days : " + cal.getTime());

        cal.set(2016,7,8,14,37);
        System.out.println("current date: " + cal.getTime());
    }
}
