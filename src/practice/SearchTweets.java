package practice;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by Justin on 4/28/2016.
 */
public class SearchTweets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numOfTweets = in.nextInt();

        in.nextLine();

        String[] tweets = new String[numOfTweets];

        for (int i = 0; i<numOfTweets; i++){
            tweets[i] = in.nextLine();
        }

        int count = 0;

        for (int i = 0; i<numOfTweets; i++) {
            count+=check(tweets[i]);
        }

        System.out.println("Number of tweets: " + count);

        in.close();
    }

    public static int check(String checkString){

        CharSequence input = checkString;
        if (Pattern.matches("@[Bb][Rr][Ii][Tt][Ii][Ss][Hh][Mm][Oo][Nn][Aa][Rr][Cc][Hh][Yy]",input)){
            return 1;
        }
        else {
            return 0;
        }

    }
}
