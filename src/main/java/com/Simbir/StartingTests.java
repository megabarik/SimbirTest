package com.Simbir;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.MainPage;

import java.util.concurrent.TimeUnit;

public class StartingTests {
    WebDriver webDriver;


    @BeforeMethod
    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(webDriver, 30, 500);
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.get("http://www.gmail.com/");

//        webDriver.findElement(By.cssSelector("#identifierId")).sendKeys("testsimbirsoft2");

    }
    MainPage mainPage = new MainPage(webDriver);
    @Test
    public void mainSteps(){
        mainPage.clickLogin();
//        mainPage.setLogin();
//        mainPage.clickNextButton();
//        mainPage.enterPassword();
//        mainPage.clickNextButton();
//        mainMail.enterSearch();
//        mainMail.enterButton();
//        mainMail.enterButton();

//
    }




//    @Test
//    public void CheckItemsUnderResources(){
//        Assert.assertTrue(webDriver.findElements(By.cssSelector("#homepage-links > ul > li")).size() == 9);
//
//    }
}
