package io.github.vijitha_venugopal.head_first_java.chapter_05;

/**
 * class find output of program
 * Created by vijitha on 04/08/16.
 */
public class Output {
    public static void main(String[] args) {
        Output o=new Output();
        o.go();
    }

    private void go() {
        int y=7;
        for(int x=1;x<8;x++) {
            y++;
            if(x>4) {
                System.out.print(++y + " ");
            }
            if(y>14) {
                System.out.println("x = " +x);
                break;
            }
        }
    }

}
