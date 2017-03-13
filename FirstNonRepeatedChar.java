import java.util.LinkedHashMap;

public class FirstNonRepeatedChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcabcdedf";
		Character c = firstNonRepeatedChar(s);
		if(c != null){
			System.out.println(c);
		} else {
			System.out.println("No such character");
		}
	}
	
	private static Character firstNonRepeatedChar(String s){
		LinkedHashMap<Character, Integer> charCount = new LinkedHashMap<> ();
		for(int i=0; i<s.length(); i++){
			if(charCount.containsKey(s.charAt(i))){
				charCount.put(s.charAt(i), charCount.get(s.charAt(i))+1);
			} else {
				charCount.put(s.charAt(i), 1);
			}
		}
		
		for(Character c : charCount.keySet()){
			if(charCount.get(c)==1){
				return c;
			}
		}
		return null;
	}
}
