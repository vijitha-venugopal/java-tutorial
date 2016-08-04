package io.github.vijitha_venugopal.head_first_java.chapter_04;

/**
 * class file
 * Created by vijitha on 04/08/16.
 */
class ParametersAndReturnType{

    public static void main(String args[]) // ->method prototype.
    {

        ParametersAndReturnType obj= new ParametersAndReturnType();

        int x=obj.add(1,2);
        System.out.println(x);

    }

    private int add(int a, int b){

        return a+b;
    }
}