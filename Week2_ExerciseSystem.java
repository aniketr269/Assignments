import java.util.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class ExerciseS 
{
	Scanner sc=new Scanner(System.in);
	String name;
	float duration;
	String date;
	float totalCalories;
	HashMap<String,Float> typeE=new HashMap<String,Float>();
	ExerciseS()
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
	static void printDataAggregate(ExerciseS o)
	{
		System.out.println("Name:"+o.name);
		System.out.println("Calories Burned=:"+o.totalCalories);
	}
	static void printDataDetailed(ExerciseS ob)
	{
		System.out.println("Name:"+ob.name);
		System.out.println("Date:"+ob.date);
		if(ob.typeE.containsKey("Walking"))
		System.out.println("Calories burned in Walking:"+ob.typeE.get("Walking"));
		if(ob.typeE.containsKey("Running"))
		System.out.println("Calories burned in Running:"+ob.typeE.get("Running"));
		if(ob.typeE.containsKey("Cycling"))
		System.out.println("Calories burned in Cycling:"+ob.typeE.get("Cycling"));
		System.out.println("Total Calories Burned=:"+ob.totalCalories);
	}
	float calorieWalking()
	{
	 float cal;
	System.out.println("Enter duration of Walking");
	duration=sc.nextFloat();
	cal=((1000*duration)/120);
	return cal;
	}
	float calorieRunning()
	{
		 float cal;
			System.out.println("Enter duration of Running");
			duration=sc.nextFloat();
			cal=((1400*duration)/120);
			return cal;
	}
	float calorieCycling()
	{
		 	float cal;
			System.out.println("Enter duration of Cycling");
			duration=sc.nextFloat();
			cal=((1200*duration)/120);
			return cal;
	}
	public static void main(String args[])
	{
		boolean ch=true;
		Scanner sc=new Scanner(System.in);
		ArrayList<ExerciseS> arr=new ArrayList<ExerciseS>();
		int p=0;
		while(p!=2) 
		{
			ExerciseS obj=new ExerciseS();
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
					float w=obj.calorieWalking();
					if(w!=0)
					obj.typeE.put("Walking",w);
					cal=cal+w; 
					break;
				case 2:
					float r=obj.calorieRunning();
					if(r!=0)
					obj.typeE.put("Running",r);
					cal=cal+r;
					break;
				case 3:
					float C=obj.calorieCycling();
					if(C!=0)
					obj.typeE.put("Cycling",C);
					cal=cal+C;
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
		System.out.println("How you want to display data:\n1:Aggregate Mode\n2:Detailed Mode");
		int mode=sc.nextInt();
		for(ExerciseS E:arr)
		{
			if(mode==1)
				ExerciseS.printDataAggregate(E);
			else if(mode==2)
				ExerciseS.printDataDetailed(E);
		}
	}
}
