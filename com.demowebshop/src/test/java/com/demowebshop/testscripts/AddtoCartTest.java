package com.demowebshop.testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.demowebshop.genericlibrary.Base_Test;
import com.demowebshop.genericlibrary.ExcelRead;
import com.demowebshop.pomRepository.BooksPage;
import com.demowebshop.pomRepository.HomePage;
import com.demowebshop.pomRepository.LoginPage;
import com.demowebshop.pomRepository.ShoppingcartPage;
import com.demowebshop.pomRepository.WelcomePage;

public class AddtoCartTest extends Base_Test
{
@Test(dataProvider = "addToCart")
public void TC_ShoppingCart_001(String email,String password)
{
	WelcomePage welcomepage=new WelcomePage(driver);
	welcomepage.clickLogin();
	test.log(Status.INFO, "Login page is displayed");
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterEmail(email);
	loginpage.enterPassword(password);
	loginpage.ClickonLoginButton();
	HomePage homepage=new HomePage(driver);
	try 
	{
	softAssert.assertTrue(homepage.getLogoutLink().isDisplayed());
	if(homepage.getLogoutLink().isDisplayed())
	{
		test.log(Status.PASS, "User is successfully logged in");
		welcomepage.clickheaderBooksLink();
		BooksPage bookspage=new BooksPage(driver);
		bookspage.clickoncomputingAndInternetAddtoCartButton();
		bookspage.clickonShoppingcartButton();
		ShoppingcartPage shoppingcartpage=new ShoppingcartPage(driver);
		softAssert.assertTrue(shoppingcartpage.getFirstRowProductName().getText().contains("Computing and Internet"));
	}
    }
	catch (Exception e)
	{
		e.printStackTrace();
		test.log(Status.FAIL,"User is not logged in and product is not added to cart" );
		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(takescreenshotofpage(driver)).build());
		Reporter.log("User not logged in");
		
	}
}
@DataProvider(name="addToCart")
public String[][] addToCartDataProvider() throws EncryptedDocumentException, IOException
{
	return ExcelRead.multipleRead("AddToCart");
}

}