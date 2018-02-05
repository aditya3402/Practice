package Utils.Stack;
import Utils.List.*;

public class Stack<T> 
{
	private List<T> list;
	
	public Stack()
	{
		list = new List<T>();
	}
	
	public void Push(T data)
	{
		list.AddFront(data);
	}
	
	public void pop()
	{
		list.RemoveFront();
	}
	
	public T Top()
	{
		if(!list.IsEmpty())
		{
			return list.GetFront();
		}
		else
		{
			System.out.println("Stack is Empty");			
		}
		
		return null;
	}
}
