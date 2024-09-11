import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ru.pomidorsinior.BaseTest;

public class CalculatorTest extends BaseTest {
    @Test
    public void whenAllFieldsIsEmptyTest() {
        String buttonFormXPath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input";
        WebElement buttonFormWebElement = BaseTest.getDriver().findElement(By.xpath(buttonFormXPath));
        buttonFormWebElement.click();

        String messageXPath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[1]/td";
        WebElement messageWebElement = BaseTest.getDriver().findElement(By.xpath(messageXPath));
        String actualMessage = messageWebElement.getText();
        String exceptedMessage = "Не указано имя.\n" +
                "Рост должен быть в диапазоне 50-300 см.\n" +
                "Вес должен быть в диапазоне 3-500 кг.\n" +
                "Не указан пол.";
        Assertions.assertEquals(exceptedMessage, actualMessage);
    }

    @Test
    public void whenOneFieldsIsEmptyTest() {
        String fieldNameXPath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[2]/td[2]/input";
        WebElement fieldNameWebElement = BaseTest.getDriver().findElement(By.xpath(fieldNameXPath));
        fieldNameWebElement.sendKeys("Alex");

        String fieldHeightXPath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[3]/td[2]/input";
        WebElement fieldHeightWebElement = BaseTest.getDriver().findElement(By.xpath(fieldHeightXPath));
        fieldHeightWebElement.sendKeys("150");
        String buttonFormXPath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input";
        WebElement buttonFormWebElement = BaseTest.getDriver().findElement(By.xpath(buttonFormXPath));
        buttonFormWebElement.click();

        String messageXPath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[1]/td";
        WebElement messageWebElement = BaseTest.getDriver().findElement(By.xpath(messageXPath));
        String actualMessage = messageWebElement.getText();
        String exceptedMessage = "Вес должен быть в диапазоне 3-500 кг.\n" +
                "Не указан пол.";
        Assertions.assertEquals(exceptedMessage, actualMessage);
    }
}


