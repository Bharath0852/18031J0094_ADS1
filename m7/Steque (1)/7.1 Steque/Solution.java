
import java.util.*;

public class Solution 
{
	public class Node 
	{
		int data;
		Node next;
		Node(Object d)
		{
			data=d;
			next=null;
		}
	}
		Node head;
		Node last;
		public void push(Object a)
		{
			Node n= new Node(a);
			if(head==null && head==null;)
			{
				head=n;
				last=n;
			}
			else if(head.next==null)
			{
				n.next=head;
				head=n;
				last=n;
			}
			else
			{
				n.next=head;
				head=n;
				last=n;
			}
		}
		public void enqueue(Object a)
		{
			Node n= new Node(a);
			if(head==null && last==null)
			{
				head=n;
				last=n;
			}
			else if(head.next==null)
			{
				n.next=head;
				head=n;
				last=n;
			}
			else
			{
				if(last==head)
				last=head;
				last.next=n;
			}
		}
		public void pop()
		{
			if(head==null)
			{
				System.out.println("Staque is empty.");
			}
			else if(head.next!=null)
			{
				head.next=head;
			}
			else
			{
				
			}
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
			}
			switch(n1)
			{
				case "push" :
					//s.push(Integer.parseInt(n2));
					s.push(n2);
					break;
				case "pop" :
					s.pop();
					s.print();
					break;
				case "enqueue" :
					//s.enqueue(Integer.parseInt(n2));
					s.enqueue(n2);
					break;
			}
		}
	}
}