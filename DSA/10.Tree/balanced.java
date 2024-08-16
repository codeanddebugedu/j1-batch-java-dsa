class Balanced 
{
    public boolean isBalanced(TreeNode root) 
    {
        if(height(root)==-1)
            return false;
        return true;
    }
    int height(TreeNode root)
    {
        if(root == null)
            return 0;
        int left=height(root.left);
        int right=height(root.right);
        if (left == -1 || right == -1)  
            return -1;
        if(Math.abs(left-right)>1)
            return -1;
        return 1 + Math.max(left,right);
    }
}