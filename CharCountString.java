/*
 * You are given a string variable that holds "aabbcc". 
 * Given the string, how do we output a2b2c2
 */
public class CharCountString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abbcdddeef";
		System.out.println(getCharCountStr(s));
	}
	
	public static String getCharCountStr(String s){
		if(s.length()==1) return s+"1";
		StringBuilder sb = new StringBuilder();
		int c = 1, i=0;
		for(i=0; i<s.length()-1; i++){
			if(s.charAt(i)==s.charAt(i+1)){
				c++;
			}else{
				sb.append(s.charAt(i)+Integer.toString(c));
				c=1;
			}
		}
		
		sb.append(s.charAt(i)+Integer.toString(c));
		return sb.toString();
	}

}
