
public class Test {

	public static void main(String[] args) {


		Test t1= new Test(); //Object creation -- constructors get called
		Test t2= new Test("Girish"); 
		t1.login();			

	}
	
	public void login()
	{
		System.out.println("This is login method ");
		System.out.println("All my biz logic is here ");
	}
	
	public Test() // User defined -- non parameterised constructor
	{
		System.out.println("All my preconditions are written here");
	}
	
	public Test(String abc) // User defined --  parameterised constructor
	{
		System.out.println("All my parameterised preconditions are written here");
	}

}
