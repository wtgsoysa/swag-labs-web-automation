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
import java.sql.SQLOutput;

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
        System.out.println("----------------TC 001----------------\n");
        System.out.println("USER AUTHENTICATION TEST CASE \n");

        // Login to the Website
        userLogin();

        // Verify the correct page
        expectedText = "Products";
        actualText = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();

        if (expectedText.equals(actualText)) {
            System.out.println("Verify the page : ");
            System.out.println("Verification passed: The product page load successfully");
            takeSnapShot(driver, "E:\\SQA\\Swag-Labs\\images\\verify the pages\\userauthentification\\LoginSuccess.png");
        } else {
            System.out.println("Verify the page");
            System.out.println("Verification failed: The product page load unsuccessfully");
            takeSnapShot(driver, "E:\\SQA\\Swag-Labs\\images\\verify the pages\\userauthentification\\LoginFailed.png");
        }
    }

    // Test Case 002:
    @Test(priority = 2)
    public void productDetails() throws InterruptedException, IOException {
        System.out.println("\n----------------TC 002----------------\n");
        System.out.println("PRODUCT DETAILS TEST CASE \n");

        //------------------------------ Product 1: Sauce Labs Backpack-------------------------------

        System.out.println("Verify the Sauce Labs Backpack product_01 details :");

        String expectedText_product01_Heading = "Sauce Labs Backpack";

        // Verifying if the correct element is selected
        String actualText_product01_Heading = driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).getText();


        if (expectedText_product01_Heading.equals(actualText_product01_Heading)) {
            System.out.println("Verification passed: The product_01 heading matches expected text.");
        } else {
            System.out.println("Verification failed: The product_01 heading does not match expected text.");
        }

        //Verifying description is correct
        String expectedText_product01_Description = "carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.";

        String actualText_product01_Description = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[1]/div")).getText();

        if (expectedText_product01_Description.equals(actualText_product01_Description)) {
            System.out.println("Verification passed: The product_01 description matches expected text.");
        }
        else{
            System.out.println("Verification failed: The product_01 description does not match expected text.");
        }

        //Verifying the product price
        String expectedText_product01_Price = "$29.99";

        String actualText_product01_Price = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[2]/div")).getText();

        if (expectedText_product01_Price.equals(actualText_product01_Price)) {
            System.out.println("Verification passed: The product_01 price matches expected text.");
        }
        else{
            System.out.println("Verification failed: The product_01 price does not match expected text.");
        }



        //------------------------------ Product 2: Sauce Labs Bike Light -------------------------------

        System.out.println("\n\nVerify the Sauce Labs Bike Light product_02 details :");

        String expectedText_product02_Heading = "Sauce Labs Bike Light";

        // Verifying if the correct element is selected
        String actualText_product02_Heading = driver.findElement(By.xpath("//*[@id=\"item_0_title_link\"]/div")).getText();


        if (expectedText_product02_Heading.equals(actualText_product02_Heading)) {
            System.out.println("Verification passed: The product_02 heading matches expected text.");
        } else {
            System.out.println("Verification failed: The product_02 heading does not match expected text.");
        }

        //Verifying description is correct
        String expectedText_product02_Description = "A red light isn't the desired state in testing but it sure helps when riding your bike at night. Water-resistant with 3 lighting modes, 1 AAA battery included.";

        String actualText_product02_Description = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[2]/div[2]/div[1]/div")).getText();

        if (expectedText_product02_Description.equals(actualText_product02_Description)) {
            System.out.println("Verification passed: The product_02 description matches expected text.");
        }
        else{
            System.out.println("Verification failed: The product_02 description does not match expected text.");
        }

        //Verifying the product price
        String expectedText_product02_Price = "$9.99";

        String actualText_product02_Price = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[2]/div[2]/div[2]/div")).getText();

        if (expectedText_product02_Price.equals(actualText_product02_Price)) {
            System.out.println("Verification passed: The product_02 price matches expected text.");
        }
        else{
            System.out.println("Verification failed: The product_02 price does not match expected text.");
        }


        //------------------------------ Product 3: Sauce Labs Bolt T-Shirt -------------------------------

        System.out.println("\n\nVerify the Sauce Labs  product03 details :");

        String expectedText_product03_Heading = "Sauce Labs Bolt T-Shirt";

        // Verifying if the correct element is selected
        String actualText_product03_Heading = driver.findElement(By.xpath("//*[@id=\"item_1_title_link\"]/div")).getText();


        if (expectedText_product03_Heading.equals(actualText_product03_Heading)) {
            System.out.println("Verification passed: The product03 heading matches expected text.");
        } else {
            System.out.println("Verification failed: The product03 heading does not match expected text.");
        }

        //Verifying description is correct
        String expectedText_product03_Description = "Get your testing superhero on with the Sauce Labs bolt T-shirt. From American Apparel, 100% ringspun combed cotton, heather gray with red bolt.";

        String actualText_product03_Description = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[3]/div[2]/div[1]/div")).getText();

        if (expectedText_product03_Description.equals(actualText_product03_Description)) {
            System.out.println("Verification passed: The product03 description matches expected text.");
        }
        else{
            System.out.println("Verification failed: The product03 description does not match expected text.");
        }

        //Verifying the product price
        String expectedText_product03_Price = "$15.99";

        String actualText_product03_Price = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[3]/div[2]/div[2]/div")).getText();

        if (expectedText_product03_Price.equals(actualText_product03_Price)) {
            System.out.println("Verification passed: The product03 price matches expected text.");
        }
        else{
            System.out.println("Verification failed: The product03 price does not match expected text.");
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
