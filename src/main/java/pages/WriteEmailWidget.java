package pages;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.commands.PressEnter;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class WriteEmailWidget {

    public static void writeEmail(int count, String lastName, String receiver) {
        $(By.xpath("//textarea[@aria-label='Кому']")).setValue(receiver); //Write to field who wants receive email
        $(By.xpath("//input[@name='subjectbox']")).setValue("Тестовое задание.  " + lastName); // Write Theme
        $("div[aria-label='Тело письма']").click(); // Click body email
        $("div[aria-label='Тело письма']").setValue("Писем от Ильи Филинина: " + count); // Fill body email

    }

    public static void sendEmail(){
        $(By.xpath("//*/tr[2]/td/div/div/div[4]/table/tbody/tr/td[1]/div/div[2]")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
