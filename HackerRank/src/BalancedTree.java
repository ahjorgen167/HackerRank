import java.util.*;


class TreeNode {
      public int val;
      public TreeNode left ;
      public TreeNode right;
      
      public TreeNode(int val){
    	  this.val = val;
      }
};
 
public class BalancedTree{

	public static void main(String[] args){
	
	}
	
    public static boolean isBalanced(TreeNode root) {
    	if(heightFinder(root) == -1){
    		return false;
    	} else {
    		return true;
    	}
        
    }
    
    private static int heightFinder(TreeNode node){
    	if(node == null){
    		return 0;
    	}
    	
    	int leftSide = heightFinder(node.left);
    	int rightSide = heightFinder(node.right);
    	
    	if(leftSide == -1 || rightSide == -1){
    		return -1;
    	}
    	
    	if(Math.abs(leftSide - rightSide) > 2){
    		return -1;
    	}
    	
    	return Math.max(leftSide, rightSide) + 1;    	
    }
}