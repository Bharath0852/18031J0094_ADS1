
import java.util.*;

public class Solution 
{
	
	public static void main (String[] args)
	{
		Solution s= new Solution();
		Scanner sc = new Scanner (System.in);
		String n1,n2 = null;
		int num,num1;
		num1=sc.nextInt();
		while(sc.hasNext())
		{
			String s1=sc.nextLine();
			String[] s2=s1.split(" ");
			n1=s2[0];
			if(s2.length>1)
			{
				n2=s2[1];
			
			num=Integer.parseInt(n2);
			switch(n1)
			{
				case "push" :
					//s.push(Integer.parseInt(n2));
					s.push(num);
					break;
				case "pop" :
					s.pop();
					s.print();
					break;
				case "enqueue" :
					//s.enqueue(Integer.parseInt(n2));
					s.enqueue(num);
					break;
			}}
		}
	}

public class Node 
{
	int data;
	Node next;
	Node(int d)
	{
		data=d;
		next=null;
	}
}
	Node head;
	public void push(int a)
	{
		Node n= new Node(a);
		if(head==null)
		{
			head=n;
		}
		else if(head.next==null)
		{
			n.next=head;
			head=n;
		}
		else
		{
			n.next=head;
			head=n;
		}
	}
	public void enqueue(int a)
	{
		Node n= new Node(a);
		if(head==null)
		{
			head=n;
		}
		else if(head.next==null)
		{
			n.next=head;
			head=n;
		}
		else
		{
			n.next=head;
			head=n;
		}
	}
	public int pop()
	{
		int temp = 0;
		if(head==null)
		{
			System.out.println("Staque is empty.");
		}
		else if(head.next!=null)
		{
			temp=head.data;
			head.next=head;
			
		}
		return temp;
	}
	public void print()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}


}


//node

//operations




