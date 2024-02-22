package com.demowebshop.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingcartPage extends BasePage
{
public ShoppingcartPage(WebDriver driver)
{
	super(driver);
}
@FindBy(xpath = "//table[@class='cart']/tbody/tr[1]/td[3]/a")
 private WebElement FirstRowProductName;
public WebElement getFirstRowProductName() {
	return FirstRowProductName;
}
public void setFirstRowProductName(WebElement firstRowProductName) {
	this.FirstRowProductName = firstRowProductName;
}


}
