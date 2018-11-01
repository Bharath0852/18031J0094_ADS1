package M_16;

import java.util.Scanner;

public class Solution 
{
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		while(sc.hasNext())
		{
			String s1;
			s1=sc.next();
			
			String s[]=s1.split(","); 
			Book k= new Book(s[1],s[2],Double.parseDouble(s[3]));
			BST b=new BST();
			switch(s[0])
			{
				case "put" :
					b.put(k, Integer.parseInt(s[4]));
					break;
				case "get" :
					b.get(k, Integer.parseInt(s[4]));
					break;
			}
		}
	}
}
class BST
{
	Tree root;
	class Tree
	{
		Book key;
		int value;
		Tree(Book key,int n)
		{
			this.value=n;
			
		}
	}
	public void put(Book key, int value) 
	{
		
		
		
	}
	public void get(Book k, int parseInt) 
	{
		// TODO Auto-generated method stub
	
		
	}

}
class Book
{
	String name;
	String author;
	Double price;
	
	public Book(String name, String author, Double price) 
	{
		//super();
		this.name = name;
		this.author = author;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public String getAuthor() {
		return author;
	}
	public Double getPrice() {
		return price;
	}
}