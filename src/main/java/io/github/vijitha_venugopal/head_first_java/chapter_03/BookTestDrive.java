package io.github.vijitha_venugopal.head_first_java.chapter_03;

/**
 * Created by vijitha on 03/08/16.
 */
public class BookTestDrive {
    public static void main(String[] args) {
        Books[] myBooks=new Books[3];
        int x=0;

        myBooks[0] =new Books();
        myBooks[1] =new Books();
        myBooks[2] =new Books();

        myBooks[0].title="The Grapes of java";
        myBooks[1].title="The java Gatsby";
        myBooks[2].title="The java cookbook";

        myBooks[0].author="bob";
        myBooks[1].author="sue";
        myBooks[2].author="ian";

        while (x<3) {
            System.out.print(myBooks[x].title);
            System.out.print(" by ");
            System.out.println(myBooks[x].author);
            x=x+1;
        }
    }
}
class Books {
    String title;
    String author;
        }