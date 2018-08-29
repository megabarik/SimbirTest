package com.Simbir;

import org.junit.Assert;
import org.junit.Test;
import pages.EmailPage;
import pages.StartPage;
import pages.WriteEmailWidget;

import static com.codeborne.selenide.Selenide.$;

public class StartingTests extends StartPage {

    private final String lastName = "Борисов";
    private final String receiver = "ilya.filinin@simbirsoft.com";
    int count;


    @Test
    public void countEmails() {

        EmailPage.search("Филинин Илья");

        count = EmailPage.takeCountEmails();
        System.out.println(count);

        if (count == 0) {
            Assert.assertTrue(false);
        } else {
            Assert.assertTrue(true);
        }

        EmailPage.createEmail();

        WriteEmailWidget.writeEmail(count, lastName, receiver);
    }






    

    }




