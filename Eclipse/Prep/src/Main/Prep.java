package Main;

import Utils.List.*;
import Utils.BTree.*;
import Utils.Stack.*;

public class Prep 
{

	public static void main(String[] args) 
	{
		List<Integer> list = new List<Integer>();
		list.AddRear(10);
		list.AddRear(20);
		list.AddRear(30);
		list.AddRear(500);
		list.AddRear(30);
		list.AddRear(20);
		list.AddRear(10);
		
		if(list.IsPalindrome())
			System.out.println("yes");
		else
			System.out.println("no");
	}
}
