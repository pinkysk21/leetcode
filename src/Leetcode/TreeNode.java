package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TreeNode {

	public static void main(String[] args) {
		var n = new Node(2, new Node(3,null,null), new Node(4,null,null));
		var s = new Solution6();
	//	System.out.println(s.inorderTraversal(n));
		var s2=new Solution7();
		System.out.println(s2.levelOrder(n));
	}

}

class Node {
	int val;
	Node left;
	Node right;

	Node() {
	}

	Node(int val) {
		this.val = val;
	}

	Node(int val, Node left, Node right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}

class Solution6 {
	List<Integer> list = new ArrayList<>();

	public List<Integer> inorderTraversal(Node root) {

		if (root != null) {
			inorderTraversal(root.left);
			list.add(root.val);
			inorderTraversal(root.right);

		}
		return list;
	}
}


class Solution7{
	
	List<List<Integer>> res1=new ArrayList<>();
	 public List<List<Integer>> levelOrder(Node root) {
	        List<List<Integer>> list=new ArrayList<>();
	        findElements(list,root);
	      //  List<Integer> sq=List.of(root.val);
	        return list;
	        
	    }
	    public void findElements(List<List<Integer>> res,Node root1){
	        List<Node> l=new ArrayList<>();
	        if(root1!=null)
	        {
	        	l.add(root1);
	          List<Integer> sq=List.of(root1.val);
	          res.add(sq);
	        }
	      
	        for(int i=0;i<l.size();i++){
	            List<Integer> lnew=new ArrayList<>();
	            root1=l.get(i);
	        if(root1.left!=null){
	            l.add(root1.left);
	            lnew.add(root1.left.val);
	        }
	        if(root1.right!=null){
	            l.add(root1.right);
	            lnew.add(root1.right.val);
	        }
	            
	     if(!lnew.isEmpty())
	         res.add(lnew);
	            
	        
	        }
	        
	    }
	    
	    public void displayElements(List<List<Integer>> res,Node root1) {
	    //	List<List<Integer>> res1=new ArrayList<>();
	    	display(root1,0);
	    	
	    	
	    }
	    
	    public void display(Node root2,int level) {
	    	
	    	if(root2.left!=null)
	    	display(root2.left,level+1);
	    	
	    	
	    	
	    	
	    }
	    
}
