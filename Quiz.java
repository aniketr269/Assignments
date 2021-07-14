import java.util.*;
public class QuizGame {
	int c=0;
	static int d=0;
	int ch=1;
	int option;
	public static int[] RandomArray()
	{
		{
			int f=1;
		
			int arr[]=new int[10];
			int i;int j;
			for(i=0;i<10;i++)
			{
				f=1;
			 	int min_val = 1;
		        int max_val = 17;
		        Random ran = new Random();
		        int xy = ran.nextInt(max_val) + min_val;
		        System.out.println("XYoi  "+xy);
		        //System.out.println("IN I loop arr[i]"+arr[i]+" i.. "+i);
		        for(j=0;j<10;j++)
		        {
		        	//System.out.println("IN J loop arr[i]"+arr[i]+" i "+i);
		        	//System.out.println("IN J loop arr[j]"+arr[j]+" j "+j);
		        	
		        	if(arr[j]==xy)
		        	{
		        		//System.out.println("true");
		        		i=i-1;
		        		f=0;
		        		break;
		        	}
		        }
		        if(f==0)
		        	continue;
		        else
		        	arr[i]=xy;
		        	
		      //  System.out.println("IN I last BEFORE arr[i]"+arr[i]+" i.. "+i);
		       // arr[i]=xy;
		       // System.out.println("IN I last AFTER arr[i]"+arr[i]+" i.. "+i);
				
			}
		/*	for(i=0;i<10;i++)
			{
				System.out.println(arr[i]);
				
			} */
			
			return arr;
			
}
		
		
	}
	public int questionBank()
	{
	Scanner sc=new Scanner(System.in);
	boolean o=true;
	int i;int ch;
	int arr[]=RandomArray();
	for(i=0;i<10;i++)
	{
		ch=arr[i];
		switch(ch)
		 {
		
		 case 1:
			 if(d>=4)
				 break;
			 System.out.print("Number not divisible by 2\n1: 2\n2: 9\n3: 8\n4: 20\n");

			 while(o) 
				 
			 {
				 System.out.print("Enter your option");
				 option=sc.nextInt();
				 System.out.println();
				 if (option==1 || option==2 || option==3 || option==4)
				 {
					 break;
					 
				 }
				 else
					 System.out.println("Invalid option entered\n--------TRY AGAIN---------\n");
			 }

			 if(option==2)
			 {
				 c++;
			 }
			 else
				 d++;
			 break;
		 case 2:
			 if(d>=4)
				 break;
			 System.out.print("Entomology studies what?\n1:Behavior of human beings\n2:Insects\n3:The origin and history of technical and scientific terms\n4:The formation of rocks\n");
			 while(o) 
				 
			 {
				 System.out.print("Enter your option");
				 option=sc.nextInt();
				 System.out.println();
				 if (option==1 || option==2 || option==3 || option==4)
				 {
					 break;
					 
				 }
				 else
					 System.out.println("Invalid option entered\n--------TRY AGAIN---------\n");
			 }
			 if(option==2) 
			 {
				 c++;
			 }
			 else
				 d++;
			 break;
			 
		 case 3:
			 if(d>=4)
				 break;
			 System.out.print("Who is the father of geometry?\n1:Aristotle\n2:Euclid\n3:Pythagoras\n4:Kepler\n");
			 while(o) 
				 
			 {
				 System.out.print("Enter your option");
				 option=sc.nextInt();
				 System.out.println();
				 if (option==1 || option==2 || option==3 || option==4)
				 {
					 break;
					 
				 }
				 else
					 System.out.println("Invalid option entered\n--------TRY AGAIN---------\n");
			 }
			 if(option==2) 
			 {
				 c++;
			 }
			 else
				 d++;
			 break;
		 case 4:
			 if(d>=4)
				 break;
			 System.out.print( "Who is popularly called as the Iron Man of India?\n1:Subhash Chandra Bose\n2:Sardar Vallabhbhai Patel\n3:Jawaharlal Nehru\n4:Govind Ballabh Pant\n");
			 while(o) 
				 
			 {
				 System.out.print("Enter your option");
				 option=sc.nextInt();
				 System.out.println();
				 if (option==1 || option==2 || option==3 || option==4)
				 {
					 break;
					 
				 }
				 else
					 System.out.println("Invalid option entered\n--------TRY AGAIN---------\n");
			 }
			 if(option==2) 
			 {
				 c++;
			 }
			 else
				 d++;
			 break;
		 case 5:
			 if(d>=4)
				 break;
			 System.out.print( "The radioactive element radium was invented by which of the following scientists?\n1:Marie Curie\n2:Benjamin Franklin\n3:Albert Einstein\n4:Isaac Newton\n");
			 while(o) 
				 
			 {
				 System.out.print("Enter your option");
				 option=sc.nextInt();
				 System.out.println();
				 if (option==1 || option==2 || option==3 || option==4)
				 {
					 break;
					 
				 }
				 else
					 System.out.println("Invalid option entered\n--------TRY AGAIN---------\n");
			 }
			 if(option==1) 
			 {
				 c++;
			 }
			 else
				 d++;
			 break;
		 case 6:
			 if(d>=4)
				 break;
			 System.out.print( "The Indian, who holds the pride of beating the computers in mathematical wizard is:\n1:Shakuntala Devi\n2:Raja Ramanna\n3:Ramanujam\n4:Rina Panigrahi\n");
			 while(o) 
				 
			 {
				 System.out.print("Enter your option");
				 option=sc.nextInt();
				 System.out.println();
				 if (option==1 || option==2 || option==3 || option==4)
				 {
					 break;
					 
				 }
				 else
					 System.out.println("Invalid option entered\n--------TRY AGAIN---------\n");
			 }
			 if(option==1) 
			 {
				 c++;
			 }
			 else
				 d++;
			 break;
		 case 7:
			 if(d>=4)
				 break;
			 System.out.print( "Nobel prize is awarded for which of the following disciplines::\n1:Literature, peace and economics\r\n"
			 		+ "\n2:Medicine or Physiology\n3:Chemistry and Physics\n4:All the above\n");
			 while(o) 
				 
			 {
				 System.out.print("Enter your option");
				 option=sc.nextInt();
				 System.out.println();
				 if (option==1 || option==2 || option==3 || option==4)
				 {
					 break;
					 
				 }
				 else
					 System.out.println("Invalid option entered\n--------TRY AGAIN---------\n");
			 }
			 if(option==4) 
			 {
				 c++;
			 }
			 else
				 d++;
			 break;
		 case 8:
			 if(d>=4)
				 break;
			 System.out.print( "110 divided by 10 is::\n1:11\n2:10\n3:5\n4:None of these\n");
			 while(o) 
				 
			 {
				 System.out.print("Enter your option");
				 option=sc.nextInt();
				 System.out.println();
				 if (option==1 || option==2 || option==3 || option==4)
				 {
					 break;
					 
				 }
				 else
					 System.out.println("Invalid option entered\n--------TRY AGAIN---------\n");
			 }
			 if(option==1) 
			 {
				 c++;
			 }
			 else
			 	d++;
			 break;
		 case 9:
			 if(d>=4)
				 break;
			 System.out.print( "The product of 82 and 5 is:\n1:400\n2:410\n3:420\n4:None of these\n");
			 while(o) 
				 
			 {
				 System.out.print("Enter your option");
				 option=sc.nextInt();
				 System.out.println();
				 if (option==1 || option==2 || option==3 || option==4)
				 {
					 break;
					 
				 }
				 else
					 System.out.println("Invalid option entered\n--------TRY AGAIN---------\n");
			 }
			 if(option==2) 
			 {
				 c++;
			 }
			 else
				 d++;
			 break;
		 case 10: 
			 if(d>=4)
				 break;
			 System.out.print( "Find the missing terms in multiple of 3: 3, 6, 9, __, 15\n1:10\n2:11\n3:12\n4:13\n");
			 while(o) 
				 
			 {
				 System.out.print("Enter your option");
				 option=sc.nextInt();
				 System.out.println();
				 if (option==1 || option==2 || option==3 || option==4)
				 {
					 break;
					 
				 }
				 else
					 System.out.println("Invalid option entered\n--------TRY AGAIN---------\n");
			 }
			 if(option==3) 
			 {
				 c++;
			 }
			 else
				 d++;
			 break;
		 case 11:
			 if(d>=4)
				 break;
			 System.out.print( "50 times of 8 is equal to:\n1:100\n2:40\n3:400\n4:640\n");
			 while(o) 
				 
			 {
				 System.out.print("Enter your option");
				 option=sc.nextInt();
				 System.out.println();
				 if (option==1 || option==2 || option==3 || option==4)
				 {
					 break;
					 
				 }
				 else
					 System.out.println("Invalid option entered\n--------TRY AGAIN---------\n");
			 }
			 if(option==3) 
			 {
				 c++;
			 }
			 else
				 d++;
			 break;
		 case 12:
			 if(d>=4)
				 break;
			 System.out.print( "Solve 24÷8+2.:\n1:5\n2:6\n3:8\n4:12\n");
			 while(o) 
				 
			 {
				 System.out.print("Enter your option");
				 option=sc.nextInt();
				 System.out.println();
				 if (option==1 || option==2 || option==3 || option==4)
				 {
					 break;
					 
				 }
				 else
					 System.out.println("Invalid option entered\n--------TRY AGAIN---------\n");
			 }
			 if(option==1) 
			 {
				 c++;
			 }
			 else
				 d++;
			 break;
		 case 13:
			 if(d>=4)
				 break;
			 System.out.print( "What is the next prime number after 5?:\n1:6\n2:7\n3:9\n4:11\n");
			 while(o) 
				 
			 {
				 System.out.print("Enter your option");
				 option=sc.nextInt();
				 System.out.println();
				 if (option==1 || option==2 || option==3 || option==4)
				 {
					 break;
					 
				 }
				 else
					 System.out.println("Invalid option entered\n--------TRY AGAIN---------\n");
			 }
			 if(option==2) 
			 {
				 c++;
			 }
			 else
				 d++;
			 break;
		 case 14:
			 if(d>=4)
				 break;
			 System.out.print( "What is 86 – 9?:\n1:76\n2:77\n3:78\n4:79\n");
			 while(o) 
				 
			 {
				 System.out.print("Enter your option");
				 option=sc.nextInt();
				 System.out.println();
				 if (option==1 || option==2 || option==3 || option==4)
				 {
					 break;
					 
				 }
				 else
					 System.out.println("Invalid option entered\n--------TRY AGAIN---------\n");
			 }
			 if(option==2) 
			 {
				 c++;
			 }
			 else
				 d++;
			 break;
		 case 15:
			 if(d>=4)
				 break;
			 System.out.print( "Solve: 300 – (150×2):\n1:150\n2:100\n3:50\n4:0\n");
			 while(o) 
				 
			 {
				 System.out.print("Enter your option");
				 option=sc.nextInt();
				 System.out.println();
				 if (option==1 || option==2 || option==3 || option==4)
				 {
					 break;
					 
				 }
				 else
					 System.out.println("Invalid option entered\n--------TRY AGAIN---------\n");
			 }
			 if(option==4) 
			 {
				 c++;
			 }
			 else
				 d++;
			 break;
		 case 16:
		 
			 if(d>=4)
				 break;
			 System.out.print( "The product of 121 x 0 x 200 x 25 is:\n1:1500\n2:0\n3:4000\n4:None of these\n");
			 while(o) 
				 
			 {
				 System.out.print("Enter your option");
				 option=sc.nextInt();
				 System.out.println();
				 if (option==1 || option==2 || option==3 || option==4)
				 {
					 break;
					 
				 }
				 else
					 System.out.println("Invalid option entered\n--------TRY AGAIN---------\n");
			 }
			 if(option==2) 
			 {
				 c++;
			 }
			 else
				 d++;
			 break;
		 case 17:
			 if(d>=4)
				 break;
			 System.out.print( "What is the sum of 130+125+191?:\n1:335\n2:456\n3:446\n4:426\n");
			 while(o) 
				 
			 {
				 System.out.print("Enter your option");
				 option=sc.nextInt();
				 System.out.println();
				 if (option==1 || option==2 || option==3 || option==4)
				 {
					 break;
					 
				 }
				 else
					 System.out.println("Invalid option entered\n--------TRY AGAIN---------\n");
			 }
			 if(option==3) 
			 {
				 c++;
			 }
			 else
				 d++;
			 break;
			 
			 
			 
			 
			 
			}//end of switch
	}
	return c;
	}
	public static void main(String[] args)
	{
		QuizGame obj=new QuizGame();
		int marks=obj.questionBank();
		if(QuizGame.d>=4)
			System.out.println("-----------STUDENT FAILED------------");
		System.out.println("Marks Scored out of 10 is "+" "+ marks+"/"+"10\n\n");
		System.out.println("*Remarks--Passing marks>=7");
		
	}

}
