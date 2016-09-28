package practice;

import java.util.Arrays;

/**
 * Created by Justin on 9/16/2016.
 */
public class LCM {
    public static void main(String[] args) {
        int[] intArray = {32,450,85};

        System.out.println(calcLCM(intArray));
    }

    public static int calcLCM(int[] intArray){
        Arrays.sort(intArray);

        if (intArray.length == 0){
            return 0;
        }

        int lowestCM = intArray[intArray.length - 1];
        boolean found = false;
        for (int i = 1; i < 100000 && !found; i++){
            found = true;
            for (int x : intArray){
               if (lowestCM % x != 0){
                   found = false;
                   lowestCM += intArray[intArray.length - 1];
                   break;
               }
            }
        }


        return lowestCM;
    }
}
