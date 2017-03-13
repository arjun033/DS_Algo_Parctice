import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class TwoElementsSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> mainList = new ArrayList<> ();
		ArrayList<Integer> l1 = new ArrayList<> ();
		l1.add(6);
		l1.add(2);
		l1.add(1);
		l1.add(5);
		ArrayList<Integer> l2 = new ArrayList<> ();
		l2.add(1);
		l2.add(2);
		l2.add(3);
		ArrayList<Integer> l3 = new ArrayList<> ();
		l3.add(5);
		l3.add(5);
		l3.add(5);
		ArrayList<Integer> l4 = new ArrayList<> ();
		l4.add(4);
		l4.add(7);
		mainList.add(l1);
		mainList.add(l2);
		mainList.add(l3);
		mainList.add(l4);
		
		ArrayList<Integer> result1 = getTwoElements(mainList);
		if(result1.size()>0){
			for(int i : result1){
				System.out.println(i);
			}
		} else {
			System.out.println("No such element");
		}
		System.out.println("------");
		ArrayList<Integer> result2 = find_in_two(mainList);
		if(result2.size()>0){
			for(int i : result2){
				System.out.println(i);
			}
		} else {
			System.out.println("No such element");
		}
	}

	private static ArrayList<Integer> getTwoElements(ArrayList<ArrayList<Integer>> mainList) {
		// TODO Auto-generated method stub
		HashMap<Integer, Integer> countMap = new HashMap<> ();
		ArrayList<Integer> result = new ArrayList<> ();
		ArrayList<HashSet<Integer>> setList = new ArrayList<> ();
		
		for(ArrayList<Integer> list : mainList){
			setList.add(new HashSet<Integer>(list));
		}
		for(HashSet<Integer> set : setList){
			for(Integer i : set){
				if(countMap.containsKey(i)){
					countMap.put(i, countMap.get(i)+1);
				} else {
					countMap.put(i, 1);
				}
			}
		}
		for(int i : countMap.keySet()){
			if(countMap.get(i)==2){
				result.add(i);
			}
		}
		return result;
	}
	
	private static ArrayList<Integer> find_in_two(ArrayList<ArrayList<Integer>> mainList) {
		ArrayList<Integer> result = new ArrayList<> ();
		HashMap<Integer, HashSet<Integer>> countMap = new HashMap<> ();
		int listIndex = 1;
		
		for(ArrayList<Integer> innerList : mainList){
			for(Integer i : innerList){
				if(countMap.containsKey(i)){
					countMap.get(i).add(listIndex);
				} else {
					HashSet<Integer> indexSet = new HashSet<> ();
					indexSet.add(listIndex);
					countMap.put(i, indexSet);
				}
			}
			listIndex++;
		}
		
		for(int i : countMap.keySet()){
			if(countMap.get(i).size()==2)
				result.add(i);
		}
		return result;
	}

}
//[[6,2,0,5],[1,2,3],[5,5,5],[4,7]] -> [2,5]