#include <iostream>
template <class T>
class Node
{

public:
	Node(T data);
	T data;
	Node<T> * next;
};

template <class T>
class List
{
public:
	List();
	void PrintForward();
	void PrintReverse();
	void Add(T data);
private:
	void PrintForward(Node<T> *head);
	void PrintReverse(Node<T> *head);

	Node<T> * start;
	Node<T> * end;
};
