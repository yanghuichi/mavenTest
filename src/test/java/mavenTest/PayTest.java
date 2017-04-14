package mavenTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PayTest {

	private Pay pay;

	@Before
	public void init() {
		pay = new Pay();
	}

	@Test
	public void testPay() {
		int total = pay.getPayAmount(10, 9);
		Assert.assertEquals(90, total);
	}
	
	@Test
	public void testPay2() {
		int total = pay.getPayAmount(10, 8);
		Assert.assertEquals(80, total);
	}
	
	
}
