package io.github.vijitha_venugopal.head_first_java.chapter_11;

/**
 * class using userdefined Exception
 * Created by vijitha on 09/08/16.
 */



class TestCustomException1{

    private static void validate(int age)throws InvalidAgeException{
        if(age<18)
            throw new InvalidAgeException("not valid");
        else
            System.out.println("welcome to vote");
    }

    public static void main(String args[]){
        try{
            validate(-25);
        }catch(Exception m){System.out.println("Exception occured: "+m);}

        System.out.println("rest of the code...");
    }
}
class InvalidAgeException extends Exception{
    InvalidAgeException(String s){
        super(s);
    }
}