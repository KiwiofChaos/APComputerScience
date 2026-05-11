
public class ListDriver
{

	public static void main(String[] args)
	{
		
		ListOfNodes theList = new ListOfNodes(null);
		
		NameNode n1 = new NameNode("Bill", null);
		
		theList.appendNode(n1);	
		
		NameNode n2 = new NameNode("Fred", null);
		
		theList.appendNode(n2);
	
	
	
	}
	
	
}