
public class RunTImeException {

	public static void main(String[] args) {
		
		System.out.println("Dividing a number by zero");
		
		try {
		System.out.println(20/0);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		System.out.println("calculation done1");
		System.out.println("calculation done2");
		System.out.println("calculation done3");
		System.out.println("calculation done4");
		

	}

}
