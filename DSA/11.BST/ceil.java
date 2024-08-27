class ceil {
    // Function to return the ceil of given number in BST.
    int findCeil(Node root, int key) 
    {
        if (root == null) 
            return -1;
        int ceil = -1;
        while (root != null) 
        {
            if (root.data == key) 
                return root.data;
                
            if(key<root.data)
            {
                ceil = root.data; // Update node with the current root's data
                root = root.left;
            }
            else
                root = root.right;
        }
        return ceil;
    }
}