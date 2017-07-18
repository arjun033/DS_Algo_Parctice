
public class GCDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {2, 4, 6, 8};
		System.out.println(getGCD(arr1)); 
		int arr2[] = {1, 2, 3};
		System.out.println(getGCD(arr2)); 
	}
	
	public static int getGCD(int[] arr){
		int gcdVal = arr[0];
		for(int i=1; i<arr.length; i++){
			gcdVal = gcd(arr[i], gcdVal);
		}
		return gcdVal;
	}
	
	public static int gcd(int a, int b){
	    if (a == 0)
	        return b;
	    return gcd(b%a, a);
	}
}
