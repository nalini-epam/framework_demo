package orangehrm.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{
	
	public LoginPage enterUsername(String data) {
		clearAndType(locateElement(Locators.NAME, "username"), data);
		reportStep(data+" entered successfully","pass");
		return this;
	}
	
	public LoginPage enterPassword(String data) {
		clearAndType(locateElement(Locators.NAME, "password"), data);
		reportStep(data+" entered successfully","pass");
		return this;
	}
	
	public HomePage clickLogin() {
		click(locateElement(Locators.XPATH, "//button[@type='submit']"));
		reportStep("Login button clicked successfully", "pass");
		return new HomePage();
	}

}
