
public class RunTimeExceptionArray {

	public static void main(String[] args) {
		
		System.out.println("I have started the program execution");
		int arr[] = new int[3];
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		try
		{
			System.out.println(arr[3]);
//			System.out.println("I m in the middle of try catch block");
//			System.out.println(20/0);
//			System.out.println("I m at the end of try catch block");
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("This is finally block, and it will be executed anyhow");
		}
		
		System.out.println("I have handled the Runtime Exception");
	}

}
