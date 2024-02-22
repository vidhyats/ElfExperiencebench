package com.demowebshop.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BooksPage extends BasePage
{
public BooksPage(WebDriver driver) 
{
	super(driver);
}
@FindBy(linkText = "Books")
private WebElement Bookslink;
public void clickonBooksLink()
{
	Bookslink.click();
}
@FindBy(xpath = "//a[text()='Computing and Internet']/parent::h2/..//input")
private WebElement computingAndInternetAddtoCartButton;
public void clickoncomputingAndInternetAddtoCartButton()
{
	computingAndInternetAddtoCartButton.click();
}
@FindBy(xpath = "//span[text()='Shopping cart']")
 private WebElement shoppingcart;
public void clickonShoppingcartButton()
{
	shoppingcart.click();
}
}
