import java.util.BitSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicateFromString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		usingHashSet(str);
		usingArray(str);
	}
	
	public static void usingHashSet(String str){
		LinkedHashSet<Character> charSet= new LinkedHashSet<> ();
		for(int i=0; i<str.length(); i++){
			char c = str.charAt(i);
			charSet.add(c);
		}
		String out = "";
		for(char c : charSet){
			out += c;
		}
		System.out.println(out);
	}
	
	public static void usingArray(String str){
		BitSet charCount = new BitSet(256);
		String out = "";
		for(int i=0; i<str.length(); i++){
			char c = str.charAt(i);
			if(charCount.get((int)c)){
				continue;
			}else{
				charCount.set((int)c);
				out += c;
			}
		}
		
		System.out.println(out);
	}

}
