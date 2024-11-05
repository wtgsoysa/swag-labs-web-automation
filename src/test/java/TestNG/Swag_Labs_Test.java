package TestNG;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Swag_Labs_Test {

    /*---------------------------- GLOBAL VARIABLE SECTION ----------------------------------------*/
    String BaseURL = "https://www.saucedemo.com/";
    WebDriver driver;
    String actualText;
    String expectedText;
    String expectedSort;

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
    public void addtoCartBTNTest(){

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
    public void randomAddtoCartBTNTest() {

        System.out.println("\n----------------TC 004----------------\n");
        System.out.println("RANDOM TEST SINGLE ADD TO CART BTN \n");

        List<WebElement> addToCartButtons = driver.findElements(By.className("inventory_item_price"));

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

    // Test Case 005:
    @Test(priority = 5)
    public void random_Multiple_AddtoCartBTNTest() {

        System.out.println("\n----------------TC 005----------------\n");
        System.out.println("RANDOMLY TEST MULTIPLE ADD TO CART BTN\n");

        List<WebElement> addToCartButtons = driver.findElements(By.className("inventory_item_price"));


        Random random = new Random();
        int numberOfItemsToAdd = 3; // Change this to the number of items you want to add
        for (int i = 0; i < numberOfItemsToAdd; i++) {
            // Generate a random index for each iteration
            int randomIndex = random.nextInt(addToCartButtons.size());

            // Click on the randomly selected button
            WebElement randomButton = addToCartButtons.get(randomIndex);
            randomButton.click();
            System.out.println("Clicked Add to Cart for item at product: " + randomIndex);
        }



        WebElement cartIcon = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
        int cartCount = Integer.parseInt(cartIcon.getText());
        if (cartCount > 0) {
            System.out.println("Test passed: Item count is correct.");

        }
        else{
            System.out.println("Test failed: Item count is incorrect.");
        }

    }

    // Test Case 006:
    @Test(priority = 6)
    public void sortingDropdown01(){
        System.out.println("\n----------------TC 006----------------\n");
        System.out.println("SORTING DROPDOWN ( Z - A )\n");


        WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("Name (Z to A)");

        System.out.println("Verify the Sorting Name ( Z to A) Product Load :");

        // Get all product titles
        List<WebElement> productElements = driver.findElements(By.className("inventory_item_name")); // Replace with the actual class name for product titles
        List<String> productTitles = new ArrayList<>();

        for (WebElement product : productElements) {
            productTitles.add(product.getText());
        }

        // Copy product titles and sort in descending order for comparison
        List<String> sortedTitles = new ArrayList<>(productTitles);
        Collections.sort(sortedTitles, Collections.reverseOrder());

        System.out.println("\n"+ productTitles +"\n");
        // Verify if the products are displayed in "Z to A" order
        if (productTitles.equals(sortedTitles)) {
            System.out.println("Products are correctly sorted in Z to A order.");
        } else {
            System.out.println("Products are not sorted correctly.");
        }

    }

    // Test Case 007:
    @Test(priority = 7)
    public void sortingDropdown02(){
        System.out.println("\n----------------TC 007----------------\n");
        System.out.println("SORTING DROPDOWN ( A - Z )\n");


        WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("Name (A to Z)");

        System.out.println("Verify the Sorting Name ( A to Z) Product Load :");

        // Get all product titles
        List<WebElement> productElements = driver.findElements(By.className("inventory_item_name")); // Replace with the actual class name for product titles
        List<String> productTitles = new ArrayList<>();

        for (WebElement product : productElements) {
            productTitles.add(product.getText());
        }

        // Copy product titles and sort in ascending order for comparison
        List<String> sortedTitles = new ArrayList<>(productTitles);
        Collections.sort(sortedTitles);

        System.out.println("\n"+ productTitles +"\n");
        // Verify if the products are displayed in "A to Z" order
        if (productTitles.equals(sortedTitles)) {
            System.out.println("Products are correctly sorted in A to Z order.");
        } else {
            System.out.println("Products are not sorted correctly.");
        }


    }

    // Test Case 008:
    @Test(priority = 8)
    public void sortingDropdown03() {
        System.out.println("\n----------------TC 008----------------\n");
        System.out.println("SORTING DROPDOWN PRICE (low to high)\n");

        WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("Price (low to high)");

        System.out.println("Verify the Sorting Price (low to high) Product Load:");

        // Get all product prices
        List<WebElement> productElements = driver.findElements(By.className("inventory_item_price"));
        List<String> productPrices = new ArrayList<>();

        for (WebElement product : productElements) {
            productPrices.add(product.getText().replace("$", ""));  // Remove dollar sign if present
        }

        // Convert product prices to double for accurate comparison
        List<Double> productPricesDouble = productPrices.stream().map(Double::parseDouble).collect(Collectors.toList());

        // Create a copy of product prices and sort in ascending order for comparison
        List<Double> sortedPrices = new ArrayList<>(productPricesDouble);
        Collections.sort(sortedPrices);

        System.out.println("\nOriginal Prices: " + productPricesDouble);
        System.out.println("Expected Sorted Prices (low to high): " + sortedPrices + "\n");

        if (productPricesDouble.equals(sortedPrices)) {
            System.out.println("Products are correctly sorted in (low to high) order.");
        } else {
            System.out.println("Products are not sorted correctly.");
        }
    }

    // Test Case 009:
    @Test(priority = 9)
    public void sortingDropdown04() {
        System.out.println("\n----------------TC 009----------------\n");
        System.out.println("SORTING DROPDOWN PRICE (high to low)\n");

        WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("Price (high to low)");

        System.out.println("Verify the Sorting Price (high to low) Product Load:");

        // Get all product prices
        List<WebElement> productElements = driver.findElements(By.className("inventory_item_price"));
        List<String> productPrices = new ArrayList<>();

        for (WebElement product : productElements) {
            productPrices.add(product.getText().replace("$", ""));  // Remove dollar sign if present
        }

        // Convert product prices to double for accurate comparison
        List<Double> productPricesDouble = productPrices.stream().map(Double::parseDouble).collect(Collectors.toList());

        // Create a copy of product prices and sort in ascending order for comparison
        List<Double> sortedPrices = new ArrayList<>(productPricesDouble);


        System.out.println("\nOriginal Prices: " + productPricesDouble);
        System.out.println("Expected Sorted Prices (low to high): " + sortedPrices + "\n");

        if (productPricesDouble.equals(sortedPrices)) {
            System.out.println("Products are correctly sorted in (low to high) order.");
        } else {
            System.out.println("Products are not sorted correctly.");
        }
    }

    // Test Case 010:
    @Test(priority = 10)
    public void navigateToCart(){
        System.out.println("\n----------------TC 010----------------\n");
        System.out.println("NAVIGATE TO YOUR CART PAGE\n");

        // Navigate into your cart page
        WebElement cart = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
        cart.click();

        expectedText = "Your Cart";
        actualText = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();

        if(actualText.equals(expectedText)){
            System.out.println("Verification Passed : Successfully navigated to the your cart page.");
        }
        else{
            System.out.println("Verification Failed : Unsuccessfully navigated to the your cart page.");
        }

        System.out.println("\nTEST THE YOUR CART PAGE HEADING\n");

        String expectedHeading = "Swag Labs";
        String actualHeading = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[1]/div[2]/div")).getText();

        if(actualHeading.equals(expectedHeading)){
            System.out.println("Verification Passed : Successfully check the your cart Heading");
        }
        else{
            System.out.println("Verification Failed : Unsuccessfully check the your cart Heading.");
        }

    }

    // Test Case 011:
    @Test(priority = 11)
    public void navigateBackToShopping() {
        System.out.println("\n----------------TC 011----------------\n");
        System.out.println("NAVIGATE BACK TO SHOPPING PAGE\n");

        // Navigate into checkout page
        WebElement shopping = driver.findElement(By.xpath("//*[@id=\"continue-shopping\"]"));
        shopping.click();

        expectedText = "Products";
        actualText = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();

        if(actualText.equals(expectedText)){
            System.out.println("Verification Passed : Successfully navigated to the shopping page.");
        }
        else{
            System.out.println("Verification Failed : Unsuccessfully navigated to the shopping page.");
        }


    }

    // Test Case 12:
    @Test(priority = 12)
    public void addSomeProductToCart() {
        System.out.println("\n----------------TC 012----------------\n");
        System.out.println("ADD PRODUCT TO YOUR CART PAGE\n");

        WebElement product1 = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]"));
        product1.click();
        WebElement product2 = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]"));
        product2.click();


        // Navigate into your cart page
        WebElement cart = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
        cart.click();

        String expectedTextHeading = "Your Cart";
        String actualTextHeading = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();

        if(actualTextHeading.equals(expectedTextHeading)){
            System.out.println("Verification Passed : Successfully navigated to the your cart page.");
        }
        else{
            System.out.println("Verification Failed : Unsuccessfully navigated to the your cart page.");
        }


    }

    //Test Case 13:
    @Test(priority = 13)
    public void checkCards(){
        System.out.println("\n--------------TC 013----------------\n");
        System.out.println("CHECK CARDS OF YOUR CART PAGE\n");

        //Test Card 01 : Sauce Labs Backpack

        String expectedcard01Heading  = "Test.allTheThings() T-Shirt (Red)";
        String actualcard01Heading = driver.findElement(By.xpath("//*[@id=\"item_3_title_link\"]/div")).getText();

        System.out.println("Card 01 Test : ");
        System.out.println(actualcard01Heading + "\n");
        System.out.println("Card 01 Heading Test : ");
        if(actualcard01Heading.equals(expectedcard01Heading )){
            System.out.println("Verification Passed : Successfully check the card 01 Heading of your cart.\n");

            System.out.println("Card 01 Description Test :");

            String expectedcard01Description = "This classic Sauce Labs t-shirt is perfect to wear when cozying up to your keyboard to automate a few tests. Super-soft and comfy ringspun combed cotton.";
            String actualcard01Description = driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[1]/div[3]/div[2]/div[1]")).getText();
            System.out.println(actualcard01Description + "\n");

            if(actualcard01Description.equals(expectedcard01Description)){
                System.out.println("Verification Passed : Successfully check the card 01 Description of your cart.\n");

                System.out.println("Card 01 Price Test :");

                String expectedcard01Price = "$15.99";
                String actualcard01Price = driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[1]/div[3]/div[2]/div[2]/div")).getText();

                System.out.println(actualcard01Price + "\n");

                if(actualcard01Price.equals(expectedcard01Price)){
                    System.out.println("Verification Passed : Successfully check the card 01 Price of your cart.\n");
                }
                else{
                    System.out.println("Verification Failed : Unsuccessfully check the card 01 Price of your cart.\n");
                }

            }
            else{
                System.out.println("Verification Failed : Unsuccessfully check the card 01 Description of your cart.\n");
            }

        }
        else{
            System.out.println("Verification Failed : Unsuccessfully check the card 01 Heading of your cart.\n");
        }



        String expectedcard02Heading  = "Sauce Labs Backpack";
        String actualcard02Heading = driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).getText();

        System.out.println("Card 02 Test : ");
        System.out.println(actualcard02Heading + "\n");
        if(actualcard02Heading.equals(expectedcard02Heading )){
            System.out.println("Verification Passed : Successfully check the card 02 Heading of your cart.\n");

            System.out.println("Card 02 Description Test :");

            String expectedcard02Description = "carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.";
            String actualcard02Description = driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[1]/div[4]/div[2]/div[1]")).getText();

            System.out.println(expectedcard02Description + "\n");

            if(actualcard02Description.equals(expectedcard02Description)){
                System.out.println("Verification Passed : Successfully check the card 02 Description of your cart.\n");

                System.out.println("Card 02 Price Test :");

                String expectedcard02Price = "$29.99";
                String actualcard02Price = driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[1]/div[4]/div[2]/div[2]/div")).getText();

                System.out.println(actualcard02Price + "\n");

                if(actualcard02Price.equals(expectedcard02Price)){
                    System.out.println("Verification Passed : Successfully check the card 02 Price of your cart.\n");
                }
                else{
                    System.out.println("Verification Failed : Unsuccessfully check the card 02 Price of your cart.\n");
                }
            }
            else{
                System.out.println("Verification Failed : Unsuccessfully check the card 02 Description of your cart.\n");
            }


        }
        else{
            System.out.println("Verification Failed : Unsuccessfully check the card 02 Heading of your cart.\n");
        }

        String expectedcard03Heading  = "Sauce Labs Bolt T-Shirt";
        String actualcard03Heading = driver.findElement(By.xpath("//*[@id=\"item_1_title_link\"]/div")).getText();

        System.out.println("Card 03 Test : ");
        System.out.println(actualcard03Heading + "\n");
        if(actualcard03Heading.equals(expectedcard03Heading )){
            System.out.println("Verification Passed : Successfully check the card 03 Heading of your cart.\n");

            System.out.println("Card 03 Description Test :");

            String expectedcard03Description = "Get your testing superhero on with the Sauce Labs bolt T-shirt. From American Apparel, 100% ringspun combed cotton, heather gray with red bolt.";
            String actualcard03Description = driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[1]/div[5]/div[2]/div[1]")).getText();

            System.out.println(actualcard03Description +"\n");

            if(actualcard03Description.equals(expectedcard03Description)){
                System.out.println("Verification Passed : Successfully check the card 03 Description of your cart.\n");

                System.out.println("Card 03 Price Test :");

                String expectedcard03Price = "$15.99";
                String actualcard03Price = driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[1]/div[5]/div[2]/div[2]/div")).getText();

                System.out.println(actualcard03Price + "\n");

                if(actualcard03Price.equals(expectedcard03Price)){
                    System.out.println("Verification Passed : Successfully check the card 03 Price of your cart.\n");
                }
                else{
                    System.out.println("Verification Failed : Unsuccessfully check the card 03 Price of your cart.\n");
                }
            }
            else{
                System.out.println("Verification Failed : Unsuccessfully check the card 03 Description of your cart.\n");
            }
        }
        else{
            System.out.println("Verification Failed : Unsuccessfully check the card 03 Heading of your cart.\n");
        }

    }


    //Test Case 14:
    @Test(priority = 14)
    public void checkRemoveBTN() {
        System.out.println("\n--------------TC 014----------------\n");
        System.out.println("CHECK AVAILABILITY OF REMOVE BTN\n");
        System.out.println("Card 01 Remove Button Test : \n");

        String expectedremoveBtn01 = "Remove";
        String actualremoveBtn01 = driver.findElement(By.xpath("//*[@id=\"remove-test.allthethings()-t-shirt-(red)\"]")).getText();
        WebElement removeBtn01 = driver.findElement(By.xpath("//*[@id=\"remove-test.allthethings()-t-shirt-(red)\"]"));

        System.out.println(actualremoveBtn01);
        if(actualremoveBtn01.equals(expectedremoveBtn01)){
            System.out.println("Verification Passed : Available the card 01 remove button \n");

            removeBtn01.click(); // Click the button to remove item from cart
            // Verify item is removed
            boolean isRemoved = driver.findElements(By.xpath("//*[@id=\"remove-test.allthethings()-t-shirt-(red)\"]")).isEmpty();
            if (isRemoved) {
                System.out.println("Card 01 has been successfully removed from the cart\n");
            } else {
                System.out.println("Failed to remove Card 02 from the cart\n");
            }
        }
        else{
            System.out.println("Verification Failed : Unavailable the card 01 remove button\n");
        }

        System.out.println("Card 02 Remove Button Test : \n");

        String expectedremoveBtn02 = "Remove";
        String actualremoveBtn02 = driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-backpack\"]")).getText();
        WebElement removeBtn02 = driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-backpack\"]"));

        System.out.println(actualremoveBtn02);
        if(actualremoveBtn02.equals(expectedremoveBtn02)){
            System.out.println("Verification Passed : Available the card 02 remove button \n");

            removeBtn02.click(); // Click the button to remove item from cart
            // Verify item is removed
            boolean isRemoved = driver.findElements(By.xpath("//*[@id=\"remove-sauce-labs-backpack\"]")).isEmpty();
            if (isRemoved) {
                System.out.println("Card 01 has been successfully removed from the cart\n");
            } else {
                System.out.println("Failed to remove Card 02 from the cart\n");
            }
        }
        else{
            System.out.println("Verification Failed : Unavailable the card 02 remove button\n");
        }

        System.out.println("Card 03 Remove Button Test : \n");

        String expectedremoveBtn03 = "Remove";
        String actualremoveBtn03 = driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-bolt-t-shirt\"]")).getText();
        WebElement removeBtn03 = driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-bolt-t-shirt\"]"));

        System.out.println(actualremoveBtn03);
        if(actualremoveBtn03.equals(expectedremoveBtn03)){
            System.out.println("Verification Passed : Available the card 03 remove button \n");

            removeBtn03.click(); // Click the button to remove item from cart
            // Verify item is removed
            boolean isRemoved = driver.findElements(By.xpath("//*[@id=\"remove-sauce-labs-bolt-t-shirt\"]")).isEmpty();
            if (isRemoved) {
                System.out.println("Card 03 has been successfully removed from the cart\n");
            } else {
                System.out.println("Failed to remove Card 02 from the cart\n");
            }
        }
        else{
            System.out.println("Verification Failed : Unavailable the card 03 remove button\n");
        }

        WebElement continueShopping = driver.findElement(By.xpath("//*[@id=\"continue-shopping\"]"));
        continueShopping.click();

        expectedText = "Products";
        actualText = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();

        if(actualText.equals(expectedText)){
            System.out.println("Verification Passed : Successfully navigated to the shopping page.");
        }
        else{
            System.out.println("Verification Failed : Unsuccessfully navigated to the shopping page.");
        }


    }

    //Test Case 15:
    @Test(priority = 15)
    public void addProducts() {
        System.out.println("\n--------------TC 014----------------\n");
        System.out.println("AGAIN ADD SOME PRODUCTS\n");

        WebElement product1 = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]"));
        product1.click();
        WebElement product2 = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-onesie\"]"));
        product2.click();


        // Navigate into your cart page
        WebElement cart = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
        cart.click();

        String expectedTextHeading = "Your Cart";
        String actualTextHeading = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();

        if(actualTextHeading.equals(expectedTextHeading)){
            System.out.println("Verification Passed : Successfully navigated to the your cart page.");
        }
        else{
            System.out.println("Verification Failed : Unsuccessfully navigated to the your cart page.");
        }

        WebElement checkoutBtn = driver.findElement(By.xpath("//*[@id=\"checkout\"]"));
        checkoutBtn.click();

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
