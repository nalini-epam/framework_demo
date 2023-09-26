package orangehrm.testcases;

import com.framework.testng.api.base.ProjectSpecificMethods;
import orangehrm.pages.LoginPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC001_VerifyLoginHRM extends ProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "VerifyLogin";
		testDescription ="Verify Login functionality with positive data";
		authors="Nalini";
		category ="Smoke";
		excelFileName="Login_Details";
	}
	
	@Test(dataProvider = "fetchData")
	public void runLogin(String username, String password) {
		new LoginPage()
		.enterUsername(username)
		.enterPassword(password)
		.clickLogin().verifyHomePage();


	}

}
