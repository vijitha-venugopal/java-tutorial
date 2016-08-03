package io.github.vijitha_venugopal.head_first_java.chapter_01;

/**
 * Created by vijitha on 03/08/16.
 */
public class PhraseOMatic {
    public static void main(String[] args) {
        String[] wordListOne={"24/7","multi-Tiesr","30,000 foot"};
        String[] wordListTwo={"empowered","sticky","Value-added"};
        String[] wordListThree={"process","tippingpoint","solution"};

        int oneLength=wordListOne.length;
        int twoLength=wordListTwo.length;
        int threeLength=wordListThree.length;

        int rand1=(int)(Math.random()*oneLength);
        int rand2=(int)(Math.random()*twoLength);
        int rand3=(int)(Math.random()*threeLength);

        String phrase=wordListOne[rand1]+" "+wordListTwo[rand2]+" "+wordListThree[rand3];
        System.out.println("What we need is a"+phrase);
    }
}
