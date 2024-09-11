import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


    public class WeightCalculatorTest {
        //1. Given
        WebDriver driver;

        @BeforeEach
        public void setupDriver() {
            String webAddress = "https://svyatoslav.biz/testlab/wt/index.php";
            driver = new ChromeDriver();
            driver.get(webAddress);
        }

        @Test
        public void whenAllFieldAreEmptyClickSubmitThenErrorMessage() {
            //2. When
            String buttonCalculateXPath = "//input[@type='submit']";
            By buttonCalculateBy = By.xpath(buttonCalculateXPath);
            WebElement buttonCalculateWebElement = driver.findElement(buttonCalculateBy);

            buttonCalculateWebElement.click();
            //3. Then
            String errorMessageXPath = "//b";
            By errorMessageBy = By.xpath(errorMessageXPath);
            WebElement errorMessageWebElement = driver.findElement(errorMessageBy);

            String actualErrorMessage = errorMessageWebElement.getText();
            String expectedErrorMessage = "Не указано имя.\n" +
                    "Рост должен быть в диапазоне 50-300 см.\n" +
                    "Вес должен быть в диапазоне 3-500 кг.\n" +
                    "Не указан пол.";

            Assertions.assertEquals(expectedErrorMessage, actualErrorMessage);
        }

        @Test
        public void whenNameClickSubmitThenErrorMessage() {
            //2. When
            String buttonCalculateXPath = "//input[@type='submit']";
            By buttonCalculateBy = By.xpath(buttonCalculateXPath);
            WebElement buttonCalculateWebElement = driver.findElement(buttonCalculateBy);

            String fieldNameXPath = "//input[@name='name']";
            By fieldNameBy = By.xpath(fieldNameXPath);
            WebElement fieldNameWebElement = driver.findElement(fieldNameBy);

            fieldNameWebElement.sendKeys("Alex");
            buttonCalculateWebElement.click();
            //3. Then
            String errorMessageXPath = "//b";
            By errorMessageBy = By.xpath(errorMessageXPath);
            WebElement errorMessageWebElement = driver.findElement(errorMessageBy);

            String actualErrorMessage = errorMessageWebElement.getText();
            String expectedErrorMessage = "Рост должен быть в диапазоне 50-300 см.\n" +
                    "Вес должен быть в диапазоне 3-500 кг.\n" +
                    "Не указан пол.";

            Assertions.assertEquals(expectedErrorMessage, actualErrorMessage);
        }

        @Test
        public void whenHeightClickSubmitThenErrorMessage() {
            //2. When
            String buttonCalculateXPath = "//input[@type='submit']";
            By buttonCalculateBy = By.xpath(buttonCalculateXPath);
            WebElement buttonCalculateWebElement = driver.findElement(buttonCalculateBy);

            String fieldHeightXPath = "//input[@name='height']";
            By fieldHeightBy = By.xpath(fieldHeightXPath);
            WebElement fieldHeightWebElement = driver.findElement(fieldHeightBy);

            fieldHeightWebElement.sendKeys("50");
            buttonCalculateWebElement.click();
            //3. Then
            String errorMessageXPath = "//b";
            By errorMessageBy = By.xpath(errorMessageXPath);
            WebElement errorMessageWebElement = driver.findElement(errorMessageBy);

            String actualErrorMessage = errorMessageWebElement.getText();
            String expectedErrorMessage = "Не указано имя.\n" +
                    "Вес должен быть в диапазоне 3-500 кг.\n" +
                    "Не указан пол.";

            Assertions.assertEquals(expectedErrorMessage, actualErrorMessage);
        }

        @Test
        public void whenWeightClickSubmitThenErrorMessage() {
            //2. When
            String buttonCalculateXPath = "//input[@type='submit']";
            By buttonCalculateBy = By.xpath(buttonCalculateXPath);
            WebElement buttonCalculateWebElement = driver.findElement(buttonCalculateBy);

            String fieldWeightXPath = "//input[@name='weight']";
            By fieldWeightBy = By.xpath(fieldWeightXPath);
            WebElement fieldWeightWebElement = driver.findElement(fieldWeightBy);

            fieldWeightWebElement.sendKeys("3");
            buttonCalculateWebElement.click();
            //3. Then
            String errorMessageXPath = "//b";
            By errorMessageBy = By.xpath(errorMessageXPath);
            WebElement errorMessageWebElement = driver.findElement(errorMessageBy);

            String actualErrorMessage = errorMessageWebElement.getText();
            String expectedErrorMessage = "Не указано имя.\n" +
                    "Рост должен быть в диапазоне 50-300 см.\n" +
                    "Не указан пол.";

            Assertions.assertEquals(expectedErrorMessage, actualErrorMessage);
        }

        @Test
        public void whenGenderMaleClickSubmitThenErrorMessage() {
            //2. When
            String buttonCalculateXPath = "//input[@type='submit']";
            By buttonCalculateBy = By.xpath(buttonCalculateXPath);
            WebElement buttonCalculateWebElement = driver.findElement(buttonCalculateBy);

            String fieldGenderMaleXPath = "//input[@name='gender'][@value='m']";
            By fieldGenderMaleBy = By.xpath(fieldGenderMaleXPath);
            WebElement fieldGenderMaleWebElement = driver.findElement(fieldGenderMaleBy);

            fieldGenderMaleWebElement.click();
            buttonCalculateWebElement.click();
            //3. Then
            String errorMessageXPath = "//b";
            By errorMessageBy = By.xpath(errorMessageXPath);
            WebElement errorMessageWebElement = driver.findElement(errorMessageBy);

            String actualErrorMessage = errorMessageWebElement.getText();
            String expectedErrorMessage = "Не указано имя.\n" +
                    "Рост должен быть в диапазоне 50-300 см.\n" +
                    "Вес должен быть в диапазоне 3-500 кг.";

            Assertions.assertEquals(expectedErrorMessage, actualErrorMessage);
        }

        @Test
        public void whenGenderFemaleClickSubmitThenErrorMessage() {
            //2. When
            String buttonCalculateXPath = "//input[@type='submit']";
            By buttonCalculateBy = By.xpath(buttonCalculateXPath);
            WebElement buttonCalculateWebElement = driver.findElement(buttonCalculateBy);

            String fieldGenderFemaleXPath = "//input[@name='gender'][@value='f']";
            By fieldGenderFemaleBy = By.xpath(fieldGenderFemaleXPath);
            WebElement fieldGenderFemaleWebElement = driver.findElement(fieldGenderFemaleBy);

            fieldGenderFemaleWebElement.click();
            buttonCalculateWebElement.click();
            //3. Then
            String errorMessageXPath = "//b";
            By errorMessageBy = By.xpath(errorMessageXPath);
            WebElement errorMessageWebElement = driver.findElement(errorMessageBy);

            String actualErrorMessage = errorMessageWebElement.getText();
            String expectedErrorMessage = "Не указано имя.\n" +
                    "Рост должен быть в диапазоне 50-300 см.\n" +
                    "Вес должен быть в диапазоне 3-500 кг.";

            Assertions.assertEquals(expectedErrorMessage, actualErrorMessage);
        }

        @AfterEach
        public void teardown() {
            driver.quit();
        }
    }
