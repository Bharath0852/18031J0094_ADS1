
import java.util.Scanner;

public class Solution
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s2=sc.next();
		String [] d=s2.split(" ");
		Stack st= new Stack(s2.length());
		int cap=0;
		int a;
		int b;
		int i;
		for(i=0;i<d.length;i++)
		{
			String s1=d[i];
			switch(s1)
			{
				case "+" :
					a=st.pop();
					b=st.pop();
					cap=a+b;
					st.push(cap);
					break;
				case "*" :
					a=st.pop();
					b=st.pop();
					cap=a*b;
					st.push(cap);
					break;
				case "-" :
					a=st.pop();
					b=st.pop();
					cap=a-b;
					st.push(cap);
					break;
				case "/" :
					a=st.pop();
					b=st.pop();
					cap=a/b;
					st.push(cap);
					break;
				default :
					int e=Integer.parseInt(s1);
					st.push(e);
			}
			System.out.println(cap);
		}
	}
}
class Stack
{
	int [] a;
	int Top=0;
	public Stack(int n)
	{
		a= new int [n];
	}
	boolean IsEmpty()
	{
		return Top==0;
	}
	boolean IsFull()
	{
		return Top==a.length;
	}
	int pop()
	{
		int b=0;
		if (!IsEmpty()) 
        { 
            b=a[--Top];
            return b;
        }
		return b;
	}
	void push(int pu)
	{
		if(!IsFull())
		{
			a[Top++]=pu;
		}
	}
}
