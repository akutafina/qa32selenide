package com.telran.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage extends BasePage{

    public static final By LOGIN_BTN_LOCATOR = By.id("login");
    public static final By PWD_LOCATOR = By.id("password");
    public static final By LOGIN_LOCATOR = By.id("user");
    public static final By ERROR_MSG_LOCATOR = By.id("message");

    public void enterCredentials(String email, String pwd) {
        $(LOGIN_LOCATOR).val(email);
        $(PWD_LOCATOR).val(pwd);
//        $("[placeholder='Username']").val(email);
//        $("[placeholder='Password']").val(pwd);
    }

    public void clickLoginBtn() {
        $(LOGIN_BTN_LOCATOR).click();
    }

    public void errorMsgAppears() {
        $(ERROR_MSG_LOCATOR).shouldBe(Condition.visible);
    }
}
