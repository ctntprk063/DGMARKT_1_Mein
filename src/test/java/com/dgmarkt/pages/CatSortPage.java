package com.dgmarkt.pages;

import com.dgmarkt.utilities.BrowserUtils;
import com.dgmarkt.utilities.ConfigurationReader;
import com.dgmarkt.utilities.Driver;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CatSortPage extends BasePage{

    @FindBy(xpath = "//span[text()='My Account']")
    public WebElement myAccount;

    @FindBy(xpath = "//a[text()='Login']")
    public WebElement loginIcon;

    @FindBy(css = "#input-email")
    public WebElement login2Email;

    @FindBy(css = "#input-password")
    public WebElement login2Password;

    @FindBy(xpath = "//span[text()='Login']")
    public WebElement loginButton;


    @FindBy(xpath = "//span[text()='Category']")
    public WebElement categori;

//    @FindBy(xpath = "//a[text()='Health & Beauty']")
//    public WebElement health;
//
//    @FindBy(xpath = "//a[text()='Televisions']")
//    public WebElement television;
//
//    @FindBy(xpath = "//a[text()='TV Accessories']")
//    public WebElement tvAcces;
//
//    @FindBy(xpath = "//a[text()='Networking")
//    public WebElement network;

    @FindBy(id = "input-sort")
    public WebElement selectSort;

//    @FindBy(xpath = "//option[text()='Default']")
//    public WebElement sortDefault;
//
//    @FindBy(xpath = "//option[text()='Name (A - Z)']")
//    public WebElement sortNameAZ;
//    @FindBy(xpath = "//option[text()='Name (Z - A)']")
//    public WebElement sortNameZA;
//    @FindBy(xpath = "//option[text()='Price (Low > High)']")
//    public WebElement sortPricelow;
//    @FindBy(xpath = "//option[text()='Price (High > Low)']")
//    public WebElement sortPriceHigh;
//    @FindBy(xpath = "//option[text()='Rating (Highest)']")
//    public WebElement sortRatingHigh;
//    @FindBy(xpath = "//option[text()='Rating (Lowest)']")
//    public WebElement sortRatingLow;
//    @FindBy(xpath = "//option[text()='Model (A - Z)']")
//    public WebElement sortModelAZ;
//    @FindBy(xpath = "//option[text()='Model (Z - A)']")
//    public WebElement sortModelZA;
//
//    @FindBy(xpath = "//h1[text()='Health & Beauty']")
//    public WebElement veriffyHealt;


    public void meinLogin(String userEmail, String password){
        myAccount.click();
        loginIcon.click();
        BrowserUtils.waitFor(1);
        login2Email.sendKeys(userEmail);
        BrowserUtils.waitFor(1);
        login2Password.sendKeys(password);
        loginButton.click();
    }

    public void categorySelection (String subCategory ){
        WebElement product = Driver.get().findElement(By.xpath("//a[text()='"+ subCategory+"']"));
        BrowserUtils.waitFor(1);
        BrowserUtils.hover(categori);
        BrowserUtils.waitFor(1);
        BrowserUtils.hover(product);
        product.click();
    }

    public void sortSelect(String sortName){
        selectSort.click();
        WebElement sort=Driver.get().findElement(By.xpath("//option[text()='"+sortName+"']"));
        Select menu = new Select(selectSort);
        menu.selectByVisibleText(sortName);
        sort.click();
        BrowserUtils.scrollToElement(selectSort);
        BrowserUtils.waitFor(2);
    }

    public void verifyMessage(String value){
        WebElement verify=Driver.get().findElement(By.xpath("//h1[text()='"+value+"']"));
        System.out.println("verify.getText() = " + verify.getText());


    }



}
