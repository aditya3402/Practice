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
		list.PrintForward();
		list.PrintReverse();
		list.ReverseList();
		list.PrintForward();
		list.PrintReverse();
	}
}