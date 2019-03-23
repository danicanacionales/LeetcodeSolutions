package tree;

import java.util.Arrays;

public class MaximumBinaryTree {
    /*
    Created by danicanacionales on 21/03/2019

    654. Maximum Binary Tree

    Given an integer array with no duplicates. A maximum tree building on this array is defined as follow:

    The root is the maximum number in the array.
    The left subtree is the maximum tree constructed from left part subarray divided by the maximum number.
    The right subtree is the maximum tree constructed from right part subarray divided by the maximum number.
    Construct the maximum tree by the given array and output the root node of this tree.

    Example 1:
    Input: [3,2,1,6,0,5]
    Output: return the tree root node representing the following tree:

          6
        /   \
       3     5
        \    /
         2  0
           \
            1

    */

    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val = x;
        }
    }

    public static void main(String[] args) {
        int [] nums = { 3, 2, 1, 6, 0, 5 };
        TreeNode root = new MaximumBinaryTree().constructMaximumBinaryTree(nums);

    }

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        int indexOfMax = findMax(nums);
        if(indexOfMax > -1){
            TreeNode node = new TreeNode(nums[indexOfMax]);
            node.left = constructMaximumBinaryTree(Arrays.copyOfRange(nums, 0, indexOfMax));
            node.right = constructMaximumBinaryTree(Arrays.copyOfRange(nums, indexOfMax + 1, nums.length));
            return node;
        }
        return null;
    }

    public int findMax(int [] nums){
        if(nums == null || nums.length == 0)
            return -1;

        int largest = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > nums[largest])
                largest = i;
        }

        return largest;
    }
}
