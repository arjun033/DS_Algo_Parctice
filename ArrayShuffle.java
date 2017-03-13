import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class ArrayShuffle {

	public static void main(String[] args) {
		int[] numArr = {7, 22, 6, 12, 91, 134, 0, 18, 37, 191, 78};
		System.out.println(Arrays.toString(numArr));
		System.out.println(Arrays.toString(arrShuffle(numArr)));
	}
	
	public static int[] arrShuffle(int[] numArr){
		int length = numArr.length;
		for(int i=0; i<1000; i++){
			int idx1 = ThreadLocalRandom.current().nextInt(0, numArr.length);
			int idx2 = ThreadLocalRandom.current().nextInt(0, numArr.length);
			numArr = swap(numArr, idx1, idx2);
		}
		return numArr;
	}
	
	public static int[] swap(int[] numArr, int idx1, int idx2){
		int temp = numArr[idx1];
		numArr[idx1] = numArr[idx2];
		numArr[idx2] = temp;
		return numArr;
	}

}
