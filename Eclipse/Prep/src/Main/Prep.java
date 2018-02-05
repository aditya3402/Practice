package Main;
import Utils.List.*;

public class Prep 
{
	
public static void main(String[] args)
	{
		List<Integer> list = new List<Integer>();
		list.Add(10);
		list.Add(20);
		list.Add(30);
		list.Add(40);
		list.Add(50);
		
		System.out.println("//Print List");
		list.PrintForward();
		
		System.out.println("//Print reverse without reversing the list");
		list.PrintReverse();
		
		System.out.println("//Reverse List");
		list.ReverseList();
		list.PrintForward();
		
		System.out.println("//Swap nodes in a linked list without swapping data- errorcase");
		list.swapNodes(20,70);
		list.PrintForward();
		
		System.out.println("//Swap nodes in a linked list without swapping data- validcase");
		list.swapNodes(20,40);
		list.PrintForward();
	}
}
