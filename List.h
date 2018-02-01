template <class T>class List
{
	public void Print(Node * start);
	public void PrintReverse(List * start);
	public void Add();
}

template <class T>class Node
{

public:
	Node()
	{
		next = null;
	}
private:
	T data;
	List * next;

	
}
