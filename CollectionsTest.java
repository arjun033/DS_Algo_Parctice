import java.util.ArrayList;
import java.util.Collection;
import java.util.SortedSet;
import java.util.TreeSet;

public class CollectionsTest {
	public static void main(String[] args){
		//Sorted set test
		SortedSet s = new TreeSet();
		s.add(3);
		s.add(1);
		s.add(9);
		s.add(3);
		System.out.println(s.first());
		System.out.println(s.last());
		System.out.println(s.size());
		
		//addAll test
		ArrayList<Integer> a = new ArrayList<> ();
		a.add(9);
		a.add(4);
		a.add(9);
		a.sort(null);
		System.out.println(a.toString());
	}
}
