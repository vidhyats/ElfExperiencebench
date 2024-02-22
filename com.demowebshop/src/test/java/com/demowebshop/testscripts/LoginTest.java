package com.demowebshop.testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.demowebshop.genericlibrary.Base_Test;
import com.demowebshop.genericlibrary.ExcelRead;
import com.demowebshop.pomRepository.BooksPage;
import com.demowebshop.pomRepository.HomePage;
import com.demowebshop.pomRepository.LoginPage;
import com.demowebshop.pomRepository.RegisterPage;
import com.demowebshop.pomRepository.ShoppingcartPage;
import com.demowebshop.pomRepository.WelcomePage;

public class LoginTest extends Base_Test
{
@Test(dataProvider = "loginData")
public void TC_Login_001(String email,String password) throws InterruptedException
{
	
    WelcomePage welcomepage=new WelcomePage(driver);
    welcomepage.clickLogin();
    LoginPage loginpage=new LoginPage(driver);
    loginpage.enterEmail(email);
    loginpage.enterPassword(password);
    loginpage.ClickonLoginButton();
    HomePage homepage=new HomePage(driver);
    try
    {
    	softAssert.assertTrue(homepage.getLogoutLink().isDisplayed());
    }
    catch(Exception e)
    {
    	e.printStackTrace();
    	Reporter.log("User not logged in");;
    }
}
@DataProvider(name="loginData")
public String[][] loginDataProvider() throws EncryptedDocumentException, IOException
{
   return ExcelRead.multipleRead("Login");
}
}




