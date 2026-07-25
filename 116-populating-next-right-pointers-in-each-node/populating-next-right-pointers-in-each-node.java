/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        // Base case: if root is null or we are at a leaf node
        if (root == null || root.left == null) {
            return root;
        }
        
        // 1. Connect the left child to the right child
        root.left.next = root.right;
        
        // 2. Connect the right child to the next node's left child 
        // (if there is a next node across the gap)
        if (root.next != null) {
            root.right.next = root.next.left;
        }
        
        // Recurse for the left and right subtrees
        connect(root.left);
        connect(root.right);
        
        return root;
    }
}