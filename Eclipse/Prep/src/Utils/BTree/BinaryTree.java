package Utils.BTree;

public class BinaryTree<T> 
{
	private Node<T> root;
	
	public BinaryTree()
	{
		root = null;
	}
	
	public Node<T> MakeTree(Node<T> root, T data)
	{
		if(root == null)
		{
			root = new Node<T>(data);
		}
		else if(data <= root.data)
		{
			root = MakeTree(root.left, data);
		}
		else
		{
			root = MakeTree(root.right,data);
		}
		
		return root;
	}
	
	public Inorder()
	{
		
	}
}
