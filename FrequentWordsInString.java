import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;

public class FrequentWordsInString {
	
	private static ArrayList<String> freqWords(String s){
		ArrayList<String> wordList = new ArrayList<> ();
		ArrayList<String> freqWordList = new ArrayList<> ();
		HashMap<String, Integer> countMap = new HashMap<> ();
		
		StringTokenizer st = new StringTokenizer(s);
		while(st.hasMoreTokens()){
			wordList.add(st.nextToken());
		}
		
		for(String str : wordList){
			if(countMap.containsKey(str)){
				countMap.put(str, countMap.get(str)+1);
			} else {
				countMap.put(str, 1);
			}
		}
		
		countMap = sortMap(countMap);
		
		int i=0;
		for(String words : countMap.keySet()){
			if(i==3) return freqWordList;
			freqWordList.add(words);
			i++;
		}
		return null;
	}
	
	public static HashMap<String, Integer> sortMap(Map<String, Integer> unsortMap){
        List<Entry<String, Integer>> list = new LinkedList<Entry<String, Integer>>(unsortMap.entrySet());
        Collections.sort(list, new Comparator<Entry<String, Integer>>(){
            public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2)
            {
            	if(o1.getValue() == o2.getValue()){
            		return o1.getKey().compareTo(o2.getKey());
            	}
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        HashMap<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
        for (Entry<String, Integer> entry : list){
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "i am an orange man who loves orange chicken which is an extraordinary chicken recipe i love this orange recipe";
		for(String str : freqWords(s)){
			System.out.println(str);
		}
	}

}
