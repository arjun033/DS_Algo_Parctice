//Construct a balanced BST from sorted array
public class ConstructBSTFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		int low = 0, high = arr.length-1;
		BTreePrinter.printTreeNode(constructBST(arr, low, high));
	}
	
	public static TreeNode constructBST(int[] arr, int low, int high){
		if(low>high) return null;
		int mid = (high+low)/2;
		TreeNode node = new TreeNode(arr[mid]);
		node.left = constructBST(arr, low, mid-1);
		node.right = constructBST(arr, mid+1, high);
		return node;
	}

}
