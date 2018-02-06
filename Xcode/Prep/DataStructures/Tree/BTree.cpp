#include <cstdlib>
#include <iostream>
#include "../../Include/BTree.h"

using namespace Tree;

BTree::BTree()
{
    root = NULL;
}

BTree::~BTree()
{
    DeleteTree(root);
}

void BTree::MakeTree(double data)
{
    root = MakeTree(root,data);
}

void BTree::Inorder()
{
    //this->Inorder(root);
    std::cout<<"\n";
}

void BTree::Preorder()
{
    //Preorder(root);
    std::cout<<"\n";
}

void BTree::Postorder()
{
    //Postorder(root);
    std::cout<<"\n";
}

void BTree::Inorder(Node *root)
{
    if(root)
    {
        Inorder(root->left);
        std::cout<<root->data<<"\t";
        Inorder(root->right);
    }
}


void BTree::Preorder(Node *root)
{
    if(root)
    {
        std::cout<<root->data<<"\t";
        Preorder(root->left);
        Preorder(root->right);
    }
}

void BTree::Postorder(Node *root)
{
    if(root)
    {
        Postorder(root->left);
        Postorder(root->right);
        std::cout<<root->data<<"\t";
    }
}

Node * BTree::MakeTree(Node *root ,double data)
{
    if(!root)
    {
        root = new Node(data);
    }
    else if(data<=root->data)
    {
        root->left = MakeTree(root->left,data);
    }
    else
    {
        root->right = MakeTree(root->right,data);
    }
    return root;
}

void BTree::DeleteTree(Node* root)
{
    if(root)
    {
        DeleteTree(root->left);
        DeleteTree(root->right);
        delete root;
    }
}
