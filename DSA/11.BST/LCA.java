class LCA 
{
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) 
    {
        if(root.val >= p.val && root.val < q.val)
            return root;
        else if(p.val < root.val  && q.val < root.val)
            root=root.left;
        else
            root=root.right;
    }
}