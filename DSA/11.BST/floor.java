class Floor {
    public static int floor(Node root, int x) {
        // Code here
        if(root == null){
            return -1;
        }
        
        int floor = -1;
        
        while(root != null)
        {
            if(root.data == x)
            {
                floor = root.data;
                return floor;
            }
            else if(root.data < x)
            {
                floor = root.data;
                root = root.right;
            }
            else
                root = root.left;
        }
        
        return floor;
    }
}