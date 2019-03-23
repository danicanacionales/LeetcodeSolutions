package string;

import java.util.HashSet;

public class UniqueMorseCodeWords {
    /*
    Created by danicanacionales on 22/03/2019

    804. Unique Morse Code Words

    Now, given a list of words, each word can be written as a concatenation of the Morse code of each letter. For example, "cba" can be written as "-.-..--...", (which is the concatenation "-.-." + "-..." + ".-"). We'll call such a concatenation, the transformation of a word.

    Return the number of different transformations among all words we have.

    Example:
        Input: words = ["gin", "zen", "gig", "msg"]
        Output: 2
    */

    public static void main(String[] args) {
        String [] words = { "gin", "zen", "gig", "msg" };
        System.out.println(new UniqueMorseCodeWords().uniqueMorseRepresentations(words));
    }

    public int uniqueMorseRepresentations(String[] words) {
        HashSet<String> set = new HashSet<>();
        String [] code = { ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.." };
        int temp_integer = 96;

        for(String word : words){
            String morseCode = "";
            for(Character ch : word.toCharArray()){
                int position = (int)ch - temp_integer;
                morseCode += code[position - 1];
            }
            set.add(morseCode);
        }

        return set.size();
    }
}
