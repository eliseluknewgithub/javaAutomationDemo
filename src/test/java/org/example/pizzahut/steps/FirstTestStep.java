package org.example.pizzahut.steps;

import io.cucumber.java.en.Given;
import org.example.pizzahut.pages.FirstPage;

public class FirstTestStep extends FirstPage {
    @Given("I allow notification")
    public void iAllowNotification() {

        //For IOS
        try{
            Thread.sleep(5000);
            allowAlert.click();
        }catch(Exception e){
            e.printStackTrace();

        }

    }

    @Given("I click HK button")
    public void iClickHKButton() {
        System.out.println("GIVEN I click HK button");

        System.out.println("status of HK button" + hkButton.isEnabled());

        hkButton.click();

    }
}
