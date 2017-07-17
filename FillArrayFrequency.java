/*
 * Fill an array based on frequency where elements are in range from 0 to n-1
 * Given an array of positive integers with duplicate allowed. The array contains 
 * elements from range 0 to n-1. The task is to fill the array such that arr[i] 
 * contains frequency of i.
 */
public class FillArrayFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 4, 3, 4, 1, 1, 4, 4, 4, 7};
		freqArr(arr);
	}
	
	public static void freqArr(int[] arr){
		int len = arr.length;
		int[] arr2 = new int[len];
		for(int i=0; i<len; i++){
			arr2[arr[i]]++;
		}
		for(int i : arr2){
			System.out.print(i+" ");
		}
	}
}
