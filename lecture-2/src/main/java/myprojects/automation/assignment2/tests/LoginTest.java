package myprojects.automation.assignment2.tests;

import myprojects.automation.assignment2.BaseScript;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import myprojects.automation.assignment2.utils.Properties;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseScript {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = getDriver();
        driver.navigate().to(Properties.getBaseAdminUrl());

        WebElement searchInputLogin = driver.findElement(By.id("email"));
        searchInputLogin.sendKeys("webinar.test@gmail.com");

        WebElement searchInputPassword = driver.findElement(By.id("passwd"));
        searchInputPassword.sendKeys("Xcg7299bnSmMuRLp9ITw");

        WebElement searchButton = driver.findElement(By.name("submitLogin"));
        searchButton.click();

        Thread.sleep(5000);

        WebElement searchIcon = driver.findElement(By.cssSelector("a.employee_name.dropdown-toggle"));
        searchIcon.click();

        Thread.sleep(2000);

        WebElement searchItem = driver.findElement(By.cssSelector("a#header_logout"));
        searchItem.click();

       driver.close();
    }
}
