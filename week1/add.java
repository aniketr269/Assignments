import java.util.*;
import java.util.Scanner;

public class add 
{
	int a,b;
	add()
	{}
	
	add(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public int Sum() 
	{
		return(a+b);
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int x=sc.nextInt();
		System.out.println("Enter second number");
		int y=sc.nextInt();
		add a=new add(x,y);
		add b=new add();
		System.out.println("Addition of two number is "+a.Sum()); 
       
	}
}
