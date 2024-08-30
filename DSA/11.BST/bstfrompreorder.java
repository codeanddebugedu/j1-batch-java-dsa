class Bstfrompreorder {
    int i = 0;
    public TreeNode bstFromPreorder(int[] arr) 
    {
        return helper(arr, Integer.MAX_VALUE);
    }

    public TreeNode helper(int[] arr, int bound) 
    {
        if (i == arr.length || arr[i] > bound) 
            return null;
        TreeNode root = new TreeNode(arr[i++]);
        root.left = helper(arr, root.val);
        root.right = helper(arr, bound);
        return root;
    }
}
	