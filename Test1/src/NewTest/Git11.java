package NewTest;


import org.testng.annotations.Test;

public class Git11 {
	@Test
	public void testA()
	{
		System.out.println("First Testcase");
	}
	@Test(dependsOnMethods= {"login"})
	public void testB()
	{
		System.out.println("Second Testcase");
	}
	@Test
	public void login() {
		System.out.println("this login functionality");
	}
	@Test
	public void logoff() {
		System.out.println("logout functionality");
	}
	


}
