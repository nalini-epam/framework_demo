package orangehrm.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{
	
	public HomePage verifyHomePage() {
		verifyDisplayed(locateElement(Locators.XPATH, "(//*[text()='Dashboard'])[2]"));
		reportStep("Homepage is loaded", "pass");
		return this;
	}

	
}
