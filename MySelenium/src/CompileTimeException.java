import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CompileTimeException {

	public static void main(String[] args) throws FileNotFoundException {
		
		System.out.println("Program Execution starts here");
		
		
		
		try
		{
			Thread.sleep(2000);
			
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		finally
		{
		System.out.println("Continue pgm execution");
		}
		try 
		{
			Thread.sleep(1000);
		} 
		catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		
		File file = new File("absolute path of file");
		
		FileInputStream ip = new FileInputStream(file);
		
		System.out.println("Program Execution Ends here");

	}

}
