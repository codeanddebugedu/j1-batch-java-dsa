class preorder 
{
    public List<Integer> preorderTraversal(TreeNode root) 
    {
        List<Integer> list=new ArrayList<>();
        list=preorder(root,list);
        return list;
    }
    List<Integer> preorder(TreeNode root,List<Integer> list)
    {
        if(root == null)
            return  list;
        list.add(root.val);
        preorder(root.left,list);
        preorder(root.right,list);

        return list;
    }
}