package io.github.vijitha_venugopal.head_first_java.chapter_06;

/**
 * class for test DOt Com Bust Game
 * Created by vijitha on 06/08/16.
 */
import java.util.ArrayList;

public class DotComBust {


    private GameHelper helper= new GameHelper();
    private ArrayList<DotCom>dotComsList=new ArrayList<DotCom>();
    private int numofGuesses=0;


    private void setUpGame(){

        DotCom one=new DotCom();
        one.setName("Pets.com");
        DotCom two=new DotCom();
        two.setName("eToys.com");
        DotCom three=new DotCom();
        three.setName("Go2.com");

        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);

        System.out.println("Your aim is to sink the three dotcoms");
        System.out.println("Pets.com, etoys.com, Go2.com");
        System.out.println("Try to sink them all in the lowest number of guesses");

        for(DotCom dotComToSet:dotComsList){

            ArrayList<String> newLocation=helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }
    }

    private void startPlaying(){

        while(!dotComsList.isEmpty()){
            String userGuess=helper.getUserInput("Enter a Guess!");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    private void checkUserGuess(String userGuess){

        numofGuesses++;
        String result="miss";

        for(DotCom dotComToTest:dotComsList){

            result=dotComToTest.checkYourself(userGuess);

            if(result.equals("hit")){
                break;
            }
            if(result.equals("kill")){
                dotComsList.remove(dotComToTest);
                break;
            }
        }
        System.out.println(result);
    }

    private void finishGame(){

        System.out.println("All the Dot-coms have been sunk. Your stock is worthless!!");

        if (numofGuesses<=18){

            System.out.println("It took you only "+numofGuesses+" guesses");
            System.out.println("You got out  before your options sank.");

        }
        else{

            System.out.println("It took you long enough "+numofGuesses+" guesses.");
            System.out.println("Fish are dancing with Your options");
        }

    }
    public static void main(String[] args) {

        DotComBust game=new DotComBust();
        game.setUpGame();
        game.startPlaying();

    }

}

