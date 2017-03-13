import java.util.ArrayList;
import java.util.Collections;

public class ConstructSentenceFromWords {

	private static String constructSentence(String[] words){
		String sentence = "";
		ArrayList<String> list = new ArrayList<> ();
		for(String s : words){
			list.add(s);
		}
		Collections.shuffle(list);
		
		for(int i=0; i<list.size(); i++){
			String currWord = list.get(i);
			if(i==0){
				if(currWord.length()>1)
					currWord = Character.toString(currWord.charAt(0)).toUpperCase() + currWord.substring(1);
				else
					currWord = currWord.toUpperCase();
			} else if (i==list.size()-1) {
				currWord = currWord+".";
			}
			sentence += currWord+" ";
		}
		return sentence;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"the", "a", "boy", "Arjun", "brilliant", "is", "God", "very", "wow"};
		System.out.println(constructSentence(words));
	}

}
