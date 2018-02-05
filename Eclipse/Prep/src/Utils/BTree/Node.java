package Utils.BTree;

public class Node 
{
	public double data;
	public Node left;
	public Node right;
	
	public Node(double data)
	{
		this.data = data;
		this.left = null;
		this.right = null;
	}
}
