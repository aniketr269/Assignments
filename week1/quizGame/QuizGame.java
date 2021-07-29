package quizGame1;

public class QuizGame
{
public static void main(String args[])
	{
	
		QuestionBank q=new QuestionBank();
		int c=q.Bank();
		if(QuestionBank.d>=4)
			System.out.println("-----------STUDENT FAILED------------");
		System.out.println("Marks Scored out of 10 is "+" "+ c+"/"+"10\n\n");
		System.out.println("*Remarks--Passing marks>=7");
		}

}
