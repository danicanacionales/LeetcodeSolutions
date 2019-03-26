package bit_manipulation;

public class HammingDistance {
    /*
    Created by danicanacionales on 27/03/2019

    461. Hamming Distance

    The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

    Example 1:
        Input: x = 1, y = 4
        Output: 2
    */

    public static void main(String[] args) {
        int x = 1, y = 4;
        System.out.println(new HammingDistance().hammingDistance(x,y));
    }

    public int hammingDistance(int x, int y) {
        String xStr = String.format("%32s", Integer.toBinaryString(x)).replace(' ', '0');
        String yStr = String.format("%32s", Integer.toBinaryString(y)).replace(' ', '0');

        int ctr = 0;
        for(int i = 0; i < xStr.length(); i++){
            if (xStr.charAt(i) != yStr.charAt(i))
                ctr++;
        }

        return ctr;
    }

//    public int hammingDistance(int x, int y) {
//        return Integer.bitCount(x ^ y);
//    }
}
