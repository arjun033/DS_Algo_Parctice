import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class BlanacedParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String inputStr = sc.nextLine();
		if(isBalanced(inputStr)){
			System.out.println("Parenthesis balanced");
		} else {
			System.out.println("parenthesis not balanced");
		}
		sc.close();
	}
	
	public static boolean isBalanced (String s) {
		s = s.replaceAll("[^(){}\\[\\]]", "");
		//System.out.println(s);
		Stack<Character> parenthesisStack = new Stack<> ();
		HashMap<Character, Character> parenthesisMap = new HashMap<> ();
		
		parenthesisMap.put('(', ')');
		parenthesisMap.put('{', '}');
		parenthesisMap.put('[', ']');
		
		for(int i=0; i<s.length(); i++){
			char curr = s.charAt(i);
			if(parenthesisMap.containsKey(curr)){
				parenthesisStack.push(curr);
			} else {
				if(parenthesisMap.containsValue(curr)){
					if(!parenthesisMap.isEmpty() && parenthesisMap.get(parenthesisStack.peek())==curr){
						parenthesisStack.pop();
					} else {
						return false;
					}
				}
			}
		}
		
		
		return parenthesisStack.isEmpty();
	}
}

// [{[arjun is great'']{(he is{})}so good}] --true
// [{[arjun is {great'']{(he is{})}so good}] --false