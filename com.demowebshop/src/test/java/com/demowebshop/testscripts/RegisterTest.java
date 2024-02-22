package com.demowebshop.testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.demowebshop.genericlibrary.Base_Test;
import com.demowebshop.genericlibrary.ExcelRead;
import com.demowebshop.pomRepository.HomePage;
import com.demowebshop.pomRepository.RegisterPage;
import com.demowebshop.pomRepository.WelcomePage;

public class RegisterTest extends Base_Test
{
	@Test(dataProvider = "registerData")
public void TC_001(String gender,String firstname,String lastname,String email,String password,String confirmpassword) throws InterruptedException
{   WelcomePage welcomepage=new WelcomePage(driver);
    welcomepage.clickonRegisterLink();
	RegisterPage registerpage=new RegisterPage(driver);
	if(gender.equalsIgnoreCase("M"))
	{
		registerpage.ClickMaleRadioButton();
	}
	else if(gender.equalsIgnoreCase("F"))
	{
		registerpage.ClickFemaleRadioButton();
	}
	else
	{
		Reporter.log("Gender is not valid",true);
	}
	
	registerpage.EnterFirstName(firstname);
	registerpage.EnterLastName(lastname);
	registerpage.EnterEmail(email);
	registerpage.EnterPassword(password);
	registerpage.EnterConfirmpassword(confirmpassword);
	registerpage.clickonRegisterbutton();
	HomePage homepage=new HomePage(driver);
	try {
	softAssert.assertTrue(homepage.getLogoutLink().isDisplayed());
	}
	catch (Exception e) {
		e.printStackTrace();
	}
}
@DataProvider(name="registerData")
public String[][] registerDataProvider() throws EncryptedDocumentException, IOException
{
	return ExcelRead.multipleRead("Register");
}
}