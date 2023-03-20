package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.Baseclass;

public class HomePage extends Baseclass{
	
	public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
       }
// Have To Collect All The  WebElement  Present in WebPage  Store it  a Seprate  Class And Make it the private
		/*
		 * @FindBy(xpath = "//button[text()='✕']") public WebElement SkipButton ;
		 */
	@FindBy(xpath = "//button[text()='✕']")
	public WebElement SkipButton;



}
