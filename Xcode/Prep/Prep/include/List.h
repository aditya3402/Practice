#ifndef LIST_H
#define LIST_H

namespace List
{
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
        virtual ~List();
        void PrintForward();
        void PrintReverse();
        void Add(T data);
    private:
        void PrintForward(Node<T> *head);
        void PrintReverse(Node<T> *head);
        void DeleteList(Node<T> *head);

        Node<T> * start;
        Node<T> * end;
    };
}
#endif // LIST_H
