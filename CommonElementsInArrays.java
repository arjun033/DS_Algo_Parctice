import java.util.Arrays;
import java.util.HashSet;

public class CommonElementsInArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1 = {2,4,3};
		int [] arr2 = {4,3,5,6};
		HashSet<Integer> set = new HashSet<> ();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		for(int i : arr1){
			set.add(i);
		}
		for(int i : arr2) {
			if(set.contains(i)){
				System.out.print(i+" ");
				break;
			}
		}
	}
}
