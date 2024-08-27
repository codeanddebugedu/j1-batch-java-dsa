class search_rec 
{
    public TreeNode searchBST(TreeNode root, int val) 
    {
        if(root==null || root.val==val)
            return root;
        else if(val<root.val)
            return searchBST(root.left,val);
        else
            return searchBST(root.right,val);    
    }
}