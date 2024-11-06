package com_parabank_project1;

import org.openqa.selenium.By;

import static Test.ResgisterTest.driver;

public class UpdateProfile {

    public static void UpdateDetails() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[text()=\"Update Contact Info\"]")).click();
    }

    public static void changeDetails(){
        driver.findElement(By.id("customer.address.city")).clear();
        driver.findElement(By.id("customer.address.city")).sendKeys("Kolkata");
    }
}
