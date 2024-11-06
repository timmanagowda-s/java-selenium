package com.parabank.project;
import org.openqa.selenium.By;

import static Test.ResgisterTest.driver;
public class Logout {

    public static void clickOnLogout() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[text()=\"Log Out\"]")).click();
    }
}
