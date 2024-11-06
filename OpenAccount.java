package com_parabank_project1;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.io.IOException;

import static Test.ResgisterTest.*;

public class OpenAccount {

    public static String Button="Open New Account";

    public static void updateContactInfo() throws IOException, InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[text()=\"Open New Account\"]")).click();
    }
    public static void setAccountType() throws IOException, InterruptedException {
        Select objSelect =new Select(driver.findElement(By.xpath("//select[@id=\"type\"]")));
        objSelect.selectByVisibleText("SAVINGS");
        System.out.println("SAVINGS is selected");
        String balance="SAVINGS";
        String s= driver.findElement(By.xpath("//select[@id=\"type\"]")).getText();
        Assert.assertEquals(balance,s);

        if(balance.equals(s)){
            test.log(Status.PASS, "Open New Account");
            test.log(Status.PASS,  test.addScreenCaptureFromPath(capture(driver)) +"New Account details filled");
        }

        else {
            test.log(Status.FAIL,"Test case has been failed");
            test.fail(MediaEntityBuilder.createScreenCaptureFromBase64String("base64").build());
        }
    }

    public static void clickOpen()throws IOException, InterruptedException  {
        driver.findElement(By.linkText(Button));
    }


}
