package com.dgmarkt.pages;

import com.dgmarkt.utilities.ConfigurationReader;
import com.dgmarkt.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css = "[name='email']")
    public WebElement firstLoginEmail;

    @FindBy(css = "[name='password']")
    public WebElement firstLoginPassword;

    @FindBy(css = "[name='login']")
    public WebElement firstLoginBtn;

    @FindBy(xpath = "//a[text()='Close']")
    public WebElement cancelBtn;


    public void firstLogin (){
        firstLoginEmail.sendKeys(ConfigurationReader.get("firstLoginEmail"));
        firstLoginPassword.sendKeys(ConfigurationReader.get("firstLoginPassword"));
        firstLoginBtn.click();
        cancelBtn.click();
    }

}
