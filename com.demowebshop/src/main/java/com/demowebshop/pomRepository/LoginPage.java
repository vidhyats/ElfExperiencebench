package com.demowebshop.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage
{
public LoginPage(WebDriver driver) 
{
	super(driver);
}
@FindBy(id="Email")
WebElement emailTextField;
public void enterEmail(String email)
{
	emailTextField.sendKeys(email);
}
@FindBy(id="Password")
WebElement passwordTextField;
public void enterPassword(String password)
{
	passwordTextField.sendKeys(password);
}
@FindBy(xpath = "//input[@value='Log in']")
WebElement LoginButton;


public void ClickonLoginButton()
{
	LoginButton.click();
}	

}
