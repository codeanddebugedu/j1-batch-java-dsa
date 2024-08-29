                                
// Definition of TreeNode structure
// for a binary tree node
class TreeNode {
    // Value of the node
    int val;

    // Pointer to the left child node
    TreeNode left;

    // Pointer to the right child node
    TreeNode right;

    // Constructor to initialize the node with a
    // value and set left and right pointers to null
    TreeNode(int x) {
        val = x;
        left = null;
        right = null;
    }
}

class Sol {
    // Function to find the inorder successor
    // of a node in a BST
    TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        TreeNode successor = null;

        // Traverse until root is not null
        while (root != null) {
            // If the value of p is greater or equal
            // to the current root's value
            if (p.val >= root.val) {
                // Move to the right subtree
                root = root.right;
            } else {
                // If the value of p is smaller,
                // move to the left subtree
                // Update the successor to the
                // current root and traverse left
                successor = root;
                root = root.left;
            }
        }

        // Return the inorder successor node
        return successor;
    }
}

// Main class
public class inordersucc {
    // Function to perform an in-order traversal
    // of a binary tree and print its nodes
    static void printInOrder(TreeNode root) {
        // Check if the current node
        // is null (base case for recursion)
        if (root == null) {
            // If null, return and
            // terminate the function
            return;
        }

        // Recursively call printInOrder
        // for the left subtree
        printInOrder(root.left);

        // Print the value of the current node
        System.out.print(root.val + " ");

        // Recursively call printInOrder
        // for the right subtree
        printInOrder(root.right);
    }

    // Main method
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Constructing the BST
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(7);

        System.out.print("BST: ");
        printInOrder(root);
        System.out.println();

        // Node for which we want to
        // find the inorder successor
        TreeNode p = root.left.right;

        // Find the inorder successor
        TreeNode successor = solution.inorderSuccessor(root, p);

        // Print the inorder successor's value
        if (successor != null) {
            System.out.println("Inorder Successor of " + p.val + " is: " + successor.val);
        } else {
            System.out.println("Inorder Successor of " + p.val + " does not exist.");
        }
    }
}
    
                                
                            