package string;

import java.util.HashMap;

public class IntegerToRoman {
    /*
    Created by danicanacionales on 21/03/2019

    12. Integer to Roman

    Given an integer, convert it to a roman numeral. Input is guaranteed to be within the range from 1 to 3999.
    Example 1:
        Input: 1994
        Output: "MCMXCIV"
        Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

    Example 2:
        Input: 58
        Output: "LVIII"
        Explanation: L = 50, V = 5, III = 3.
    */

    public static void main(String[] args) {
        int num = 3999;
        System.out.println(new IntegerToRoman().intToRoman(num));
    }

    public String intToRoman(int num) {
        String output = "";
        String str = Integer.toString(num);

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "I");
        map.put(5, "V");
        map.put(10, "X");
        map.put(50, "L");
        map.put(100, "C");
        map.put(500, "D");
        map.put(1000, "M");

        for(int i = 0; i < str.length(); i++){
            int place = (int) Math.pow(10, (str.length() - 1) - i);
            int digit = Character.getNumericValue(str.charAt(i));
            if(digit >= 5 && digit < 9){
                output = output.concat(map.get(place * 5));
                digit = digit % 5;
            }

            if(digit < 4){
                for(int j = 0; j < digit; j++){
                    output = output.concat(map.get(place));
                }
            }

            if(digit == 9){
                output = output.concat(map.get(place));
                output = output.concat(map.get(place * 10));
            }

            if(digit == 4) {
                output = output.concat(map.get(place));
                output = output.concat(map.get(place * 5));
            }
        }

        return output;
    }
}
