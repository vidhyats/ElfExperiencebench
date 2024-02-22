package com.demowebshop.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends BasePage
{
public RegisterPage(WebDriver driver)
{
	super(driver);
}

@FindBy(id = "gender-female")
private WebElement femaleradiobutton;
public void ClickFemaleRadioButton()
{
	femaleradiobutton.click();
}
@FindBy(id = "gender-male")
private WebElement maleradiobutton;
public void ClickMaleRadioButton()
{
	maleradiobutton.click();
}
@FindBy(id = "FirstName")
WebElement FirstNameTextField;
public void EnterFirstName(String Firstname)
{
	FirstNameTextField.sendKeys(Firstname);
}
@FindBy(id = "LastName")
WebElement LastNameTextField;
public void EnterLastName(String LastName)
{
	LastNameTextField.sendKeys(LastName);
}
@FindBy(id = "Email")
WebElement EmailTextField;
public void EnterEmail(String email)
{
	EmailTextField.sendKeys(email);
}
@FindBy(id = "Password")
WebElement PasswordTextField;
public void EnterPassword(String password)
{
	PasswordTextField.sendKeys(password);
}
@FindBy(id = "ConfirmPassword") 
WebElement ConfirmPasswordTextField;
public void EnterConfirmpassword(String confirmpassword)
{
	ConfirmPasswordTextField.sendKeys(confirmpassword);
}
@FindBy(id = "register-button")
WebElement RegisterButton;
public void clickonRegisterbutton()
{
	RegisterButton.click();
}
}

