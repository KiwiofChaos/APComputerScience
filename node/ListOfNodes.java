





public class ListOfNodes
{

	private NameNode listPointer;
	
	public ListOfNodes(NameNode n)
	{
	
		listPointer = n;
	
	}
	
	public NameNode getNode(int index) {
        if (listPointer.getNextNode() == null) { return null; }
		NameNode some_node = listPointer.getNextNode();

		while (i > 1) {
			if (some_node.getNextNode() == null) {
				return null;
			}
			some_node = some_node.getNextNode();
			i -= 1;
		}
		return some_node;
	}

	public void insertNode(NameNode n, int i)
	{
        NameNode some_node = this.getNode(i);
		if (some_node == null) {return;}
		n.setNextNode(some_node.getNextNode());
		some_node.setNextNode(n);
	}
	
	public void deleteNode(String s)
	{
	
		// to be implemented
	
	}
	
	public void appendNode(NameNode n)
	{
		NameNode temp = listPointer;
	
	
		if(listPointer.equals(null))
			listPointer = n;
		else
			while(temp.getNextNode() != null )
				temp = temp.getNextNode();
				
		temp.setNextNode(n);
	
	}
	
	public void printList()
	{
		NameNode temp = listPointer;
		
		if(listPoint.equals(null))
			System.out.println("There is nothing in the list.");
		else
			do
			{
				System.out.println(temp.getName());
				temp = temp.getNextNode();
			} while(temp != null);
	}
	









}