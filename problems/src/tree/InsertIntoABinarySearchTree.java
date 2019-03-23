package tree;

public class InsertIntoABinarySearchTree {
    /*
    Created by danicanacionales on 21/03/2019

    701. Insert into a Binary Search Tree

    Given the root node of a binary search tree (BST) and a value to be inserted into the tree, insert the value into the BST. Return the root node of the BST after the insertion. It is guaranteed that the new value does not exist in the original BST.

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
        InsertIntoABinarySearchTree insertBST = new InsertIntoABinarySearchTree();
        TreeNode root = new TreeNode(4);
        TreeNode two = insertBST.insertIntoBST(root, 2);
        TreeNode one = insertBST.insertIntoBST(root, 1);
        TreeNode three = insertBST.insertIntoBST(root, 3);
        TreeNode seven = insertBST.insertIntoBST(root, 7);
        TreeNode five = insertBST.insertIntoBST(root, 5);
    }

    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode current = root;
        if(val < current.val){
            if(current.left == null){
                current.left = new TreeNode(val);
            }else{
                insertIntoBST(current.left, val);
            }
        }else if(val > current.val){
            if(current.right == null){
                current.right = new TreeNode(val);
            }else{
                insertIntoBST(current.right, val);
            }
        }

        return root;
    }
}
