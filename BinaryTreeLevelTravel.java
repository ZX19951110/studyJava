import java.util.LinkedList;
import java.util.List;

public class BinaryTreeLevelTravel {
    public void levelTravel(Binary_Tree_Rebuild.TreeNode tree){
        List<Binary_Tree_Rebuild.TreeNode> treeNodes = new LinkedList<>();
        treeNodes.add(tree);
        while (!treeNodes.isEmpty()){
            Binary_Tree_Rebuild.TreeNode current = ((LinkedList<Binary_Tree_Rebuild.TreeNode>) treeNodes).getFirst();
            if(current.left != null) treeNodes.add(current.left);
            if(current.right != null) treeNodes.add(current.right);
            System.out.println(current.val);
            ((LinkedList<Binary_Tree_Rebuild.TreeNode>) treeNodes).removeFirst();
        }
    }public void levelTravelReverse(Binary_Tree_Rebuild.TreeNode tree){
        List<Binary_Tree_Rebuild.TreeNode> treeNodes = new LinkedList<>();
        treeNodes.add(tree);
        Binary_Tree_Rebuild.TreeNode current = tree;
        int i = 0;
        while (current.right != null || current.left != null){
            if(current.right != null){
                treeNodes.add(current.right);
            }
            if(current.left != null){
                treeNodes.add(current.left);
            }
            i++;
            current = treeNodes.get(i);
        }
        while (!treeNodes.isEmpty()){
            System.out.println(((LinkedList<Binary_Tree_Rebuild.TreeNode>) treeNodes).getLast().val);
            ((LinkedList<Binary_Tree_Rebuild.TreeNode>) treeNodes).removeLast();
        }
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        Binary_Tree_Rebuild.TreeNode tree = new BuildBST().build(arr);
        //new BinaryTreeLevelTravel().levelTravel(tree);
        new BinaryTreeLevelTravel().levelTravelReverse(tree);
    }
}
