
public class Factorial {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.nanoTime();
		System.out.println("Fact1: "+getFatcorial1(15));
		long elapsedTime = System.nanoTime() - startTime;
		System.out.println(elapsedTime);
		
		startTime = System.nanoTime();
		System.out.println("Fact2: "+getFatcorial2(15));
		elapsedTime = System.nanoTime() - startTime;
		System.out.println(elapsedTime);
		
		startTime = System.nanoTime();
		getFactorial3(15);
		elapsedTime = System.nanoTime() - startTime;
		System.out.println(elapsedTime);
	}
	
	public static long getFatcorial1(int n){
		if(n<=1)
			return 1;
		else
			return n*getFatcorial1(n-1);
	}
	public static long getFatcorial2(int n){
		if(n<=1) return 1;
		long[] factArr = new long[n];
		factArr[0] = 1;
		factArr[1] = 1;
		for(int i=2; i<n; i++){
			factArr[i] = i*factArr[i-1];
		}
		return factArr[n-1]*n;
	}
	public static void getFactorial3(int n){
		long arr[] = new long[n+1];
		arr[0] = 1;
		arr[1] = 1;
		for(int i=2; i<=n; i++){
			arr[i] = arr[i-1]*i;
			System.out.print(arr[i]+" ");
		}
	}
}
