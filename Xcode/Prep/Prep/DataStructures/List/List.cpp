#include <cstdlib>
#include <iostream>
#include "../../include/List.h"
#include ""

using namespace List;

template<class T>
Node<T>::Node(T data)
{
	this->data = data;
	this->next = NULL;
}

template <class T>
List<T>::List()
{
	start = NULL;
	end = NULL;
}

template <class T>
List<T>::~List()
{
    DeleteList();
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
	if(head == NULL || head->next == NULL)
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
	if(head != NULL)
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
	if(end == NULL)
	{
		start = ptr;
		end = ptr;
	}
	else
	{
		end->next = ptr;
		end = ptr;
	}
}

template<class T>
void List<T>::DeleteList(Node<T> *head)
{
    if(head !=NULL)
    {
        DeleteList(head->next);
    }
    delete head;
}
