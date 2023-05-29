package org.example.pizzahut.steps;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pizzahut.TestRunner;
import org.example.pizzahut.pages.SecondPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static java.time.Duration.ofMillis;

public class SecondTestStep extends SecondPage {

    WebElement startButton;

    @Given("I am on the scrollable page")
    public void iAmOnTheScrollablePage() throws InterruptedException {
        System.out.println("I am on the scrollable page");
        Thread.sleep(80000);
    }

    @Then("I scroll the view from right to left")
    public void iScrollTheViewFromRightToLeft() {

        // TestRunner.getDriver().manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        // WebDriverWait wait = new WebDriverWait(TestRunner.getDriver(), 4);
        //  WebElement parent = wait.until(ExpectedConditions.presenceOfElementLocated(locatorOfStoreTable));

        // By locator = By.xpath("//*[@text='San Po Kong']");
        // By locator = By.xpath("//XCUIElementTypeStaticText[@name=\"" + arg0 + "\"])[1]");
        // tempElement = TestRunner.getDriver().findElement(locator);
        // storeName = tempElement.findElement(By.xpath("(//XCUIElementTypeStaticText[@name=\"San Po Kong\"])[1]")).getText();

        try{
//            TestRunner.getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//            By locator = By.id("com.pizzahut.app:id/btnStart");
            System.out.println("Try First");

            while(true){
                try{
                      System.out.println("Try Second");
                      WebDriverWait wait = new WebDriverWait(TestRunner.getDriver(), 4);
                      //For IOS:
//                      WebElement targetPage = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("\t\n" + "//XCUIElementTypeApplication[@name=\"Pizza Hut\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView")));
                      //For AOS:
                      WebElement targetPage = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.pizzahut.app:id/carWalkthough")));
                      System.out.println("targetPage: " + targetPage);
                      if(targetPage.isDisplayed()){
                         System.out.println("targetPage is displayed");
                      }
                      //For IOS
//                        By locator = By.xpath("//XCUIElementTypeButton[@name=\"walk btn start en\"]");
                      //For AOS
                      By locator = By.id("com.pizzahut.app:id/btnStart");
                      startButton = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
//                      WebElement startButton = TestRunner.getDriver().findElement(locator);
                      if(startButton.isEnabled()){
                        System.out.println("StartButton is enabled");
                      }
                      break;

                }catch(Exception e){
                    System.out.println("Scroll Now");
                    Point locationx = new Point(0,0);
                    Dimension size = scrollablePage.getSize();
                    int startY = locationx.y + (size.getWidth() / 2);
                    int endY = startY;
                    double startX = locationx.x + (size.getHeight() * 0.8);
                    double endX = locationx.x + (size.getHeight() * 0.1);

                    TouchAction touchAction = new TouchAction(TestRunner.getDriver())
                            .press(PointOption.point((int) startX, (int) startY))
                            .waitAction(waitOptions(ofMillis(1000)))
                            .moveTo(PointOption.point((int) endX, (int) endY))
                            .release()
                            .perform();


                }

            }

        }catch(Exception e){
//            e.printStackTrace();
            System.out.println("Try First Fail");

        }


    }

    @Then("I click Start button")
    public void iClickStartButton() {
        startButton.click();
    }
}
