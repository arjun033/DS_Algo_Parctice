import java.util.Arrays;
import java.util.Scanner;

/*
 * Given an integer, return the next largest integer that is made up of the same digits as the given one.
 * http://www.geeksforgeeks.org/find-next-greater-number-set-digits/
 */
public class NextLargestInt {

	public static void main(String[] args) {
		int num = 0;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		sc.close();
		System.out.println(getNextNum(num));
	}
	
	public static int getNextNum(int num) {
		boolean numExists = false;
		String numStr = Integer.toString(num);
		//If number has only 1 digit
		if(numStr.length()==1){
			return Integer.parseInt(numStr+numStr);
		}
		
		char[] numArr = numStr.toCharArray();
		int pos = 0;
		for(int i=numArr.length-1; i>0; i--){
			if(numArr[i]>numArr[i-1]){
				pos = i-1;
				numExists = true;
				break;
			}
		}
		
		if(!numExists){
			System.out.println("Such a number does not exist");
			return 0;
		}
		
		int minDigit = numArr[pos+1];
		int swapPos = numArr.length-1;
		for(int i=pos+1; i<numArr.length; i++){
			if(numArr[i]<minDigit){
				minDigit = numArr[i];
				swapPos = i;
			}
		}
		
		char temp = numArr[pos];
		numArr[pos] = numArr[swapPos];
		numArr[swapPos] = temp;
		
		Arrays.sort(numArr, pos+1, numArr.length);
		
		return Integer.parseInt(new String(numArr));
	}

}
