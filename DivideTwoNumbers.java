
public class DivideTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(divideWO(19.25, -3.5));
	}

	private static double divideWO(double dividend, double divisor) {
		double sign = (dividend * divisor < 0) ? -1.0 : 1.0;
		double quotient;

		if (dividend == 0){
			quotient = 0;
		} else {
			quotient = sign * Math.exp(Math.log(Math.abs(dividend)) - Math.log(Math.abs(divisor)));
		}

		return quotient;
	}

}
