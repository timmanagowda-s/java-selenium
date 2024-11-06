package com.para1.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.parabank.project.Register;

import java.io.File;
import java.io.IOException;
import java.lang.module.ModuleDescriptor.Exports;
import java.util.concurrent.TimeUnit;



public class test {
    public static WebDriver driver;
    public static Exports report;
    public static ExtentTest test;
    public static ExtentReports extent = new ExtentReports();

    @BeforeSuite
    public static void setup(){
       webdriver driver = new EdgeDriver();
        driver.get("https://parabank.parasoft.com/parabank/index.html");
        ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
        extent.attachReporter(spark);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    public static String capture(WebDriver driver) throws IOException,IOException{
        File srcfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File dest = new File("src/..ExecSS/" + System.currentTimeMillis() + ".png");
        String errflpath = dest.getAbsolutePath();
        FileUtils.copyFile(srcfile,dest);
        return  errflpath;
    }

    @Test
    void RegisterTest() throws IOException, InterruptedException {
        test = extent.createTest("Validate Registration", "User able to Register");
        Register.goToRegisterPage();
        Register.setFirst_name();
        Register.setLast_name();
        Register.setAddress();
        Register.setCity();
        Register.setState();
        Register.setZip_code();
        Register.setPhone();
        Register.setSSN();
        Register.setUsername();
        Register.setPassword();
        Register.setConfirm();
        Register.clickOnRegister();
        Register.registrationSuccess();
        extent.flush();
    }
    @Test(priority = 1)
    void Login() throws InterruptedException, IOException {
        test = extent.createTest("Validate Login", "User able to Login");
        com.parabank.project.Login.username();
        Login.password();
        Login.clickOnLogin();

    }
   
   
   
     @Test(priority = 2)
    void clickOnLogout() throws InterruptedException {
        test = extent.createTest("Validate LogOut", "User able to LogOut");
        Logout.clickOnLogout();
        extent.flush();
    }

  @AfterSuite
    public void cleanup()
    {
        extent.flush();
        driver.quit();
    }

}
