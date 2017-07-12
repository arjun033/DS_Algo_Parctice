import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 1, 0, 18, 12, 4, 1};
		boolean flg = binarySearch(arr, 17);
		if(flg) System.out.println("Yes");
		else System.out.println("No");
	}
	
	public static boolean binarySearch(int[] arr, int n){
		Arrays.sort(arr);
		if(arr.length==0||n<arr[0]||n>arr[arr.length-1]) {
			return false;
		}
		int low=0, high=arr.length-1, mid=0;
		while(low<=high){
			mid=(low+high)/2;
			//System.out.println("low:"+low+" mid:"+mid+" high:"+high);
			if(n==arr[mid]) return true;
			if(n>arr[mid]){
				low=mid+1;
			} else {
				high=mid-1;
			}
		}
		return false;
	}

}
