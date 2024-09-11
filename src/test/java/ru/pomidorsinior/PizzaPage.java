package ru.pomidorsinior;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PizzaPage {
    public static final String TITLE_PIZZA_XPATH = "//section[@id='block-views-products-block']//h2";
}
public class PizzaTest extends BaseTest{

    @BeforeEach
    public void closePopup(){
        By buttonCloseBy = By.xpath(CitiesChooseModalPage.BUTTON_CLOSE_XPATH);
        WebElement buttonCloseWebElement = driver.findElement(buttonCloseBy);
        buttonCloseWebElement.click();
    }

    @Test
    public void testClickOnPizzaOpenPizzaBlock(){
        By menuButtonPizzaBy = By.xpath(MenuPage.MENU_BUTTON_PIZZA);
        WebElement menuButtonPizzaWebElement = driver.findElement(menuButtonPizzaBy);
        menuButtonPizzaWebElement.click();

        By titlePizzaBy = By.xpath(PizzaPage.TITLE_PIZZA_XPATH);
        WebElement titlePizzaWebElement = driver.findElement(titlePizzaBy);
        String actualTitlePizzaText = titlePizzaWebElement.getText();
        String expectedTitlePizzaText = "Пицца";

        Assertions.assertEquals(expectedTitlePizzaText, actualTitlePizzaText);
    }
}
