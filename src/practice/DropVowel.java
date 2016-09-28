package practice;

/**
 * Created by Justin on 9/27/2016.
 */
public class DropVowel {
    public static void main(String[] args) {
        String string = "This is the STRING";
        String string2 = "Is it working still: xAEIOUxa";
        System.out.println(dropVowels(string));
        System.out.println(dropVowels(string2));
    }

    
    public static String dropVowels(String string){
        for (int i = 0; i<string.length(); i++) {
            char c = string.charAt(i);
            if (c=='a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' || c=='u' || c=='U'){
                if (i==0){
                    string = string.substring(1);
                }
                else {
                    string = string.substring(0,i) + string.substring(i+1);
                }
                i--;
            }
        }

        return string;
    }
}
