
public class InsertInBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(12);
		TreeNode n2 = new TreeNode(8);
		TreeNode n3 = new TreeNode(3);
		TreeNode n4 = new TreeNode(4);
		TreeNode n5 = new TreeNode(11);
		TreeNode n6 = new TreeNode(18);
		TreeNode n7 = new TreeNode(13);
		TreeNode n8 = new TreeNode(20);
		TreeNode n9 = new TreeNode(16);
		
		root.left = n2; //8
		root.right = n6; //18
		n2.left = n4; //4
		n2.right = n5; //11
		n4.left = n3; //3
		n6.left = n7; //13
		n6.right = n8; //20
		n7.right = n9; //16
		
		BTreePrinter.printTreeNode(root);
		TreeNode root1 = insertNode(root, 19);
		BTreePrinter.printTreeNode(root1);
	}
	
	public static TreeNode insertNode(TreeNode root, int key){
		if(root==null) return new TreeNode(key);
		if(key<=root.val && root.left==null){
			System.out.println("root.left is null");
	        root.left = new TreeNode(key);
	        return root;
	    }
		if(key>root.val && root.right==null){
			System.out.println("root.right is null");
	        root.right = new TreeNode(key);
	        return root;
	    }
	    if(key<=root.val) insertNode(root.left, key);
	    if(key>root.val) insertNode(root.right, key);
	    return root;
	}

}
