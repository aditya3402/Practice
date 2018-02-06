#ifndef BTREE_H
#define BTREE_H

namespace Tree
{
    class Node
    {
    public:
        double data;
        Node *left;
        Node *right;

        Node(double data)
        {
            this->data = data;
            this->left = NULL;
            this->right = NULL;
        }
    };

    class BTree
    {
    public:
        BTree();
        virtual ~BTree();
        void MakeTree(double data);
        void Inorder();
        void Preorder();
        void Postorder();


    private:
        Node * MakeTree(Node *,double data);
        void Inorder(Node * root);
        void Preorder(Node * root);
        void Postorder(Node * root);

        //data member
        Node *root;
    };
}

#endif // BTREE_H
