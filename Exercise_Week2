import java.util.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Exercise {
	Scanner sc=new Scanner(System.in);
	String name;
	float duration;
	String date;
	float totalCalories;
	Exercise()
	{
		name=null;
		duration=0.0f;
		date=null;
		totalCalories=0.0f;
		
	}
	void input()
	{
		System.out.println("Enter name of a user");
		name=sc.nextLine();
		int f;
		System.out.println("Press 1 to enter date else it will be default");
		f=sc.nextInt();
		
		String str;
		if(f==1)
		{
			System.out.println("Enter date in format of dd-MM-yyyy");
			str=sc.next();
			date=str;
		}
		else
		{
		LocalDateTime t1=LocalDateTime.now();
		DateTimeFormatter fd=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		date=t1.format(fd);
		}
		
	}
	void printData()
	{
		System.out.println("Name:"+name);
		System.out.println("Date:"+date);
		System.out.println("Calories Burned=:"+totalCalories);
	}
	
	public static void main(String []args)
	{
		boolean ch=true;
		Scanner sc=new Scanner(System.in);
		ArrayList<Exercise> arr=new ArrayList<Exercise>();
		int p=0;

while(p!=2) 
{
	Exercise obj=new Exercise();
	Walking w=new Walking();
	Cycling c=new Cycling();
	Running g=new Running();
	obj.input();
	float cal=0.0f;
	ArrayList<Integer> a=new ArrayList<Integer>(4);
	
	
	do
	{
		
		System.out.println("Enter the number in which exercise is associated\n");
		
		
		if(a.contains(1))
		{
			System.out.println("Enter type of a exercise \n2:Running\n3:Cycling\n");
		}
		else if(a.contains(2))
		{
			System.out.println("Enter type of a exercise\n1:Walking\n3:Cycling\n");
		}
		else if(a.contains(3))
		{
			System.out.println("Enter type of a exercise\n1:Walking\n2:Running\n");
			
		}
		else
			System.out.println("Enter type of a exercise\n1:Walking\n2:Running\n3:Cycling\n");
		int c1=sc.nextInt();
		a.add(c1);
		switch(c1) 
		{
		case 1:
			w.getData();
			cal=cal+w.calculateCalories();

			break;
		
		case 2:
			g.getData();
			cal=cal+g.calculateCalories();
			

			break;
		case 3:
			c.getData();
			cal=cal+c.calculateCalories();

			break;
		}
	System.out.println("Does user did more exercise,if yes press 1 else press 0 to exit\n");
	int cc=sc.nextInt();
	if(cc==1)
		ch=true;
	else
		ch=false;
	}while(ch);
	obj.totalCalories=cal;
	arr.add(obj);
	p=p+1;
	a.clear();
	
}
for(Exercise e:arr)
{
	System.out.println(e.name);
	System.out.println(e.date);
	System.out.println("Calories Burned"+e.totalCalories);
}
}
	}
class Walking extends Exercise
{
	
	float calories;
	Walking()
	{
		
		calories=0.0f;
	}
	void getData()
	{
		System.out.println("Enter duration of Walking");
		duration=sc.nextFloat();
	}
	float calculateCalories()
	{
		calories=((1000*duration)/120);
		return calories;
	}
}
class Running extends Exercise
{
	
	float calories;
	Running()
	{
		
		calories=0.0f;
	}
	void getData()
	{
		System.out.println("Enter duration of Running");
		duration=sc.nextFloat();
	}
	float calculateCalories()
	{
		calories=((1400*duration)/120);
		return calories;
	}
}
class Cycling extends Exercise
{
	
	float calories;
	Cycling()
	{
		
		calories=0.0f;
	}
	void getData()
	{
		System.out.println("Enter duration of Cycling");
		duration=sc.nextFloat();
	}
	float calculateCalories()
	{
		calories=((1200*duration)/120);
		return calories;
	}
}
