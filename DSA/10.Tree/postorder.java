class postorder 
{
    List<Integer> list=new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) 
    {
        if(root==null)
            return list;
        else
        {
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            list.add(root.val);
        }
        return list;
    }
}