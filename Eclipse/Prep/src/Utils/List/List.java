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
	
	public void AddRear(T data)
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
	
	public void AddFront(T data)
	{
		Node<T> node = new Node<T>(data);
		if(start == null)
		{
			start = node;
			end = node;
		}
		else
		{
			node.next = start;
			start = node;
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
	
	public void RemoveFront()
	{
		if(start == end)
		{
			start = null;
			end = null;
		}
		else
		{
			start = start.next;			
		}
			
	}

	public T GetFront()
	{
		return start.data;
	}
	
	public boolean IsEmpty()
	{
		return start == null ? true:false;
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
			prev.next = head;
		}
                else 
		{
			start.next = null;
			end = start;
			start = head;
		}
		return head;
	}
	
	public Node<T> swapNodes(T a, T b) 
	{
		Node<T> prev1 = null, prev2 = null, first = null, second = null;
		//see if start is any of a and b
		if(start.data == a){
			prev1 = null;
			first = start;
		} else if(start.data == b) {
			prev2 = null;
			second = start;
		}
        //find nodes
		Node<T> head = start;
		while(head.next != null) {
			if(head.next.data == a){
				prev1 = head;
				first = head.next;
			} else if(head.next.data == b) {
				prev2 = head;
				second = head.next;
			}
			head = head.next;
		}
		//if a or b not found
		if(first == null || second == null){
			System.out.println("Nodes not found");
			return null;
	    }
		//swap
		if(prev1 != null && prev2 != null){
			prev1.next = second;
			prev2.next = first;
	    }
		if(prev1 == null){
	    	start = second;
	    	prev2.next = first;
		}
		if(prev2 == null){
			start = first;
			prev1.next = second;
		}
		Node<T> temp = first.next;
		first.next = second.next;
		second.next = temp;
		return start;
	}
}
