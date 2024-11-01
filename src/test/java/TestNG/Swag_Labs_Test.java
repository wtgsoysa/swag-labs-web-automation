package TestNG;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.List;
import java.util.Random;

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
            takeSnapShot(driver, "F:\\SQA PROJECTS\\Swag-labs\\images\\LoginSuccess.png");
        } else {
            System.out.println("Verify the page");
            System.out.println("Verification failed: The product page load unsuccessfully");
            takeSnapShot(driver, "F:\\SQA PROJECTS\\Swag-labs\\images\\LoginFailed.png");
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



        //------------------------------ Product 4: Sauce Labs Fleece Jacket -------------------------------

        System.out.println("\n\nVerify the Sauce Labs  product04 details :");

        String expectedText_product04_Heading = "Sauce Labs Fleece Jacket";

        // Verifying if the correct element is selected
        String actualText_product04_Heading = driver.findElement(By.xpath("//*[@id=\"item_5_title_link\"]/div")).getText();


        if (expectedText_product04_Heading.equals(actualText_product04_Heading)) {
            System.out.println("Verification passed: The product04 heading matches expected text.");
        } else {
            System.out.println("Verification failed: The product04 heading does not match expected text.");
        }

        //Verifying description is correct
        String expectedText_product04_Description = "It's not every day that you come across a midweight quarter-zip fleece jacket capable of handling everything from a relaxing day outdoors to a busy day at the office.";

        String actualText_product04_Description = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[4]/div[2]/div[1]/div")).getText();

        if (expectedText_product04_Description.equals(actualText_product04_Description)) {
            System.out.println("Verification passed: The product04 description matches expected text.");
        }
        else{
            System.out.println("Verification failed: The product04 description does not match expected text.");
        }

        //Verifying the product price
        String expectedText_product04_Price = "$49.99";

        String actualText_product04_Price = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[4]/div[2]/div[2]/div")).getText();

        if (expectedText_product04_Price.equals(actualText_product04_Price)) {
            System.out.println("Verification passed: The product04 price matches expected text.");
        }
        else{
            System.out.println("Verification failed: The product04 price does not match expected text.");
        }


        //------------------------------ Product 5: Sauce Labs Onesie -------------------------------

        System.out.println("\n\nVerify the Sauce Labs  product05 details :");

        String expectedText_product05_Heading = "Sauce Labs Onesie";

        // Verifying if the correct element is selected
        String actualText_product05_Heading = driver.findElement(By.xpath("//*[@id=\"item_2_title_link\"]/div")).getText();


        if (expectedText_product05_Heading.equals(actualText_product05_Heading)) {
            System.out.println("Verification passed: The product05heading matches expected text.");
        } else {
            System.out.println("Verification failed: The product05heading does not match expected text.");
        }

        //Verifying description is correct
        String expectedText_product05_Description = "Rib snap infant onesie for the junior automation engineer in development. Reinforced 3-snap bottom closure, two-needle hemmed sleeved and bottom won't unravel.";

        String actualText_product05_Description = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[5]/div[2]")).getText();

        if (expectedText_product05_Description.equals(actualText_product05_Description)) {
            System.out.println("Verification passed: The product05description matches expected text.");
        }
        else{
            System.out.println("Verification failed: The product05description does not match expected text.");
        }

        //Verifying the product price
        String expectedText_product05_Price = "$7.99";

        String actualText_product05_Price = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[5]/div[2]/div[2]/div")).getText();

        if (expectedText_product05_Price.equals(actualText_product05_Price)) {
            System.out.println("Verification passed: The product 05price matches expected text.");
        }
        else{
            System.out.println("Verification failed: The product 05price does not match expected text.");
        }


        //------------------------------ Product 6: Test.allTheThings() T-Shirt (Red) -------------------------------

        System.out.println("\n\nVerify the Sauce Labs product 06 details :");

        String expectedText_product06_Heading = "Test.allTheThings() T-Shirt (Red)";

        // Verifying if the correct element is selected
        String actualText_product06_Heading = driver.findElement(By.xpath("//*[@id=\"item_3_title_link\"]/div")).getText();


        if (expectedText_product06_Heading.equals(actualText_product06_Heading)) {
            System.out.println("Verification passed: The product 06heading matches expected text.");
        } else {
            System.out.println("Verification failed: The product 06heading does not match expected text.");
        }

        //Verifying description is correct
        String expectedText_product06_Description = "This classic Sauce Labs t-shirt is perfect to wear when cozying up to your keyboard to automate a few tests. Super-soft and comfy ringspun combed cotton.";

        String actualText_product06_Description = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[6]/div[2]/div[1]/div")).getText();

        if (expectedText_product06_Description.equals(actualText_product06_Description)) {
            System.out.println("Verification passed: The product 06 description matches expected text.");
        }
        else{
            System.out.println("Verification failed: The product 06 description does not match expected text.");
        }

        //Verifying the product price
        String expectedText_product06_Price = "$15.99";

        String actualText_product06_Price = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[6]/div[2]/div[2]/div")).getText();

        if (expectedText_product06_Price.equals(actualText_product06_Price)) {
            System.out.println("Verification passed: The product 06 price matches expected text.");
        }
        else{
            System.out.println("Verification failed: The product 06 price does not match expected text.");
        }


    }

    // Test Case 003:
    @Test(priority = 3)
    public void AddtoCartBTNTest(){

        System.out.println("\n----------------TC 003----------------\n");
        System.out.println("ADD TO CART BTN TEST \n");

        //------------------------------ Product 1: Sauce Labs Backpack-------------------------------

        System.out.println("Verify the Product 01 : Sauce Labs Backpack ");
        WebElement product01_addToCartBTN = driver.findElement(By.xpath("//button[text()='Add to cart'][1]"));
        product01_addToCartBTN.click();

        WebElement cart_Icon_product1 = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
        String initial_count_product1 = cart_Icon_product1.getText();


        if (initial_count_product1.equals("1") ) {
            System.out.println("Verification passed: The product 01 successfully added to the cart");

            //Remove the add to cart button
            WebElement product01_removeAddCartBTN = driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-backpack\"]"));
            product01_removeAddCartBTN.click();
        }
        else{
            System.out.println("Verification failed: The product 01 unsuccessfully added to the cart");

            //Remove the add to cart button
            WebElement product01_removeAddCartBTN = driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-backpack\"]"));
            product01_removeAddCartBTN.click();
        }

        //------------------------------ Product 2: Sauce Labs Bike Light-------------------------------

        System.out.println("\nVerify the Product 02 : Sauce Labs Bike Light ");
        WebElement product02_addToCartBTN = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]"));
        product02_addToCartBTN.click();

        WebElement cart_Icon_product2 = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
        String initial_count_product2 = cart_Icon_product2.getText();


        if (initial_count_product2.equals("1") ) {
            System.out.println("Verification passed: The product 02 successfully added to the cart");

            //Remove the add to cart button
            WebElement product02_removeAddCartBTN = driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-bike-light\"]"));
            product02_removeAddCartBTN.click();
        }
        else{
            System.out.println("Verification failed: The product 02 unsuccessfully added to the cart");

            //Remove the add to cart button
            WebElement product02_removeAddCartBTN = driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-bike-light\"]"));
            product02_removeAddCartBTN.click();
        }

        //------------------------------ Product 3: Sauce Labs Bolt T-Shirt-------------------------------

        System.out.println("\nVerify the Product 03 : Sauce Labs Bolt T-Shirt ");
        WebElement product03_addToCartBTN = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]"));
        product03_addToCartBTN.click();

        WebElement cart_Icon_product3 = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
        String initial_count_product3 = cart_Icon_product3.getText();


        if (initial_count_product3.equals("1") ) {
            System.out.println("Verification passed: The product 03 successfully added to the cart");

            //Remove the add to cart button
            WebElement product03_removeAddCartBTN = driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-bolt-t-shirt\"]"));
            product03_removeAddCartBTN.click();
        }
        else{
            System.out.println("Verification failed: The product 03 unsuccessfully added to the cart");

            //Remove the add to cart button
            WebElement product03_removeAddCartBTN = driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-bolt-t-shirt\"]"));
            product03_removeAddCartBTN.click();
        }


        //------------------------------ Product 4: Sauce Labs Fleece Jacket-------------------------------

        System.out.println("\nVerify the Product 04 : Sauce Labs Fleece Jacket ");
        WebElement product04_addToCartBTN = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]"));
        product04_addToCartBTN.click();

        WebElement cart_Icon_product4 = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
        String initial_count_product4 = cart_Icon_product3.getText();


        if (initial_count_product4.equals("1") ) {
            System.out.println("Verification passed: The product 04 successfully added to the cart");

            //Remove the add to cart button
            WebElement product04_removeAddCartBTN = driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-fleece-jacket\"]"));
            product04_removeAddCartBTN.click();
        }
        else{
            System.out.println("Verification failed: The product 04 unsuccessfully added to the cart");

            //Remove the add to cart button
            WebElement product04_removeAddCartBTN = driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-fleece-jacket\"]"));
            product04_removeAddCartBTN.click();
        }


        //------------------------------ Product 5: Sauce Labs Onesie-------------------------------

        System.out.println("\nVerify the Product 05 : Sauce Labs Onesie ");
        WebElement product05_addToCartBTN = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-onesie\"]"));
        product05_addToCartBTN.click();

        WebElement cart_Icon_product5 = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
        String initial_count_product5 = cart_Icon_product3.getText();


        if (initial_count_product5.equals("1") ) {
            System.out.println("Verification passed: The product 05 successfully added to the cart");

            //Remove the add to cart button
            WebElement product05_removeAddCartBTN = driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-onesie\"]"));
            product05_removeAddCartBTN.click();
        }
        else{
            System.out.println("Verification failed: The product 05 unsuccessfully added to the cart");

            //Remove the add to cart button
            WebElement product05_removeAddCartBTN = driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-onesie\"]"));
            product05_removeAddCartBTN.click();
        }

        //------------------------------ Product 6: Test.allTheThings() T-Shirt (Red)-------------------------------

        System.out.println("\nVerify the Product 06 : Test.allTheThings() T-Shirt (Red) ");
        WebElement product06_addToCartBTN = driver.findElement(By.xpath("//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]"));
        product06_addToCartBTN.click();

        WebElement cart_Icon_product6 = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
        String initial_count_product6 = cart_Icon_product3.getText();


        if (initial_count_product6.equals("1") ) {
            System.out.println("Verification passed: The product 06 successfully added to the cart");

            //Remove the add to cart button
            WebElement product06_removeAddCartBTN = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[6]/div[2]/div[2]/div"));
            product06_removeAddCartBTN.click();
        }
        else{
            System.out.println("Verification failed: The product 06 unsuccessfully added to the cart");

            //Remove the add to cart button
            WebElement product06_removeAddCartBTN = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[6]/div[2]/div[2]/div"));
            product06_removeAddCartBTN.click();
        }

    }

    // Test Case 004:
    @Test(priority = 4)
    public void RandomAddtoCartBTNTest() {

        System.out.println("\n----------------TC 004----------------\n");
        System.out.println("Random ADD TO CART BTN TEST \n");

        List<WebElement> addToCartButtons = driver.findElements(By.className("btn btn_primary  "));

        Random random = new Random();
        int randomIndex = random.nextInt(addToCartButtons.size());

        addToCartButtons.get(randomIndex).click();

        WebElement cartIconCount = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
        String itemCount = cartIconCount.getText();

        // Print the item count to confirm
        System.out.println("Cart icon now shows item count: " + itemCount);

        // Verify if the item count is as expected
        int expectedCount = 1; // Change this based on your test case (e.g., previous cart count + 1)
        if (Integer.parseInt(itemCount) == expectedCount) {
            System.out.println("Test passed: Item count is correct.");
        } else {
            System.out.println("Test failed: Item count is incorrect.");
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
