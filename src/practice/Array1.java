package practice;

import java.util.ArrayList;

/**
 * Created by Justin on 9/28/2016.
 */
public class Array1 {
    public static void main(String[] args) {
        ArrayList<Integer> intArray = new ArrayList<>();
        fillArray(intArray, 15);
        System.out.println(intArray);
    }

    public static int fillArray(ArrayList<Integer> intArray, int size){
        for (int i=0; i<size; i++){
            intArray.add(i);
        }
        return 1;
    }
}
