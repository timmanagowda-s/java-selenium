package com_parabank_project1;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.io.IOException;

import static Test.ResgisterTest.*;
import static org.apache.poi.sl.usermodel.PresetColor.Info;

public class AccountOverview {

    public static void ViewAccount() throws InterruptedException, IOException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[text()=\"Accounts Overview\"]")).click();
       String s1 ="Accounts Overview";
       String Info= driver.findElement(By.xpath("//a[text()=\"showOverview\"]")).getText();
        Assert.assertEquals(s1,Info);
        if(s1.equals(Info)){
            test.log(Status.PASS, "Account Viewed");
            test.log(Status.PASS,  test.addScreenCaptureFromPath(capture(driver)) +"Account Viewed");
        }

        else {
            test.log(Status.FAIL,"Test case has been failed");
            test.fail(MediaEntityBuilder.createScreenCaptureFromBase64String("base64").build());
        }
    }

}
