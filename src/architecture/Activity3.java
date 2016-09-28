package architecture;

/**
 * Created by Justin on 9/15/2016.
 */
public class Activity3 {
    public static void main(String[] args) {
        char[] array = {'t','h','i','s',' ','i','s',' ','a',' ','t','e','s','t'};
        System.out.println(wordCount(array));
        char[] array2 = {};
        System.out.println(wordCount(array2));
    }

    public static int wordCount(char[] cArray){
        int count = 0;
        if (cArray.length == 0){
            return count;  // 0 length means 0 words
        }

        count++;  //array is not empty so it is assumed there is at least one word
        for (char c : cArray){
            if (c == ' ') {
                count++;  //add 1 to count each time delimiter is encountered
            }
        }
        return count;
    }
}
