 class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
       TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
 }


public class rootandsumofchild {
    public static boolean checktree(TreeNode node) {
        if(node.val == node.left.val + node.right.val){
            return true;
        }
        else return false;
        
    }
}

    
