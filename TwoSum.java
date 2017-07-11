import java.util.Arrays;
import java.util.HashMap;

/*
 * Index of two elements in the array that add up to give target value
 * HashMap approach will give index and all possible pairs but in place 
 * approach will give only one pair of elements and not index
 */
public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,7,0,5,-1};
		int target = 6;
		twoSumHashMap(arr, target);
		twoSumInPlace(arr, target);
	}
	
	public static void twoSumHashMap(int[] arr, int target){
		boolean found = false;
		HashMap<Integer, Integer> map = new HashMap<> ();
		for(int i=0; i<arr.length; i++){
			if(map.containsKey(target-arr[i])){
				System.out.println("HashMap: "+map.get(target-arr[i])+" "+i);
				found = true;
			} else {
				map.put(arr[i], i);
			}
		}
		if(!found){
			System.out.println("HashMap: No such pair exists");
		}
	}
	
	public static void twoSumInPlace(int[] arr, int target){
		Arrays.sort(arr);
		int ptr1=0, ptr2=arr.length-1;
		while(ptr1<ptr2){
			if(arr[ptr1]+arr[ptr2]==target){
				System.out.println("InPlace: "+arr[ptr1]+" "+arr[ptr2]);
				return;
			} else if(arr[ptr1]+arr[ptr2]>target){
				ptr2--;
			} else {
				ptr1++;
			}
		}
		System.out.println("InPlace: No such pair exists");
	}
}
