package org.example.pizzahut.pages;

import org.example.pizzahut.TestRunner;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


public class FirstPage {

    public FirstPage(){
        PageFactory.initElements(new AppiumFieldDecorator(TestRunner.getDriver()), this);
    }


      // For IOS
//    @iOSXCUITFindBy(accessibility = "Allow")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Allow\"]")
    protected WebElement allowAlert;


    @AndroidFindBy(id = "com.pizzahut.app:id/hk_btn")
    @iOSXCUITFindBy(accessibility = "splash btn hk en")
    protected WebElement hkButton;




}
