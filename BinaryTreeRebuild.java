import java.util.Arrays;

public class BinaryTreeRebuild {
    TreeNodeNew PreMinBuild(int[] pre, int[] mid){
        if(pre.length == 0){
            return null;
        }
        TreeNodeNew node = new TreeNodeNew(pre[0]);
        int mid_index = 0;
        while (mid[mid_index] != pre[0]) mid_index++;
        node.left = PreMinBuild(Arrays.copyOfRange(pre,1, mid_index + 1),Arrays.copyOfRange(mid, 0, mid_index));
        node.right = PreMinBuild(Arrays.copyOfRange(pre, mid_index + 1, pre.length), Arrays.copyOfRange(mid, mid_index + 1, mid.length));
        return node;
    }
    void PreTravel(TreeNodeNew root){
        if(root == null){
            return;
        }
        System.out.println(root.value);
        PreTravel(root.left);
        PreTravel(root.right);
    }
    public static void main(String[] args){
        int[] pre = {1, 2, 4, 5, 3, 6};
        int[] mid = {4, 2, 5, 1, 6, 3};
        TreeNodeNew root = new BinaryTreeRebuild().PreMinBuild(pre, mid);
        new BinaryTreeRebuild().PreTravel(root);
    }
}
