package com.para1.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Demo {




        WebDriver driver;
        @FindBy(linkText = "Register")
        public static WebElement registerLink;
        @FindBy(id = "customer.firstName")
        public static WebElement first_name;
        @FindBy(id = "customer.lastName")
        public static WebElement Last_name;
        @FindBy(id = "customer.address.street")
        public static WebElement address;
        @FindBy(id = "customer.address.city")
        public static WebElement city;
        @FindBy(id = "customer.address.state")
        public static WebElement state;
        @FindBy(id = "customer.address.zipCode")
        public static WebElement zip_code;
        @FindBy(id = "customer.phoneNumber")
        public static WebElement phone;
        @FindBy(id = "customer.ssn")
        public static WebElement SSN;
        @FindBy(id = "customer.username")
        public static WebElement username;
        @FindBy(id = "customer.password")
        public static WebElement password;
        @FindBy(id = "repeatedPassword")
        public static WebElement confirm;

        public Demo(WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }
        public static void goToRegisterPage(){
//            Thread.sleep(3000);
            registerLink.click();
        }
        public static void setFirst_name() {
            first_name.sendKeys();
        }
        public static String setLast_name(String a) {
            Last_name.sendKeys();
            return a;
        }
        public static void setAddress() {
            address.sendKeys();
        }
        public static void setCity() {
            city.sendKeys();
        }
        public static void setState() {
            state.sendKeys();
        }
        public static void setZip_code() {
            zip_code.sendKeys();
        }
        public static void setPhone() {
            phone.sendKeys();
        }
        public static void setSSN() {
            SSN.sendKeys();
        }
        public static void setUsername() {
            username.sendKeys();
        }
        public static void setPassword() {
            password.sendKeys();
        }
        public static void setConfirm() {
            confirm.sendKeys();
        }

}
