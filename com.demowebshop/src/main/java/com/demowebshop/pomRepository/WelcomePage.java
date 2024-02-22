package com.demowebshop.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage extends BasePage
{
public WelcomePage(WebDriver driver) 

{
 super(driver);
}
@FindBy(partialLinkText = "Log in")
 private WebElement loginlink;
public void clickLogin()
{
	loginlink.click();
}
@FindBy(linkText = "Register")
 private WebElement RegisterLink;
public void clickonRegisterLink()
{
	RegisterLink.click();
}
@FindBy(linkText = "Shopping cart")
WebElement ShoppingCartLink;
public void clickonshoppingcartlink()
{
	ShoppingCartLink.click();
}
@FindBy(partialLinkText = "BOOKS")
private WebElement headerBooksLink;
public void clickheaderBooksLink()
{
	headerBooksLink.click();
}
}
