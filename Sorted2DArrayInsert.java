import java.util.Arrays;
import java.util.Scanner;

/*
 * Given a 2d array where every row is sorted left to right min to max and every column 
 * is sorted top to bottom min to max, how would you insert an element and move it to a 
 * valid position assuming that insertion deletes the largest element in the array
 */

public class Sorted2DArrayInsert {

	public static void main(String[] args) {
		int[][] numArr = {{1,3,7,12},{7,8,8,18},{19,31,32,91}};
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		numArr = insertElement(numArr, n);
		System.out.println(Arrays.deepToString(numArr));
	}

	public static int[][] insertElement(int[][] numArr, int n) {
		int[] rowSums = new int[numArr.length];
		for(int i=0; i<numArr.length; i++){
			for(int j=0; j<numArr[i].length; j++){
				rowSums[i] += numArr[i][j];
			}
		}
		int insertRow = numArr.length-1;
		for(int i=0; i<rowSums.length-1; i++){
			if(rowSums[i]+n<=rowSums[i+1]){
				insertRow = i;
				break;
			}
		}
		int index = Arrays.binarySearch(numArr[insertRow], n);
		if(index<0){
			index = -index-1;
		}
		if(index>= numArr[insertRow].length){
			index--;
		}
		int length = numArr[insertRow].length;
		int destination[] = new int[length];
		System.arraycopy(numArr[insertRow], 0, destination, 0, index);
		destination[index] = n;
		System.arraycopy(numArr[insertRow], index, destination, index + 1, length-index-1);
		numArr[insertRow] = destination;

		return numArr;
	}

}
