# 🚀 Swag Labs Web Automation Project

Welcome to the Swag Labs Web Automation Project! This project is an automated testing suite for [Swag Labs](https://www.saucedemo.com/), designed to ensure the platform functions smoothly and reliably. The test cases are developed in **Java** using **Selenium WebDriver** and **TestNG** for browser automation and test management.

## 📑 Table of Contents
- [📖 Project Overview](#-project-overview)
- [💻 Technologies Used](#-technologies-used)
- [📝 Test Cases](#-test-cases)
- [⚙️ Setup and Installation](#️-setup-and-installation)
- [🤝 Contributing](#-contributing)


---

## 📖 Project Overview

This project automates key functionalities of the Swag Labs e-commerce platform to improve quality assurance. The suite includes tests for login, product display, add-to-cart, sorting, and checkout processes, making sure Swag Labs runs as expected!

## 💻 Technologies Used

- **Java** ☕: The programming language for writing test scripts.
- **Selenium WebDriver** 🌐: Browser automation tool to simulate user actions.
- **TestNG** 🧪: Testing framework for organizing and managing test cases.
- **Maven** 📦: Tool for managing dependencies and building the project.
- **GitHub** 🐙: Platform for version control and collaboration.

## 📝 Test Cases

The following test cases are included in this project:

### 1. **User Authentication 🔐**
   - **Description:** Ensures the login functionality works with different credentials.
   - **Steps:**
     1. Navigate to the login page.
     2. Enter valid username and password.
     3. Click the login button.
   - **Expected Result:** User should be logged in and redirected to the homepage.

### 2. **Product Details 🏷️**
   - **Description:** Verifies the product name, description, and price.
   - **Steps:**
     1. Navigate to the product page.
     2. Check that the product name, description, and price are visible and match the expected details.
   - **Expected Result:** Product details (name, description, and price) should be displayed correctly.

### 3. **Add to Cart 🛒**
   - **Description:** Tests the "Add to Cart" button functionality.
   - **Steps:**
     1. Navigate to the product page.
     2. Click the "Add to Cart" button.
   - **Expected Result:** Product should be added to the cart.

### 4. **Random Add to Cart 🎲 (Single Product)**
   - **Description:** Adds a random product to the cart to test the functionality.
   - **Steps:**
     1. Navigate to the product list page.
     2. Click on the "Add to Cart" button of a random product.
   - **Expected Result:** The selected product should be added to the cart.

### 5. **Random Add to Cart 🎲 (Multiple Products)**
   - **Description:** Adds multiple random products to the cart to check cart reliability.
   - **Steps:**
     1. Navigate to the product list page.
     2. Click on the "Add to Cart" button for multiple random products.
   - **Expected Result:** All selected products should be added to the cart correctly.

### 6. **Sorting Dropdown (Z - A) 🔄**
   - **Description:** Tests the sorting functionality of the "Name (Z to A)" option in the sorting dropdown.
   - **Steps:**
     1. Navigate to the product list page.
     2. Select the "Name (Z to A)" option from the sorting dropdown.
   - **Expected Result:** Products should be sorted alphabetically from Z to A.

### 7. **Sorting Dropdown (A - Z) 🔄**
   - **Description:** Tests the sorting functionality of the "Name (A to Z)" option in the sorting dropdown.
   - **Steps:**
     1. Navigate to the product list page.
     2. Select the "Name (A to Z)" option from the sorting dropdown.
   - **Expected Result:** Products should be sorted alphabetically from A to Z.

### 8. **Sorting Dropdown (Price - Low to High) 🔄**
   - **Description:** Tests the sorting functionality of the "Price (Low to High)" option in the sorting dropdown.
   - **Steps:**
     1. Navigate to the product list page.
     2. Select the "Price (Low to High)" option from the sorting dropdown.
   - **Expected Result:** Products should be sorted by price from low to high.

### 9. **Sorting Dropdown (Price - High to Low) 🔄**
   - **Description:** Tests the sorting functionality of the "Price (High to Low)" option in the sorting dropdown.
   - **Steps:**
     1. Navigate to the product list page.
     2. Select the "Price (High to Low)" option from the sorting dropdown.
   - **Expected Result:** Products should be sorted by price from high to low.

### 10. **Navigate to Cart Page 🛒**
   - **Description:** Verifies that users can navigate to the cart page.
   - **Steps:**
     1. Click on the cart icon or "View Cart" button.
   - **Expected Result:** The cart page should open, displaying the items in the cart.

### 11. **Navigate Back to Shopping Page 🛍️**
   - **Description:** Verifies that users can navigate back to the shopping page from the cart page.
   - **Steps:**
     1. Click the "Continue Shopping" button or navigate back to the shopping page.
   - **Expected Result:** User should be redirected back to the product list page.

### 12. **Add Product to Cart 🛒**
   - **Description:** Verifies that users can add a product to the cart from the product page.
   - **Steps:**
     1. Navigate to the product page.
     2. Click the "Add to Cart" button.
   - **Expected Result:** The product should be successfully added to the cart.

### 13. **Check Cart Contents 🛒**
   - **Description:** Verifies that the products in the cart are correctly displayed.
   - **Steps:**
     1. Navigate to the cart page.
   - **Expected Result:** All added products should be visible in the cart with their correct details.

### 14. **Check Availability of Remove Button ❌**
   - **Description:** Verifies that the "Remove" button is available for items in the cart.
   - **Steps:**
     1. Navigate to the cart page.
   - **Expected Result:** A "Remove" button should be visible for each item in the cart.

### 15. **Add More Products to Cart 🛍️**
   - **Description:** Verifies that users can add more products to the cart after removing some.
   - **Steps:**
     1. Remove a product from the cart.
     2. Add additional products to the cart.
   - **Expected Result:** New products should be successfully added to the cart.

### 16. **Your Information Page 🧾**
   - **Description:** Verifies that the user information page shows the correct details.
   - **Steps:**
     1. Proceed to the checkout page.
     2. Verify that the user’s information (name, address, etc.) is correct.
   - **Expected Result:** The user information should be accurate and pre-filled.

### 17. **Verify Product Details in Checkout Overview Page 🏷️**
   - **Description:** Verifies that the correct product details are shown in the checkout overview page.
   - **Steps:**
     1. Proceed to the checkout overview page.
   - **Expected Result:** Product name, description, price, and quantity should be correct.

### 18. **Verify Payment, Shipping, and Total Price Information 💳**
   - **Description:** Verifies that the payment method, shipping information, and total price are displayed correctly in the checkout overview page.
   - **Steps:**
     1. Navigate to the checkout overview page.
   - **Expected Result:** Payment details, shipping details, and total price should be accurate.

### 19. **Verify Order Completion ✅**
   - **Description:** Verifies that the order is complete and the confirmation page is displayed.
   - **Steps:**
     1. Complete the checkout process.
> Each test simulates a real user interaction to ensure Swag Labs provides a great user experience.

## ⚙️ Setup and Installation

Here’s how to set up the project on your local machine:

1. **Clone the Repository** 🛠️
   ```bash
   git clone https://github.com/your-username/swag-labs-web-automation.git
   cd swag-labs-web-automation

   # Swag Labs Web Automation

This project is focused on automating the Swag Labs website using Selenium WebDriver and TestNG. It's designed to test various user interactions with the site and ensure that the shopping cart and product details functions are working as expected.

## 🤝 Contributing

We welcome contributions! Whether you're fixing a bug, improving the documentation, or adding a new feature, we appreciate your help. To contribute, please follow the steps below:

### Steps to Contribute:

1. **Fork the Repository** 🍴  
   Start by forking the repository to your GitHub account. Click the "Fork" button at the top right corner of the repository page.

2. **Clone Your Fork** 🔽  
   After forking the repository, clone it to your local machine:
   ```bash
   git clone https://github.com/your-username/swag-labs-web-automation.git



