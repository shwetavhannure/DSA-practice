import java.util.*;

class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val){
            this.val = val;
        }
}

class PostorderTraversal{
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        postorder(root, list);
        return list;
    }

    public void postorder(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }

        postorder(root.left, list);
        postorder(root.right, list);
        list.add(root.val);
    }
}