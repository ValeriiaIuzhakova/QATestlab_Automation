package myprojects.automation.assignment2.tests;

import myprojects.automation.assignment2.BaseScript;
import myprojects.automation.assignment2.utils.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class CheckMainMenuTest extends BaseScript{

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

        WebElement searchDashboard = driver.findElement(By.cssSelector("#tab-AdminDashboard"));
        searchDashboard.click();
        System.out.println("Page title is " + driver.getTitle());

        WebElement searchOrders = driver.findElement(By.cssSelector("#subtab-AdminParentOrders"));
        searchOrders.click();
        System.out.println("Page title is "+ driver.getTitle());

        WebElement searchCatalog = driver.findElement(By.linkText("Каталог"));
        searchCatalog.click();
        System.out.println("Page title is "+ driver.getTitle());

        WebElement searchCustomer = driver.findElement(By.linkText("Клиенты"));
        searchCustomer.click();
        System.out.println("Page title is "+ driver.getTitle());

        WebElement searchSupport = driver.findElement(By.cssSelector("#subtab-AdminParentCustomerThreads"));
        searchSupport.click();
        System.out.println("Page title is "+ driver.getTitle());

        WebElement searchStats = driver.findElement(By.cssSelector("#subtab-AdminStats"));
        searchStats.click();
        System.out.println("Page title is "+ driver.getTitle());

        //WebElement searchModules = driver.findElement(By.cssSelector("#subtab-AdminParentModulesSf"));
        WebElement searchModules = driver.findElement(By.linkText("Modules"));
        searchModules.click();
        System.out.println("Page title is "+ driver.getTitle());

        //WebElement searchDesign = driver.findElement(By.cssSelector("#subtab-AdminParentThemes"));
        WebElement searchDesign = driver.findElement(By.linkText("Design"));
        searchDesign.click();
        System.out.println("Page title is "+ driver.getTitle());

        WebElement searchShipping = driver.findElement(By.cssSelector("#subtab-AdminParentShipping"));
        searchShipping.click();
        System.out.println("Page title is "+ driver.getTitle());

        WebElement searchPayment = driver.findElement(By.cssSelector("#subtab-AdminParentPayment"));
        searchPayment.click();
        System.out.println("Page title is "+ driver.getTitle());

        WebElement searchInternational = driver.findElement(By.cssSelector("#subtab-AdminInternational"));
        searchInternational.click();
        System.out.println("Page title is "+ driver.getTitle());

        WebElement searchShopParameters = driver.findElement(By.cssSelector("#subtab-ShopParameters"));
        searchShopParameters.click();
        System.out.println("Page title is "+ driver.getTitle());

        WebElement searchConfiguration = driver.findElement(By.cssSelector("#subtab-AdminAdvancedParameters"));
        searchConfiguration.click();
        System.out.println("Page title is "+ driver.getTitle());


        String expectedTitle = driver.getTitle();
        driver.navigate().refresh();
        Assert.assertEquals(driver.getTitle(), expectedTitle);

        driver.close();
    }
}
