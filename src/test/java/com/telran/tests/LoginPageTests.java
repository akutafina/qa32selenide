package com.telran.tests;

import com.telran.pages.LoginPage;
import com.telran.utils.PropertiesLoader;
import org.junit.Before;
import org.junit.Test;
import static com.codeborne.selenide.Selenide.screenshot;

public class LoginPageTests {
    LoginPage loginPage;

    private String invalidEmail = PropertiesLoader.loadProperty("invalid.email");
    private String invalidPwd = PropertiesLoader.loadProperty("invalid.password");

    @Before
    public void setUp(){
        loginPage = new LoginPage();
    }

    @Test
    public void negativeLoginTest(){
        loginPage.enterCredentials(invalidEmail,invalidPwd);
        loginPage.clickLoginBtn();
        loginPage.errorMsgAppears();
        screenshot("my_screenshot");
    }

}
