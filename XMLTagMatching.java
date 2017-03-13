import java.util.ArrayList;
import java.util.Stack;

public class XMLTagMatching {
	
	static class XMLTag {
		String tagName;
		boolean isOpeningTag;
		
		public XMLTag(String tagName, boolean isOpeningTag){
			this.tagName = tagName;
			this.isOpeningTag = isOpeningTag;
		}
		public String getTagName(){
			return tagName;
		}
		public boolean getIsOpeningTag(){
			return isOpeningTag;
		}
	}
	
	public static boolean isValidXML(ArrayList<XMLTag> xmlList){
		Stack<XMLTag> xmlStack = new Stack<> ();
		for(XMLTag xml : xmlList) {
			if(xml.getIsOpeningTag()){
				xmlStack.push(xml);
			} else {
				if(!xmlStack.isEmpty() && xml.getTagName().equals(xmlStack.peek().getTagName()) && xmlStack.peek().getIsOpeningTag()){
					xmlStack.pop();
				} else {
					return false;
				}
			}
		}
		return xmlStack.isEmpty();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<XMLTag> xmlList = new ArrayList<> ();
		xmlList.add(new XMLTag("tag1", true));
		xmlList.add(new XMLTag("tag2", true));
		xmlList.add(new XMLTag("tag2", false));
		xmlList.add(new XMLTag("tag1", true));
		xmlList.add(new XMLTag("tag3", true));
		xmlList.add(new XMLTag("tag3", false));
		xmlList.add(new XMLTag("tag1", false));
		xmlList.add(new XMLTag("tag1", false));
		
		if(isValidXML(xmlList)){
			System.out.println("XML balanced");
		} else {
			System.out.println("XML not balanced");
		}
	}
	
}
