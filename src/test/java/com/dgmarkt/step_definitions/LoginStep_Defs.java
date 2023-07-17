package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.LoginPage;
import io.cucumber.java.en.Given;

public class LoginStep_Defs {
    LoginPage loginPage = new LoginPage();


    @Given("The user is on the first login page")
    public void theUserIsOnTheFirstLoginPage() {
        loginPage.firstLogin();
    }

}
