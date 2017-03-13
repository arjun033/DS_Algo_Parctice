
public class Fibonacci {
	
	private static int fibRec(int n){
		if (n == 1) return 0;
        if (n == 2)return 1;
        return fibRec(n - 1) + fibRec(n - 2);
    }
	
	private static int fibIter(int n){
		int a = 0;
        int b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a;
            a = a + b;
            b = temp;
        }
        return a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibRec(10));
		System.out.println(fibIter(10));
	}
}
