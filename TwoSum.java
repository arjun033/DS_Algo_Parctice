import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,7,3,5,-1};
		int target = 7;
		
		HashMap<Integer, Integer> map = new HashMap<> ();
		
		for(int i=0; i<arr.length; i++){
			if(map.containsKey(target-arr[i])){
				int[] res = {map.get(target-arr[i]), i};
				System.out.println(res[0]+" "+res[1]);
			} else {
				map.put(arr[i], i);
			}
		}
	}
}
