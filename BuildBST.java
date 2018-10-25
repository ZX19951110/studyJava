import java.util.Arrays;

public class BuildBST {
    protected Binary_Tree_Rebuild.TreeNode build(int[] arr){
        if (arr.length == 0){
            return null;
        }
        Binary_Tree_Rebuild.TreeNode root = null;
        if(arr.length % 2 == 1){
            root = new Binary_Tree_Rebuild().new TreeNode(arr[(arr.length-1)/2]);
            root.left = this.build(Arrays.copyOfRange(arr,0, (arr.length-1)/2));
            root.right = this.build(Arrays.copyOfRange(arr,(arr.length-1)/2+1, arr.length));
            return root;
        }
        else{
            root = new Binary_Tree_Rebuild().new TreeNode(arr[arr.length/2]);
            root.left = this.build(Arrays.copyOfRange(arr,0, arr.length/2));
            root.right = this.build(Arrays.copyOfRange(arr,arr.length/2+1, arr.length));
            return root;
        }
    }
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5,6};
        Binary_Tree_Rebuild.TreeNode tree = new BuildBST().build(arr);
        new Binary_Tree_Rebuild().mid(tree);
    }
}
