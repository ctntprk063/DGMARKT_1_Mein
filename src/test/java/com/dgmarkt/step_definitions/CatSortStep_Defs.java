package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.CatSortPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class CatSortStep_Defs {
    CatSortPage catSortPage = new CatSortPage();


    @And("the user should be hover over  category Health and Beauty")
    public void theUserShouldBeHoverOverCategoryHealthAndBeauty() {
        catSortPage.categorySelection("Health & Beauty");
    }


    @And("The user sorts Health and Beauty products by Sortname {string}")
    public void theUserSortsHealthAndBeautyProductsBySortname(String value) {
        catSortPage.sortSelect(value);
    }

    @Then("The user enters the personal username{string}and password {string}")
    public void theUserEntersThePersonalUsernameAndPassword(String email, String password) {
        catSortPage.meinLogin(email, password);
    }

    @And("the user should be hover over  category Television")
    public void theUserShouldBeHoverOverCategoryTelevision() {
        catSortPage.categorySelection("Televisions");

    }

    @And("The user sorts Televisions products by Sortname {string}")
    public void theUserSortsTelevisionsProductsBySortname(String value) {
        catSortPage.sortSelect(value);
    }

    @And("the user should be hover over  category TV Accessories")
    public void theUserShouldBeHoverOverCategoryTVAccessories() {
        catSortPage.categorySelection("TV Accessories");
    }

    @And("the user should be hover over  category Networking")
    public void theUserShouldBeHoverOverCategoryNetworking() {
        catSortPage.categorySelection("Networking");
    }

    @And("The user sorts TV Accessories products by Sortname {string}")
    public void theUserSortsTVAccessoriesProductsBySortname(String value) {
        catSortPage.sortSelect(value);
    }

    @And("The user sorts Networking products by Sortname {string}")
    public void theUserSortsNetworkingProductsBySortname(String value) {
        catSortPage.sortSelect(value);
    }

    @Then("verify {string}  message should be displayed")
    public void verifyMessageShouldBeDisplayed(String name) {
        catSortPage.verifyMessage(name);
    }


}