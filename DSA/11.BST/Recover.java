class Recover {
    TreeNode prev = null, first = null, second = null;

    public void recoverTree(TreeNode root) {
        func(root);
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }

    private void func(TreeNode curr) {
        if (curr == null)
            return;
        func(curr.left);
        if (prev != null && prev.val > curr.val) {
            if (first == null)
                first = prev;
            second = curr;
        }
        prev = curr;
        func(curr.right);
    }
}