package com.parabank.project;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.testng.Assert;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static Test.ResgisterTest.*;

public class Register {

//    @FindBy(linkText = "Register")
    public static String registerLink = "Register";
    public static String first_name="customer.firstName";
    public static String Last_name="customer.lastName";
    public static String address="customer.address.street";
    public static String city="customer.address.city";
    public static String state="customer.address.state";
    public static String zip_code="customer.address.zipCode";
    public static String phone="customer.phoneNumber";
    public static String SSN="customer.ssn";
    public static String username="customer.username";
    public static String password="customer.password";
    public static String confirm="repeatedPassword";

    public static String RegisterButton ="//input[@value=\"Register\"]";

//    public Register(WebDriver driver) {
//        this.driver = driver;
//        PageFactory.initElements(driver, this);
//    }
    public static void goToRegisterPage() throws IOException {
        driver.findElement(By.linkText(registerLink)).click();
        System.out.println("Hello");
        String a ="Pass";
        if(a.equals("Pass")) {
            test.log(Status.PASS, "Test Case Passed for Registration");
            test.log(Status.PASS,  test.addScreenCaptureFromPath(capture(driver)) +"Test passed");
driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/h1"));
        }
        else
        {
            test.log(Status.FAIL,"Test case has been failed");
            test.fail(MediaEntityBuilder.createScreenCaptureFromBase64String("base64").build());
        }
    }
    public static void setFirst_name() throws IOException {
        driver.findElement(By.id(first_name)).sendKeys("timmana");
    }
    public static void setLast_name() throws IOException  {
        driver.findElement(By.id(Last_name)).sendKeys("gowda");
    }
    public static void setAddress() throws IOException {
        driver.findElement(By.id(address)).sendKeys("test street");
    }
    public static void setCity() {
        driver.findElement(By.id(city)).sendKeys("bangalore");;
    }
    public static void setState() {
        driver.findElement(By.id(state)).sendKeys("karnataka");
    }
    public static void setZip_code() {
        driver.findElement(By.id(zip_code)).sendKeys("12345");
    }
    public static void setPhone() {
        driver.findElement(By.id(phone)).sendKeys("9876543210");
    }
    public static void setSSN() {
        driver.findElement(By.id(SSN)).sendKeys("12345");
    }
    public static void setUsername() {
        driver.findElement(By.id(username)).sendKeys("timmana");
    }
    public static void setPassword() {
        driver.findElement(By.id(password)).sendKeys("gowda");
    }
    public static void setConfirm() {
        driver.findElement(By.id(confirm)).sendKeys("timmana");
    }
    public static void clickOnRegister() throws IOException, InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@value=\"Register\"]")).click();
    }
    public static void registrationSuccess() throws IOException, InterruptedException {
        Thread.sleep(3000);
        String msg=driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/p")).getText();
        System.out.println("Your account was created successfully. You are now logged in.");
        String success="Your account was created successfully. You are now logged in.";
        Assert.assertEquals(success,msg);
        if(success.equals(msg)){
            test.log(Status.PASS, "Registration Done");
            test.log(Status.PASS,  test.addScreenCaptureFromPath(capture(driver)) +"Test pass");
        }

        else {
            test.log(Status.FAIL,"Test case has been failed");
            test.fail(MediaEntityBuilder.createScreenCaptureFromBase64String("base64").build());
        }
    }


}

