//
//  main.cpp
//  Prep
//
//  Created by Aditya Jena on 07/02/18.
//  Copyright © 2018 None. All rights reserved.
//

#include <iostream>
#include "../Include/List.h"
#include "../Include/BTree.h"

using namespace List;
using namespace Tree;

int main(int argc, const char * argv[]) {
    // insert code here...
    //List<int> * list = new List<int>();
    double arr[] = {62,43,61,41,24,90,25,42,45,23,97};
    BTree * tree = new BTree();
    for(int i=0;i<11;i++)
    {
        tree->MakeTree(arr[i]);
    }
    
    tree->Inorder();
    tree->Preorder();
    tree->Postorder();
    /*
    list->Add(10);
    list->Add(20);
    list->Add(30);
    list->Add(40);
    
    list->PrintForward();
    list->PrintReverse();*/
    
    delete tree;
    return 0;
}
