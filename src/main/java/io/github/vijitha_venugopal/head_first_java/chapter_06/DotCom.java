package io.github.vijitha_venugopal.head_first_java.chapter_06;

/**
 * Created by vijitha on 06/08/16.
 */
import java.util.ArrayList;

public class DotCom {

    private String name;

    private ArrayList<String> locationCells;

    public void setLocationCells(ArrayList<String>loc){
        locationCells=loc;

    }

    public void setName(String n){

        name=n;
    }

    public String checkYourself(String userInput){

        String result="miss";

        int index=locationCells.indexOf(userInput);

        if(index>=0){
            locationCells.remove(index);

            if(locationCells.isEmpty()){
                result="kill";
                System.out.println("Ocuch! You sunk "+name +" : (");
            }
            else{
                result="hit";

            }

        }
        return result;
    }

}

