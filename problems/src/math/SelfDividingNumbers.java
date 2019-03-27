package math;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    /*
    Created by danicanacionales on 27/03/2019

    728. Self Dividing Numbers

    A self-dividing number is a number that is divisible by every digit it contains.

    Example 1:
        Input: left = 1, right = 22
        Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
    */

    public static void main(String[] args) {
        int left = 1, right = 22;
        List<Integer> output = new SelfDividingNumbers().selfDividingNumbers(left, right);
        for(Integer i : output){
            System.out.println(i);
        }
    }

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for(int i = left, n = 0; i <= right; i++){
            for(n = i; n > 0; n /= 10){
                if(n % 10 == 0 || i % (n % 10) != 0) break;
            }

            if(n == 0)
                list.add(i);
        }

        return list;
    }

//    public List<Integer> selfDividingNumbers(int left, int right) {
//        List<Integer> list = new ArrayList<>();
//        for(int i = left; i <= right; i++){
//            if(String.valueOf(i).contains("0"))
//                continue;
//            else if(i < 10){
//                list.add(i);
//                continue;
//            }
//
//            boolean isValid = true;
//            String str = Integer.toString(i);
//            for(int x = 0; x < str.length(); x++){
//                int y = Character.getNumericValue(str.charAt(x));
//                if (i % y > 0){
//                    isValid = false;
//                    break;
//                }
//            }
//
//            if(isValid)
//                list.add(i);
//        }
//
//        return list;
//    }
}
