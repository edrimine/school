package practice;

import java.util.HashMap;

/**
 * Created by Justin on 9/28/2016.
 */
public class Hash1 {
    public static void main(String[] args) {
        HashMap<Integer,Double> doubleHash = new HashMap<>(20);
        doubleHash.put(1,15.0);
        System.out.println(doubleHash.get(1));
    }
}
