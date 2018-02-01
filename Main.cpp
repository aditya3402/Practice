#include<iostream>
#include "DataStructures/Header/List.h"

int main(int argc, char const *argv[])
{
	List<int> *list = new List<int>();
	list->Add(10);
	list->Add(20);
	list->Add(30);
	list->PrintForward();
	list->PrintReverse();
	return 0;
}