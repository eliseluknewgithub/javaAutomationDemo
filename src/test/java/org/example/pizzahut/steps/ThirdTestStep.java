package org.example.pizzahut.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.example.pizzahut.TestRunner;
import org.example.pizzahut.pages.ThirdPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class ThirdTestStep extends ThirdPage {
    WebDriverWait wait = new WebDriverWait(TestRunner.getDriver(), 4);
    @Given("Open Side Menu")
    public void openSideMenu() {
        try{
            sideBarButton.click();
        }catch(Exception e){
            System.out.println("Side Bar Button not displayed");
        }
    }

    @When("I click the Avatar to open Login page")
    public void iClickTheAvatarToOpenLoginPage() {
        try{
            loginAvator.click();
        }catch(Exception e){
            System.out.println("Login Avator not displayed");
        }
    }

    @And("I submit the following credentials to login")
    public void iSubmitTheFollowingCredentialsToLogin(DataTable dataTable) {

        List<List<String>> dataList = dataTable.asLists(String.class);

        System.out.println("DataList: " + dataList);
        //DataList: [[John, testerJohn], [Mary, maryann], [98475521, E123456]]

        for (List<String> row : dataList) {

            if(loginAccountName == null){
                loginAccountName.sendKeys(row.get(0));
            }else{
                loginAccountName.clear();
                loginAccountName.sendKeys(row.get(0));
            }

            if(loginPassword == null){
                loginPassword.sendKeys(row.get(1));
            }else{
                loginPassword.clear();
                loginPassword.sendKeys(row.get(1));
            }

            loginConfirmButton.click();

            try{
                loginAlertConfirmButton.click();
            }catch(Exception e){
                System.out.println("Login successful");
            }

        }

        // LinkedHashMap Method

//        LinkedHashMap<String, String> credentials = getCredentials();
//        System.out.println("credentials" + credentials);
//        //credentials{JongHo=testPassWord, 97009381=Kan123456}
//
//        System.out.println("credentials Key Set" + credentials.keySet());
//        //credentials Key Set[JongHo, 97009381]
//
//        ArrayList<String> keyList = new ArrayList<String>(credentials.keySet());
//
//        System.out.println("Key List" + keyList);
//        //Key List[JongHo, 97009381]
//
//        for(String username: keyList){
//
//            try{
//                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.pizzahut.app:id/txtAccountName"))).clear();
//                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.pizzahut.app:id/txtAccountName"))).sendKeys(username);
//                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.pizzahut.app:id/txtPw"))).clear();
//                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.pizzahut.app:id/txtPw"))).sendKeys(credentials.get(username));
//
//                wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.pizzahut.app:id/btnLogin"))).click();
//
//                try{
//                    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.pizzahut.app:id/btnAlertPositive"))).click();
//                }catch(Exception e){
//                    System.out.println("Login");
//                }
//
//
//            }catch(Exception e){
//
//            }
//        }



    }

//    public LinkedHashMap<String, String> getCredentials(){
//        LinkedHashMap<String, String> credentials = new LinkedHashMap<>();
//        credentials.put("JongHo", "testPassWord");
//        credentials.put("97009381", "Kan123456");
//        return credentials;
//    }
}
