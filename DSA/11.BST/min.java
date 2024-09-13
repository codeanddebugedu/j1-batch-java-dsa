class min {
    // Function to find the minimum element in the given BST.
    int minValue(Node root) {
        // code here
        
        while(root.left!=null){
            root=root.left;
        }
        
        return root.data;
    }
}