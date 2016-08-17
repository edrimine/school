package practice;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Justin on 4/30/2016.
 */
public class Carryover {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String line = "";
        ArrayList<String> input = new ArrayList<>();
        while (true){
            line = in.nextLine();
            if (line.equals("0 0")){
                break;
            }
            input.add(line);
        }


        getCarryover(input);
    }

    public static void getCarryover(ArrayList<String> input){
        String[] number = new String[2];
        for (int i = 0; i<input.size(); i++){
            number = input.get(i).split(" ");
            int carryoverOperations = 0;
            boolean carryover = false;

            if(number[0].length()<number[1].length()) {
                for (int n = 0; n < number[0].length(); n++) {
                    if (Character.getNumericValue(number[0].charAt(number[0].length()-1-n)) + Character.getNumericValue(number[1].charAt(number[1].length()-1-n)) + 1 >= 10 && carryover){
                        carryover = true;
                        carryoverOperations++;
                    }
                    else if (Character.getNumericValue(number[0].charAt(number[0].length()-1-n)) + Character.getNumericValue(number[1].charAt(number[1].length()-1-n)) >= 10){
                        carryover = true;
                        carryoverOperations++;
                    }
                    else {
                        carryover = false;
                    }

                    if (n==number[0].length()-1 && carryover){
                        for (int j = 0; j<(number[1].length()-number[0].length());j++){
                            if ((Character.getNumericValue(number[1].charAt(number[1].length()-number[0].length()-1-j)))+1>=10){
                                carryoverOperations++;
                            }
                            else break;
                        }
                    }
                }
            }
            else if (number[0].length()>number[1].length()){
                for (int n = 0; n < number[1].length(); n++) {
                    if (Character.getNumericValue(number[0].charAt(number[0].length()-1-n)) + Character.getNumericValue(number[1].charAt(number[1].length()-1-n)) + 1 >= 10 && carryover){
                        carryover = true;
                        carryoverOperations++;
                    }
                    else if (Character.getNumericValue(number[0].charAt(number[0].length()-1-n)) + Character.getNumericValue(number[1].charAt(number[1].length()-1-n)) >= 10){
                        carryover = true;
                        carryoverOperations++;
                    }
                    else {
                        carryover = false;
                    }

                    if (n==number[1].length()-1 && carryover){
                        for (int j = 0; j<(number[0].length()-number[1].length());j++){
                            if ((Character.getNumericValue(number[0].charAt(number[0].length()-number[1].length()-1-j)))+1>=10){
                                carryoverOperations++;
                            }
                            else break;
                        }
                    }
                }
            }
            else {
                for (int n = 0; n < number[0].length(); n++) {
                    if (Character.getNumericValue(number[0].charAt(number[0].length()-1-n)) + Character.getNumericValue(number[1].charAt(number[1].length()-1-n)) + 1 >= 10 && carryover){
                        carryover = true;
                        carryoverOperations++;
                    }
                    else if (Character.getNumericValue(number[0].charAt(number[0].length()-1-n)) + Character.getNumericValue(number[1].charAt(number[1].length()-1-n)) >= 10){
                        carryover = true;
                        carryoverOperations++;
                    }
                    else {
                        carryover = false;
                    }
                }
            }


            System.out.println(carryoverOperations + " carryovers");
        }
    }
}
