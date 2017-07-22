
public class LongestCommonSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longestCommonSubstring("www.lintcode.com code","www.ninechapter.com code"));
	}

	public static int longestCommonSubstring(String A, String B) {
		// write your code here
		if(A==null||B==null||A.length()==0||B.length()==0) return 0;
		if(A.equals(B)) return A.length();
		String small=A, big=B;
		if(A.length()>B.length()) {
			big=A;
			small=B;
		}
		StringBuilder sbf = new StringBuilder();
		StringBuilder sbb = new StringBuilder();
		int max=0;
		for(int i=0, j=small.length()-1; i<small.length()&&j>=0; i++, j--){
			sbf.append(Character.toString(small.charAt(i)));
			if(big.indexOf(sbf.toString())!=-1&&sbf.length()>max) 
				max=sbf.length();
			System.out.println("sbf:"+sbf.toString()+", max:"+max);
			sbb.insert(0, Character.toString(small.charAt(j)));
			if(big.indexOf(sbb.toString())!=-1&&sbb.length()>max) 
				max=sbb.length();
			System.out.println("sbb:"+sbb.toString()+", max:"+max);
			System.out.println("------------------------");
		}
		return max;
	}

}
