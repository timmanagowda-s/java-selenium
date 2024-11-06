package com.parabank.project;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.io.IOException;

import static Test.ResgisterTest.*;

public class Login {

    public static String Button="Log In";

    public static void username() throws IOException, InterruptedException {
        Thread.sleep(1000);
        EdgeDriver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("test");
    }
    public static void password() throws IOException, InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("user");
    }
    public static void clickOnLogin() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@value=\"Log In\"]")).click();
    }







}
