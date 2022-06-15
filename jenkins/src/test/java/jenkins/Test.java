package jenkins;

import org.testng.Reporter;

public class Test
{
	@org.testng.annotations.Test
	public void first()
	{
		Reporter.log("hello java", true);
		
	}

}
