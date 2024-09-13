class ValidBST 
{
    TreeNode prev=null;    
    public boolean isValidBST(TreeNode root) 
    {
        return isValidBST(root,Long.MIN_VALUE,Long.MAX_VALUE);    
    }
    boolean isValidBST(TreeNode root,long minValue,long maxValue)
    {
        if(root==null)
            return true;
        if(root.val>=maxValue || root.val<=minValue)
            return false;
        return isValidBST(root.left,minValue,root.val) && isValidBST(root.right,root.val,maxValue);
    }
}