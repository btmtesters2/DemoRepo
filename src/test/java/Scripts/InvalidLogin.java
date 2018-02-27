package Scripts;

import org.testng.annotations.Test;

import POMPage.LoginPage;

public class InvalidLogin extends BaseTest {
	
	@Test
	public void testInValidLogin() {
		
		LoginPage l = new LoginPage(driver);
		l.setUserName("Avinash");
		l.setPassword("Chakraverthi");
		l.clickLoginButton();
		l.verifyErrmsg();
		
	}

}
