package com.framework.testng.api.base;

import com.framework.selenium.api.base.SeleniumBase;
import com.framework.utils.DataLibrary;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import java.io.IOException;

public class ProjectSpecificMethods extends SeleniumBase {

	@DataProvider(name = "fetchData", indices = 0)
	public Object[][] fetchData() throws IOException {
		return DataLibrary.readExcelData(excelFileName);
	}
	
	@BeforeMethod
	public void preCondition() {
		startApp("edge", false, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		setNode();

	}
	
	@AfterMethod
	public void postCondition() {
		close();

	}

	

	
	  

	
	
}
