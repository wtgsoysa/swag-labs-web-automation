package TestNG;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class Swag_Labs_Test {

    /*---------------------------- GLOBAL VARIABLE SECTION ----------------------------------------*/
    String BaseURL = "https://www.saucedemo.com/";
    WebDriver driver;
    String actualText;
    String expectedText;

    // Before Test Section
    @BeforeTest
    public void BeforeTestMethod() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    /*---------------------------- TEST CASE SECTION ------------------------------------*/

    // Test Case : 001
    @Test(priority = 1)
    public void userAuthentification() throws InterruptedException, IOException {
        System.out.println("\n------------------------|| Swag_Labs_Test || -----------------------\n");
        System.out.println("----------------TC 001----------------");

        // Login to the Website
        userLogin();

        // Verify the correct page
        expectedText = "Products";
        actualText = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();

        if (expectedText.equals(actualText)) {
            System.out.println("Verify the page");
            System.out.println("Login Successful : Product Main Page Load");
            takeSnapShot(driver, "E:\\SQA\\Swag-Labs\\images\\verify the pages\\userauthentification\\LoginSuccess.png");
        } else {
            System.out.println("Verify the page");
            System.out.println("Login Failed : Product Main Page Error");
            takeSnapShot(driver, "E:\\SQA\\Swag-Labs\\images\\verify the pages\\userauthentification\\LoginFailed.png");
        }
    }

    /*---------------------------- SUPPORTIVE METHOD SECTION ----------------------------------------*/

    public void userLogin() throws InterruptedException {
        // Calling the SWAG-LABS URL
        driver.get(BaseURL);
        Thread.sleep(2000);

        // Identify the Username Text and Send Value
        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        // Identify the Password Text and Send Value
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        // Identify the Login Button and Click
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
        Thread.sleep(2000);
    }

    public void takeSnapShot(WebDriver webDriver, String fileWithPath) throws IOException {
        // Convert web driver object to TakeScreenShot
        TakesScreenshot srcShot = (TakesScreenshot) webDriver;

        // Call getScreenShots as method to create image file
        File SrcFile = srcShot.getScreenshotAs(OutputType.FILE);

        // Move image file to new destination
        File DestFile = new File(fileWithPath);

        // Copy file at destination
        FileUtils.copyFile(SrcFile, DestFile);
    }
}
