package Main;

import Utils.List.*;
import Utils.BTree.*;
import Utils.Stack.*;

public class Prep 
{

	public static void main(String[] args) 
	{
		Stack<Integer> stk = new Stack<Integer>();
		stk.Push(10);
		stk.Push(20);
		stk.Push(30);
		stk.Push(40);
		stk.Push(50);
		stk.Push(60);
		
		System.out.println(stk.Top());
		stk.pop();
		System.out.println(stk.Top());
		stk.pop();
		System.out.println(stk.Top());
	}
}
