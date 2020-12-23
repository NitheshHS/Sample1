package sample;

import org.testng.annotations.Test;

public class Testcase1 {
	@Test(groups = "smokeTest")
	public void tc1() {
		System.out.println("smokeTest");
	}

}
