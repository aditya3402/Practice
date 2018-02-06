//
//  main.cpp
//  Prep
//
//  Created by Aditya Jena on 07/02/18.
//  Copyright © 2018 None. All rights reserved.
//

#include <iostream>
#include "include/List.h"
#include "include/BTree.h"

using namespace List;
using namespace Tree;

int main(int argc, const char * argv[]) {
    // insert code here...
    List<int> * list = new List<int>();
    list->Add(10);
    list->Add(20);
    list->Add(30);
    list->Add(40);
    
    list->PrintForward();
    list->PrintReverse();
    return 0;
}
