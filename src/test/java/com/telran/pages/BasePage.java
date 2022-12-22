package com.telran.pages;

import com.telran.utils.PropertiesLoader;

import static com.codeborne.selenide.Selenide.open;

public class BasePage {
    private final String URL = PropertiesLoader.loadProperty("url");

    public BasePage(){
        open(URL);
    }
}
