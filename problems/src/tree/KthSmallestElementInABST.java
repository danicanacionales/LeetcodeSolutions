package tree;

import java.util.Stack;

public class KthSmallestElementInABST {
    /*
    Created by danicanacionales on 21/03/2019

    230. Kth Smallest Element in a BST

    Given a binary search tree, write a function kthSmallest to find the kth smallest element in it.

    Example 1:
        Input: root = [3,1,4,null,2], k = 1
           3
          / \
         1   4
          \
           2
        Output: 1
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

        int k = 5;
        System.out.println(new KthSmallestElementInABST().kthSmallest(root, k));
    }

    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        int ctr = 0;
        while((current != null || !stack.empty()) && ctr < k) {
            while(current != null){
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            if((ctr + 1) >= k)
                return current.val;
            current = current.right;
            ctr++;
        }
        return -1;
    }
}
