import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CombinationOfCharsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getCombination("aabc"));
	}
	
	public static Set<String> getCombination(String s) {
		Set<String> res = new HashSet<> ();
		StringBuilder sb = new StringBuilder();
		int len = s.length();
		for(int i=0; i<Math.pow(2, len); i++) {
			for(int j=0; j<len; j++) {
				if((i & (1 << j))!=0){
					sb.append(s.charAt(j));
				}
			}
			res.add(sb.toString());
			sb.setLength(0);
		}
		return res;
	}

}
