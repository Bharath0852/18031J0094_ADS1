import java.util.Scanner;
import java.util.Stack;


class Node
{
	 Object item;
	 Node next;
	 Node prev;
	 Node(Object d)
	 {
		 item=d;
		 next=null; 
		 prev=null;
	 }
	 public void displayNode() {
		 if(item!=null)
		 {
		    System.out.print(item);
		    System.out.print(" ");
		 }

		 }
}

public class Solution {
	private Node first;
	private Node last;
	public boolean isEmpty()
	{
		return first==null;
	}
	public void EnqueueAtLast(Object item)
	{
		Node n=new Node(item);
		if(isEmpty())
		{
			first=n;
		    last=n;
		}
		else
		{
            last.next=n;
            last=last.next;
		}
	}
	public void EnqueueAtFirst(Object item)
	{
        
		 Node n = new Node(item);
		   Node temp=first;
		    if(this.isEmpty())
			{
		    	
		    	 first = n;
		    	 last=n;
			}
		    /*if(isEmpty())
			{
				first=last;
			}*/
			else
			{
				first=n;
				first.next=temp;
			}
	}
	public void DequeueAtFirst()
	{
		if(this.isEmpty())
		{
			System.out.println("Deck is empty");
			return;
		}
		Node temp=first;
		first=temp.next;
		
	}
	public void DequeueAtLast()
	{
		Node temp=first;
		    if(this.isEmpty())
		    {
		    	System.out.println("Deck is empty");
		    	return;
		    }
		    else if(temp.next==null)
		    {
		    	last=temp;
		    }
		    else
		    {
			while(temp!=null)
			{
				
				if(temp.next.next==null)
				{
					
					temp.next=null;
					break;
				}
				temp=temp.next;
			}
			last=temp;
		    }
	}
	int size()
	{
		int count=0;
		Node temp=first;
		while(temp!=null)
		{
			count++;
			temp=temp.next;
			
		}
	return count;
	}
	void dispaly1(Solution q)
	{
		Stack d=new Stack();
		Node temp=first;
		if(temp==null)
		{
			System.out.println(d);
		}
		else
		{
		while(temp!=null)
		{
			d.push(temp.item);
			temp=temp.next;
		}
		System.out.println(d);
		}
		
		
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in); 
		Solution q=new Solution();
		int n=sc.nextInt();
		while(sc.hasNext())
		{
			String s=sc.nextLine();
			String[] p=s.split(" ");
			switch(p[0])
			{
			case "pushLeft":
				q.EnqueueAtFirst(p[1]);
				q.dispaly1(q);
				break;
			case "pushRight":
				q.EnqueueAtLast(p[1]);
				q.dispaly1(q);
				break;
			case "popLeft":
				q.DequeueAtFirst();
				if(!q.isEmpty())
				q.dispaly1(q);
				break;
			case "popRight":
				q.DequeueAtLast();
				if(!q.isEmpty())
				q.dispaly1(q);
				break;
			case "size":
				System.out.println(q.size());
				break;
				          
			}
		}
	}


}
