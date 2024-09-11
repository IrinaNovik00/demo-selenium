package ru.pomidorsinior;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PizzaTest extends BaseTest {

    @Test
    public void testClickonPizzaBlock() {
        By menuButtonPizzaBy = By.xpath(MenuPage.MENU_BUTTON_PIZZA);
        WebElement menuButtonPizzaWebElement = driver.findElement(menuButtonPizzaBy);
        menuButtonPizzaWebElement.click();

        By titlePizzaBy = By.xpath(PizzaPage.TITLE_PIZZA_XPATH);
        WebElement titlePizzaElement = driver.findElement(titlePizzaBy);
        String actualTitlePizzaText = titlePizzaWebElement.getText();
        String expectedTitlePizzaText = "Пицца";

        Assertions.assertEquals(expectedTitlePizzaText, actualTitlePizzaText);
    }
}
}
