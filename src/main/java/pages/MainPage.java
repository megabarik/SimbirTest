package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * Created by Smit on 28.10.2017.
 */
public class MainPage {
    private WebDriver webDriver;
//public WebDriverWait wait;


    public MainPage(WebDriver driver){
        webDriver = driver;
//        wait = new WebDriverWait(webDriver, 30);
        PageFactory.initElements(webDriver, this);
    }




//    @FindBy(css = "#identifierId")
//    WebElement login;


//    public void setLogin(){
//        login.sendKeys(loginText);
//    }

    public void clickLogin(){
        webDriver.findElement(By.cssSelector("#identifierId")).sendKeys("testsimbirsoft2");
    }


}