package io.github.vijitha_venugopal.head_first_java.package_16;

import java.util.HashMap;

/**
 * Created by vijitha on 13/08/16.
 */
public class TestMap {
    public static void main(String[] args) {
        HashMap<String,Integer>scores=new HashMap<String,Integer>();
        scores.put("kathy",42);
        scores.put("Bert",343);
        scores.put("Skyler",420);

        System.out.println(scores);
        System.out.println(scores.get("Bert"));
    }
}
