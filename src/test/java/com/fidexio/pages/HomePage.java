package com.fidexio.pages;


import com.fidexio.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(className = "oe_topbar_name")
    public WebElement usernameBtn;

    @FindBy(xpath = "//a[@data-menu='logout']")
    public WebElement logoutBtn;


}