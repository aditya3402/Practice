package Utils.List;

public class Node<T> 
{
	public T data;
	public Node<T> next;
	
	// Constructor
	public Node(T data)
	{
		this.data = data;
		this.next = null;
	}
}
