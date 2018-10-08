
import java.util.*;

class lists
{
	 Node temp ;
	Node head;
	class Node 
	{
        int data;
        Node next; 
       
        Node(int d)  
        {
        	this.data = d; 
        	next=null;
        }
	}
	public void insert(int a)
	{
		Node n=new Node(a);
		
		if(head==null)
		{
			head=n;
			//System.out.println("gh"+head.data);
			
		}
		else if(head.next==null)
		{
			
			temp=n;
		}
		else
		{
			while(temp.next==null)
					temp.next=n;
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
	public int deletefst() 
	{
		int element=head.data;
		//d=element;
		if(head.next!=null)
		{
			head=head.next;
		}
		AddLargeNumbers addd= new AddLargeNumbers();
		//addd.digitsToNumber(element);
		return element;
	}
}
	class AddLargeNumbers 
	{    
	    public static LinkedList numberToDigits(String number) 
	    {
	    	Scanner sc = new Scanner(System.in);
	    	String num1;
	    	int j=0;
	    	num1=number;
	    	int n1,n2,sum=0,a,b;
			n1=Integer.parseInt(num1);
//			char c;
//			for(j=0;j<num1.length();j++)
//				c=num1.charAt(j);
				
			
			//int i=0;
			while(n1!=0)
			{
				a=n1%10;
				sum=sum*10+a;
//				sum=sum+a*10^i;
				n1=n1/10;
				//i++;
			}
			System.out.println("sum= "+sum);
			int sum1=0;
			while(sum!=0)
			{
				b=sum%10;
				lists l= new lists();
				l.insert(b);
				sum1=sum1*10+b;
				sum=sum/10;
			}
			String ss=String.valueOf(sum);
			
			return null;
	    }

	    public static String digitsToNumber(LinkedList list) 
	    {
	    	int a,sum=0;
	    	lists l= new lists();
	    	a=l.deletefst();
	    	sum=sum*10+a;
	    	
	    	
			return null;
	    }
	    public static LinkedList addLargeNumbers(LinkedList list1, LinkedList list2) 
	    {
	    	
			return null;
	    }
	}

	public class Solution {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String input = sc.nextLine();
	        String p = sc.nextLine();
	        String q = sc.nextLine();
	        AddLargeNumbers aln= new AddLargeNumbers();
	        aln.numberToDigits(p);
	        aln.numberToDigits(q);
	        switch(input){
	            case "numberToDigits":
	                LinkedList pDigits = AddLargeNumbers.numberToDigits(p);
	                LinkedList qDigits = AddLargeNumbers.numberToDigits(q);
	                System.out.println(AddLargeNumbers.digitsToNumber(pDigits));
	                System.out.println(AddLargeNumbers.digitsToNumber(qDigits));
	                break;

	            case "addLargeNumbers":
	                LinkedList pDigits1 = AddLargeNumbers.numberToDigits(p);
	                LinkedList qDigits1 = AddLargeNumbers.numberToDigits(q);
	                LinkedList result = AddLargeNumbers.addLargeNumbers(pDigits1, qDigits1);
	                System.out.println(AddLargeNumbers.digitsToNumber(result));
	                break;
        }
    }   
}

 