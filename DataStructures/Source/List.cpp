#include "../Header/List.h"

template<class T>
Node<T>::Node(T data)
{
	this->data = data;
	this->next = null;
}

template <class T>
List<T>::List()
{
	start = null;
	end = null;
}

template <class T>
void List<T>::PrintForward()
{
	PrintForward(start);
}

template <class T>
void List<T>::PrintReverse()
{
	PrintReverse(start);
}

template <class T>
void List<T>::PrintForward(Node<T> *head)
{
	if(head == null || head->next == null)
	{
		return;
	}
	else
	{
		std::cout<<head->data;
		Print(head->next);
	}
}

template <class T>
void List<T>::PrintReverse(Node<T> *head)
{
	if(head != null)
	{
		Print(head->next);
	}
	else
	{
		return;
	}
	
	std::cout<<head->data;
}

template<class T>
void List<T>::Add(T data)
{
	Node<T> * ptr = new Node<T>(data);
	if(end == null)
	{
		head = ptr;
		end = ptr;
	}
	else
	{
		end->next = ptr;
		end = ptr;
	}	
}