package org.qa.light.HomeWork;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Page {
    //write test that will to go allo.ua, search for iphone 17
    //Assert that search has at least 3 results
    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeSuite
    public void setUp() {

        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10L));
    }

    @AfterSuite
    public void tearDown() {

        driver.quit();
    }

    @Test
    public void testSearchIphone17() {
        // Відкривається сайт
        driver.get("https://allo.ua");

        // 2. Чекаємо елемент пошуку
        WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector("#search-form__input")));

        // Вводимо в пошук, що хочем знайти на сторінці алло
        searchBox.sendKeys("iPhone 17");
        searchBox.sendKeys(Keys.ENTER);
        try {
            List<WebElement> IPhone17s = wait.until(
                    ExpectedConditions.numberOfElementsToBeMoreThan(By.className("product-card"), 2)//для негативного кейсу ввести 70
            );

        } catch (Exception e) {
            Assert.fail("На сторінці менше 3 айфонів!");
        }

    }
}
