import java.util.*;

class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val){
            this.val = val;
        }
}

class LevelorderTraversal{
    public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> list = new ArrayList<>();

    if(root == null) return list;

    Queue<TreeNode> q = new LinkedList<>();
    q.add(root);

    while(!q.isEmpty()){
        int size = q.size();
        List<Integer> level = new ArrayList<>();

        for(int i = 0; i < size; i++){
            TreeNode curr = q.remove();
            level.add(curr.val);

            if(curr.left != null) q.add(curr.left);
            if(curr.right != null) q.add(curr.right);
        }

        list.add(level);
    }
    return list;
   }
}