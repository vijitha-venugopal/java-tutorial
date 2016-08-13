package io.github.vijitha_venugopal.head_first_java.package_16;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * Created by vijitha on 13/08/16.
 */
public class TestTree implements Comparator<Book> {
    public static void main(String[] args) {
        new TestTree().go();
    }
    public void go(){
        Book b1=new Book("How Cates work");
        Book b2=new Book("Remix your body");
        Book b3=new Book("Finding Emo");

        TestTree bCompare=new TestTree();
        TreeSet<Book> tree=new TreeSet<Book>(bCompare);
        tree.add(b1);
        tree.add(b2);
        tree.add(b3);
        System.out.println(tree);
    }

    @Override
    public int compare(Book one, Book two) {
        return one.title.compareTo(two.title);
    }
}
class Book implements Comparable{
    String title;
    public Book(String t){
        title=t;
    }

    @Override
    public int compareTo(Object b) {
        Book book=(Book) b;
        return (title.compareTo(book.title));
    }
}