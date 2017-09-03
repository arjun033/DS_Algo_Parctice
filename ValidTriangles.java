import java.util.Arrays;

public class ValidTriangles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr = {25, 8, 17, 1, 9, 14, 3, 5, 21, 16, 4, 13, 38};
		int[] arr = {10, 21, 22, 100, 101, 200, 300};
		//int[] arr = {5, 7, 1, 13};
		System.out.println(findNumberOfTrianglesGFG(arr));
		System.out.println(findNumberOfTrianglesBrute(arr));
	}
	
	//n^2
	static int findNumberOfTrianglesGFG(int arr[]){
        int n = arr.length;
        Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i < n-2; i++){
        	int k = i + 2;
        	for (int j = i+1; j < n; j++){
        		while (k < n && arr[i] + arr[j] > arr[k]){
        			k++;
        		}
        		count += k - j - 1;
        	}
        }
        return count;
	}
	
	//n^3
	static int findNumberOfTrianglesBrute(int arr[]){
		int len = arr.length;
		int count = 0;
		for(int i=0; i<len-2; i++){
			for(int j=i+1; j<len-1; j++){
				for(int k=j+1; k<len; k++){
					if(arr[i]+arr[j]>arr[k]){
						System.out.println(arr[i]+","+arr[j]+","+arr[k]);
						count++;
					}
				}
			}
		}
		return count;
	}
}
