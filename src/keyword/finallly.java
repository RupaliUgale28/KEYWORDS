package keyword;
public class finallly 
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=0;
		int c;
		
		//Risky code=code where error can come
		try
		{
			c=a/b;//arithemetic exception = cant divide by zero
			System.out.println(c);
		}
		
		//catch the exceptions here= exception catching code
		catch(Exception z)//Exception word is must
		{
			System.out.println(z);
		}
		
		//clean up the code or close the file
		finally
		{
			System.out.println("clean up code");
		}
	}

}
//we can write the multiple catch block for one try block
//finally block alwatys executes
//exception occur==> try--catch--finally block executes.
//no exception occure==> try--finally block executes.