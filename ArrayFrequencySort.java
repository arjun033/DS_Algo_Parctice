import java.util.ArrayList;

public class ArrayFrequencySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 18, 3, 18, 5, 2, 7, 1, 2, 5}; //Ans [2, 5, 18, 1, 3, 7]
		int[] res = getFreqArr(arr);
		for(int n : res){
			System.out.println(n);
		}
		
	}

	public static int[] getFreqArr(int[] arr) {
		// TODO Auto-generated method stub
		ArrayList<Integer> res = new ArrayList<> ();
		
		
		int[] resArr = new int[res.size()];
		for(int i=0; i<resArr.length; i++){
			resArr[i] = res.get(i);
		}
		return resArr;
	}

}
