package binary_search;

import java.util.Stack;

public class RangeSumOfBST {
    /*
    Created by danicanacionales on 21/03/2019

    938. Range Sum of BST

    Given the root node of a binary search tree, return the sum of values of all nodes with value between L and R (inclusive).

    Example 1:
        Input: root = [10,5,15,3,7,null,18], L = 7, R = 15
        Output: 32

    Example 2:
        Input: root = [10,5,15,3,7,13,18,1,null,6], L = 6, R = 10
        Output: 23
    */

    public static class TreeNode{
        int val;
        private TreeNode left;
        private TreeNode right;

        TreeNode(int x){
            val = x;
        }
    }

    public static void main(String[] args) {
//        Sample Tree
        TreeNode root = new TreeNode(10);
        TreeNode five = new TreeNode(5);
        TreeNode twenty = new TreeNode(20);
        TreeNode thirteen = new TreeNode(13);
        TreeNode three = new TreeNode(3);
        TreeNode nine = new TreeNode(9);
        TreeNode fifteen = new TreeNode(15);
        TreeNode twentyfive = new TreeNode(25);
        TreeNode seventeen = new TreeNode(17);
        TreeNode thirty = new TreeNode(30);
        TreeNode four = new TreeNode(4);
        TreeNode one = new TreeNode(1);

        three.left = one;
        three.right = four;
        five.left = three;
        five.right = nine;
        nine.right = thirteen;
        root.left = five;
        root.right = twenty;
        fifteen.right = seventeen;
        twenty.left = fifteen;
        twenty.right = twentyfive;
        twentyfive.right = thirty;

        int L = 5, R = 25;
        System.out.println(new RangeSumOfBST().rangeSumBST(root, L, R));
    }

    public int rangeSumBST(TreeNode root, int L, int R) {
        TreeNode current = root;
        Stack<TreeNode> stack = new Stack<>();
        int sum = 0;
        while(current != null || !stack.empty()){
            while(current != null){
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            if(current.val >= L && current.val <= R){
                sum += current.val;
            }
            current = current.right;
        }

        return sum;
    }
}
