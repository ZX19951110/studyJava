import java.util.*;



class Binary_Tree_Rebuild{
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    static int[] first_arr = {1,2,4,7,3,5,6,8};
    static int[] mid_arr = {4,7,2,1,5,3,8,6};
    TreeNode build(int[] first, int[] mid){
        if(first.length == 0){
            return null;
        }
        int i = 0;
        for (; mid[i] != first[0]; i++);
        TreeNode root = new TreeNode(mid[i]);
        root.left = new Binary_Tree_Rebuild().build(Arrays.copyOfRange(first,1,i+1),Arrays.copyOfRange(mid,0,i+1));
        root.right = new Binary_Tree_Rebuild().build(Arrays.copyOfRange(first,i+1, first.length),Arrays.copyOfRange(mid,i+1,mid.length));
        return root;
    }
    void back(TreeNode root){
        if (root == null){
            return;
        }
        back(root.left);
        back(root.right);
        System.out.println(root.val);
    }
    void first(TreeNode root){
        if (root == null){
            return;
        }
        System.out.println(root.val);
        first(root.left);
        first(root.right);
    }
    void mid(TreeNode root){
        if (root == null){
            return;
        }
        mid(root.left);
        System.out.println(root.val);
        mid(root.right);
    }
    void level_print(Queue<TreeNode> q){
        while (!q.isEmpty()) {
            TreeNode p = q.poll();
            System.out.println(p.val);
            if (p.left != null) {
                q.add(p.left);
            }
            if (p.right != null) {
                q.add(p.right);
            }
        }
    }
    public static void main(String args[]){
        TreeNode root = new Binary_Tree_Rebuild().build(first_arr,mid_arr);
        new Binary_Tree_Rebuild().back(root);
        Queue <TreeNode> queue = new LinkedList<>();
        queue.add(root);
        new Binary_Tree_Rebuild().level_print(queue);
    }
}