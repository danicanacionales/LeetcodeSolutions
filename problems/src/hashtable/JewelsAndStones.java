package hashtable;

import java.util.HashSet;

public class JewelsAndStones {

    /*
    Created by danicanacionales on 22/03/2019

    771. Jewels and Stones

    Given strings J representing types of stones that are jewels, and S representing the stones you have.
    Each character in S is a type of stone you have. You want to know how many stones you have are also jewels.hashtable.JewelsAndStones
    */


    public static void main(String[] args) {

// Example 1
        String J = "aA";
        String S = "aAAbbbb";

// Example 2
//        String J = "z";
//        String S = "ZZ";
        System.out.println(new JewelsAndStones().numJewelsInStones(J, S));
    }

    public int numJewelsInStones(String J, String S){
        HashSet<Character> set = new HashSet<>();
        for(Character jChar : J.toCharArray()){
            if(!set.contains(jChar)){
                set.add(jChar);
            }
        }

        int numberOfJewels = 0;
        for(Character sChar : S.toCharArray()){
            if(set.contains(sChar)){
                numberOfJewels++;
            }
        }

        return numberOfJewels;
    }
}
