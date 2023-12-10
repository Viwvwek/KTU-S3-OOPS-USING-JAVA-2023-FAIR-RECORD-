/**
Write a Java program 
that shows the usage 
of try, catch, throws
and finally
*/

public class Except {

	public static void main(String[] args) {
		int a=10;
		String b = "9";
		int total=0;
		try {
		    int x = Integer.parseInt(b);//conversion of String to an Integer
		try {
		    total = x+a;
	    	}
	    	catch(Exception e)
	    	{
	    	    System.out.println("Nested Try ");
	    	}
		}
		catch(Exception e)
		{
			System.out.println("Excpetion is Found");
		}
		finally
		{
		    System.out.println(total);
		    System.out.println("End");
		}
		
	}

}
