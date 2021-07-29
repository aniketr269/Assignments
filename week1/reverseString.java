package reverseString;

public class reverseString {
    public static void main(String[] args)
    {
    	String str=new String("I am learning java");
    	char ch[]=str.toCharArray();
    	int i;
    	int n=ch.length-1;
    	String s="";
    	for(i=n;i>=0;i--)
    	{
    		
    		s=s+ch[i];
    		
    	}
    	System.out.println("Reversed String is -> "+s);
    }
    
	

}
