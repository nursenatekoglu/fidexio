package com.fidexio.step_definitions;

import com.fidexio.pages.LoginPage;
import com.fidexio.utilities.BrowserUtils;
import com.fidexio.utilities.ConfigurationReader;
import com.fidexio.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.io.IOException;

public class Login_StepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Given("User is on the login page")
    public void userIsOnTheLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("environment"));
    }

    @And("User clicks login button")
    public void userClicksLoginButton() {
        loginPage.loginBtn.click();
    }


    @When("user inputs an email {string}")
    public void userInputsAnEmail(String arg0) throws IOException {
        loginPage.email.sendKeys(arg0);
    }


    @Then("user should see {string} is displayed")
    public void userShouldSeeIsDisplayed(String arg0) {
            Assert.assertTrue(loginPage.wrongLoginError.isDisplayed());
    }

    @Then("user should see {string} message is displayed")
    public void userShouldSeeTheRequiredMessage() {

        if (loginPage.email.getAttribute("required").equals("required")) {
            Assert.assertEquals("Please fill in this field.", loginPage.email.getAttribute("validationMessage"));
        }

        if (loginPage.password.getAttribute("required").equals("required")) {
            Assert.assertEquals("Please fill in this field.", loginPage.password.getAttribute("validationMessage"));
        }

    }

    @When("user inputs password {string}")
    public void userInputsPassword(String arg0) {
            loginPage.password.sendKeys(arg0);
    }


    @And("User inputs a password {string}")
    public void userInputsAPassword(String arg0) {
        loginPage.password.sendKeys(arg0);
    }


    @Then("user should see the password in bullet signs by default")
    public void userShouldSeeThePasswordInBulletSignsByDefault() {
        String type = loginPage.password.getAttribute("type");
        Assert.assertEquals(type, "password");
    }


    @And("User presses enter key")
    public void userPressesEnterKey() {
            loginPage.password.sendKeys(Keys.ENTER);
    }


    @Then("User should be on the homepage")
    public void userShouldBeOnTheHomepage() {
        BrowserUtils.waitForTitle("#Inbox - Odoo");
        BrowserUtils.titleAssertion("#Inbox - Odoo");
    }

    @And("user inputs a password {string}")
    public void userInputsAPassword1(String arg0) {
        loginPage.password.sendKeys(arg0);
    }

    @And("user clicks login button")
    public void userClicksLoginButton1() {
        loginPage.loginBtn.click();
    }

    @Then("user should be on the homepage")
    public void userShouldBeOnTheHomepage1() {
        BrowserUtils.waitForTitle("#Inbox - Odoo");
        BrowserUtils.titleAssertion("#Inbox - Odoo");
    }

    @When("User inputs an email {string}")
    public void userInputsAnEmail1(String arg0) {
        loginPage.email.sendKeys(arg0);
    }
}