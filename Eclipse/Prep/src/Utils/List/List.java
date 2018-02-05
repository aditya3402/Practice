package Utils.List;

public class List<T> 
{
	private Node<T> start;
	private Node<T> end;
	
	public List()
	{
		this.start = null;
		this.end = null;
	}
	
	public void Add(T data)
	{
		Node<T> node = new Node<T>(data);
		if(start == null)
		{
			start = node;
			end = node;
		}
		else
		{
			end.next = node;
			end = node;
		}
	}
	
	public void PrintForward()
	{
		PrintForward(start);
		System.out.println();
	}
	
	public void PrintReverse()
	{
		PrintReverse(start);
		System.out.println();
	}
	
	public void ReverseList()
	{
		end = ReverseList(start);
	}
	
	private void PrintForward(Node<T> head)
	{
		if(head != null)
		{
			System.out.print("\t" + head.data);
			PrintForward(head.next);
		}
	}
	
	private void PrintReverse(Node<T> head)
	{
		if(head == null)
		{	
			return;			
		}
		else if(head != end)
		{
			PrintReverse(head.next);
		}
		
		System.out.print("\t" + head.data);
	}
	
	private Node<T> ReverseList(Node<T> head)
	{
		if(head == null)
		{
			return null;
		}
		else if (head != end)
		{
			Node<T> prev = ReverseList(head.next);
			head.next = prev.next;
			prev.next = head;
		}
		else
		{
			start = head;
		}
		return head;
	}
}
