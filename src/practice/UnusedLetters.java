package practice;

import java.util.Scanner;

/**
 * Created by Justin on 4/22/2016.
 */
public class UnusedLetters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner get = new Scanner(System.in);


        int numOfCases = in.nextInt();


        String[] cases = new String[numOfCases];

        int n = 0;
        while (n<numOfCases)
        {
            cases[n]=get.nextLine();
            n++;
        }

        for (int i = 0; i<numOfCases; i++){
            System.out.println("Letters missing in case #" + (i + 1) + ": " + lettersNotUsed(cases[i]));

        }

        in.close();
        get.close();

    }

    public static String lettersNotUsed(String test){
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        boolean[] used = {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false};

        for (int i = 0; i < test.length();i++){
            for (int n = 0; n < alphabet.length; n++){
                if (Character.toLowerCase(test.charAt(i)) == alphabet[n]){
                    used[n] = true;
                }
            }
        }

        String unusedLetters = "";

        for (int i = 0; i < alphabet.length; i++){
            if (!used[i]){
                unusedLetters += alphabet[i];
            }
        }

        return unusedLetters;
    }
}
