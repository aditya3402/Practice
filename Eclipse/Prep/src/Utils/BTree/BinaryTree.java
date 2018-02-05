package Utils.BTree;

public class BinaryTree 
{
	private Node root;
	
	public BinaryTree()
	{
		root = null;
	}
	
	public void MakeTree(double data)
	{
		root = MakeTree(root,data);
	}
	
	public void Inorder()
	{
		Inorder(root);
		System.out.println();
	}
	
	public void Preorder()
	{
		Preorder(root);
		System.out.println();
	}
	
	public void Postorder()
	{
		Postorder(root);
		System.out.println();
	}
	
	private void Inorder(Node root)
	{
		if(root != null)
		{
			Inorder(root.left);
			System.out.print("\t" + root.data);
			Inorder(root.right);
		}
	}
	
	private void Preorder(Node root)
	{
		if(root != null)
		{
			System.out.print("\t" + root.data);
			Preorder(root.left);
			Preorder(root.right);
		}
	}
	
	private void Postorder(Node root)
	{
		if(root != null)
		{
			Postorder(root.left);			
			Postorder(root.right);
			System.out.print("\t" + root.data);
		}
	}
	
	private Node MakeTree(Node root, double data)
	{
		if(root == null)
		{
			root = new Node(data);
		}
		else if(data <= root.data)
		{
			root.left = MakeTree(root.left, data);
		}
		else
		{
			root.right = MakeTree(root.right,data);
		}
		
		return root;
	}
}
