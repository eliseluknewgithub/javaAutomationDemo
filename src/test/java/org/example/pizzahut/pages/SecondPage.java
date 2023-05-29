package org.example.pizzahut.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.example.pizzahut.TestRunner;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SecondPage {

    public SecondPage(){
        PageFactory.initElements(new AppiumFieldDecorator(TestRunner.getDriver()), this);
    }

    @AndroidFindBy(id = "com.pizzahut.app:id/carWalkthough")
    @iOSXCUITFindBy(xpath = "\t\n" +
            "//XCUIElementTypeApplication[@name=\"Pizza Hut\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView")
    protected WebElement scrollablePage;
//
//    @AndroidFindBy(id = "com.pizzahut.app:id/btnStart")
//    @iOSXCUITFindBy(accessibility = "splash btn hk en")
//    protected WebElement startButton;


}
