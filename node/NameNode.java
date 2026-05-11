
public class NameNode
{

	private String name;
	private NameNode nextNode;
	
	public NameNode(String s, NameNode n)
	{
		name = s;
		nextNode = n;
	}
	
	public void setNextNode(NameNode n)
	{
		nextNode = n;
	}
	
	public String getName()
	{
		return name;
	}
	
	public NameNode getNextNode()
	{
		return nextNode;
	}
	
}