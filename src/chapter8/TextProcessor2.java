package chapter8;

public class TextProcessor2 {
    public static void main(String[] args){
//        countWords("I love Test Automation University");
//        reverseString("Hello TAU!");
        addSpaces("HeyWorld!It'sMeAngie");
    }

    /**
     * Splits a string into an array by tokenizing it.
     * counts words and prints them
     * @param text full string to be split
     */
    public static void countWords(String text){

    }

    /**
     * Prints a string in a reverse order
     * @param text String to reverse
     */

    public static void reverseString(String text){
        for(int i=text.length()-1; i>=0; i--){
            System.out.print(text.charAt(i));
        }
    }

    /**
     * adds spaces before each uppercase letter
     * @param text jumbled text
     */
    public static void addSpaces(String text){
        var modifiedText = new StringBuilder(text);

        for(int i=0; i< modifiedText.length(); i++){
            if(i!=0 && Character.isUpperCase(modifiedText.charAt(i))){
                modifiedText.insert(i, " ");
                i++;
            }
        }

        System.out.println(modifiedText);

    }

}
