public class TreeDeep {
    public int getDeep(Binary_Tree_Rebuild.TreeNode tree){
        if (tree == null) return 0;
        return Math.max(getDeep(tree.left), getDeep(tree.right))+1;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        Binary_Tree_Rebuild.TreeNode tree = new BuildBST().build(arr);
        System.out.println(new TreeDeep().getDeep(tree));
    }
}
