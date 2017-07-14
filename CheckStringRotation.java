/*
 * Find if a string is rotation of another string eg. abcd , dabc is rotation of abcd
 */
public class CheckStringRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abcaadc", s2 = "adcabca";
		//String s1 = "abcde", s2 = "eabcd";
		boolean flg = checkStrRotation(s1, s2);
		if(flg) System.out.println("Yes");
		else System.out.println("No");
	}
	
	public static boolean checkStrRotation(String s1, String s2){
		return (s1.length() == s2.length()) && ((s1+s1).indexOf(s2) != -1);
	}

}
