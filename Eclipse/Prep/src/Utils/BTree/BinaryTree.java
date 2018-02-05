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
	
	public void Inorder()
	{
		Inorder(root);
	}
	
	public void Preorder()
	{
		Preorder(root);
	}
	
	public void Postorder()
	{
		Postorder(root);
	}
	
	private void Inorder(Node<T> root)
	{
		if(root != null)
		{
			Inorder(root.left);
			System.out.print("\t" + root.data);
			Inorder(root.right);
		}
	}
	
	private void Preorder(Node<T> root)
	{
		if(root != null)
		{
			System.out.print("\t" + root.data);
			Preorder(root.left);
			Preorder(root.right);
		}
	}
	
	private void Postorder(Node<T> root)
	{
		if(root != null)
		{
			Postorder(root.left);			
			Postorder(root.right);
			System.out.print("\t" + root.data);
		}
	}
}
