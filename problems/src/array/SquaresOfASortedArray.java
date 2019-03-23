package array;

public class SquaresOfASortedArray {
    /*
    Created by danicanacionales on 23/03/2019

    977. Squares of a Sorted Array

    Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number, also in sorted non-decreasing order.

    Example 1:
        Input: [-4,-1,0,3,10]
        Output: [0,1,9,16,100]
    */

    public static void main(String[] args) {
        int [] A = { -4, -1, 0, 3, 10 };
        A = new SquaresOfASortedArray().sortedSquares(A);
    }

    public int [] sortedSquares(int [] A){
        for(int i = 0; i < A.length; i++){
            A[i] = A[i] * A[i];
        }

        return quickSort(A, 0, A.length - 1);
    }

    int[] quickSort(int [] A, int start, int end) {
        if(start >= end)
            return A;

        int pIndex = partition(A, start, end);
        A = quickSort(A, start, pIndex - 1);
        A = quickSort(A, pIndex + 1, end);

        return A;
    }

    int partition(int [] A, int start, int end){
        int pIndex = start;
        int pivot = A[end];

        for(int i = start; i < end; i++){
            if(A[i] <= pivot){
                A = swap(A, pIndex, i);
                pIndex++;
            }
        }

        A = swap(A, end, pIndex);
        return pIndex;
    }

    int [] swap(int [] A, int index1, int index2){
        int temp = A[index1];
        A[index1] = A[index2];
        A[index2] = temp;

        return A;
    }
}
