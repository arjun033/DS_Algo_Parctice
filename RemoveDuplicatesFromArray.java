import java.util.Arrays;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		int[] numArr = {0, 7, 7, 191, 0, 221, 7};
		Arrays.sort(numArr);
		int ptr1 = 0;
		int ptr2 = 1;
		while(ptr2<numArr.length){
			if(numArr[ptr1]==numArr[ptr2]){
				ptr2++;
				continue;
			}
			System.out.print(numArr[ptr1] + " ");
			ptr1 = ptr2;
		}
		System.out.print(numArr[ptr1] + " ");
	}
	
	
}
