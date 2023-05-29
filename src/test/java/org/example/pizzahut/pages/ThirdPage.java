package org.example.pizzahut.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.example.pizzahut.TestRunner;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ThirdPage {

    public ThirdPage(){
        PageFactory.initElements(new AppiumFieldDecorator(TestRunner.getDriver()), this);
    }

    @AndroidFindBy(id = "com.pizzahut.app:id/imgMenu")
    @iOSXCUITFindBy(xpath = "\t\n" +
            "//XCUIElementTypeApplication[@name=\"Pizza Hut\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeButton")
    protected WebElement sideBarButton;

    @AndroidFindBy(id = "com.pizzahut.app:id/profilePic")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Pizza Hut\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther")
    protected WebElement loginAvator;

    @AndroidFindBy(id = "com.pizzahut.app:id/txtAccountName")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Pizza Hut\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeTextField")
    protected WebElement loginAccountName;

    @AndroidFindBy(id = "com.pizzahut.app:id/txtPw")
    @iOSXCUITFindBy(xpath="//XCUIElementTypeApplication[@name=\"Pizza Hut\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeSecureTextField")
    protected WebElement loginPassword;

    @AndroidFindBy(id = "com.pizzahut.app:id/btnLogin")
    @iOSXCUITFindBy(accessibility= "general btn alert confirm en")
    protected WebElement loginConfirmButton;


    @AndroidFindBy(id = "com.pizzahut.app:id/btnAlertPositive")
    @iOSXCUITFindBy(accessibility = "general btn alert confirm en")
    protected WebElement loginAlertConfirmButton;



}
