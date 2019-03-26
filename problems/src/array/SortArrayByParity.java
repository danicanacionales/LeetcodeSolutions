package array;

import java.util.ArrayList;
import java.util.List;

public class SortArrayByParity {
    /*
    Created by danicanacionales on 25/03/2019

    905. Sort Array by Parity
    */

    public static void main(String[] args) {
        int [] A = { 3, 1, 2, 4 };
        A = new SortArrayByParity().sortArrayByParity(A);
    }

    public int[] sortArrayByParity(int[] A) {
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();

        for(int i : A){
            if((i % 2) == 0)
                even.add(i);
            else
                odd.add(i);
        }

        for(int i = 0; i < even.size(); i++){
            A[i] = even.get(i);
        }

        for(int i = even.size(); i < A.length; i++){
            A[i] = odd.get(i - even.size());
        }

        return A;
    }

}
