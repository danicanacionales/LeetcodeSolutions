package hashtable;

import java.util.Hashtable;
import java.util.Map;

public class NRepeatedElementInSize2NArray {
    /*
    Created by danicanacionales on 23/03/2019

    961. N-Repeated Element in Size 2N Array

    In a array A of size 2N, there are N+1 unique elements, and exactly one of these elements is repeated N times.

    Return the element repeated N times.

    Example 1:
        Input: [5,1,5,2,5,3,5,4]
        Output: 5
    */

    public static void main(String[] args) {
        int [] A = { 1,2,3,3 };
        System.out.println(new NRepeatedElementInSize2NArray().repeatedNTimes(A));
    }

    public int repeatedNTimes(int[] A) {
        Hashtable<Integer, Integer> table = new Hashtable<>();
        for(int i = 0; i < A.length; i++){
            if(table.containsKey(A[i])){
                table.put(A[i], (table.get(A[i]) + 1));
            }else{
                table.put(A[i], 1);
            }
        }

        int value = A.length / 2;
        for(Map.Entry<Integer, Integer> entry : table.entrySet()){
            if(entry.getValue() == value){
                return entry.getKey();
            }
        }

        return -1;
    }
}
