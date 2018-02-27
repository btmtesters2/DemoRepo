package Scripts;

import org.testng.annotations.Test;

import POMPage.EnterTimeTrackPage;
import POMPage.LoginPage;

public class ValidLoginLogout extends BaseTest {
	
	@Test 
	public void testValidLoginLogout(){
		LoginPage l = new LoginPage(driver);
		l.setUserName("admin");
		l.setPassword("manager");
		l.clickLoginButton();
		
		EnterTimeTrackPage e = new EnterTimeTrackPage(driver);
		e.clickLogoutLink();
	}
	

}
