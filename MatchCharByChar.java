import java.util.HashMap;
import java.util.HashSet;

public class MatchCharByChar {
	
	static HashSet<String> wordsOfInt = new HashSet<> ();
	static final char eof = '\0';
	
	public static HashMap<String, Integer> getWordFreq(String str){
		HashMap<String, Integer> wordFreq = new HashMap<> ();
		for(String word : wordsOfInt){
			int lastIndex = 0;
			int count = 0;
			while(lastIndex != -1) {
			    lastIndex = str.indexOf(word, lastIndex);
			    if (lastIndex != -1) {
			        count++;
			        lastIndex += word.length();
			    }
			}
			wordFreq.put(word, count);
		}
		return wordFreq;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputStr = "";
		char inputChar;
		HashMap<String, Integer> wordFreq = new HashMap<> ();
		
		wordsOfInt.add("food");
		wordsOfInt.add("foo");
		wordsOfInt.add("bar");
		wordsOfInt.add("door");
		wordsOfInt.add("big");
		wordsOfInt.add("small");
		wordsOfInt.add("rsma");
		/*
		while(true){
			inputChar = nextChar();
			if(inputChar==eof) break;
			inputStr += Character.toString(inputChar);
		}
		*/
		inputStr = "arjunfoodoorsmalldoor";
		
		wordFreq = getWordFreq(inputStr);
		for(String s : wordFreq.keySet()){
			System.out.println(s+"=>"+wordFreq.get(s));
		}
	}

	private static char nextChar() {
		// TODO Auto-generated method stub
		return 0;
	}

}
