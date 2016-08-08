package io.github.vijitha_venugopal.head_first_java.chapter_10;

import java.util.Date;

/**
 * class for formattng date and time
 * Created by vijitha on 08/08/16.
 */
public class DateTimeFormat {
    public static void main(String[] args) {
        String s1=String.format("Complete date & Time : %tc",new Date());
        System.out.println(s1);

        String s2=String.format("Just the Time : %tr",new Date());
        System.out.println(s2);

        Date today=new Date();
        String s3=String.format("Day of the week,date and month : %ta, %td, %tb",today,today,today);
        System.out.println(s3);
    }
}
