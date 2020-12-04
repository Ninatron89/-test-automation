package tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.CalcPage;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class GoogleCalcTests {

    public static WebDriver driver;
    public static CalcPage calcPage;

    @BeforeAll
    public static void init() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(300, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(300, TimeUnit.SECONDS);
        calcPage = new CalcPage(driver);
    }

 @Test
    public void test1() throws InterruptedException {
        driver.get("http://google.ru");
        driver.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys("Калькулятор", Keys.ENTER);
        Thread.sleep(2000);
        calcPage.buttonOpenBracket.click();
        calcPage.buttonOne.click();
        calcPage.buttonPlus.click();
        calcPage.buttonTwo.click();
        calcPage.buttonCloseBracket.click();
        calcPage.buttonMultiply.click();
        calcPage.buttonThree.click();
        calcPage.buttonMinus.click();
        calcPage.buttonFour.click();
        calcPage.buttonZero.click();
        calcPage.buttonSplit.click();
        calcPage.buttonFive.click();
        calcPage.buttonEqually.click();
        Thread.sleep(1000);
        assertEquals("(1 + 2) × 3 - 40 ÷ 5 =", calcPage.formula.getText());
        assertEquals("1", calcPage.response.getText());
    }

    @Test
    public void test2() throws InterruptedException {
        driver.get("http://google.ru");
        driver.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys("Калькулятор", Keys.ENTER);
        Thread.sleep(2000);
        calcPage.buttonSix.click();
        calcPage.buttonSplit.click();
        calcPage.buttonZero.click();
        calcPage.buttonEqually.click();
        Thread.sleep(1000);
        assertEquals("6 ÷ 0 =", calcPage.formula.getText());
        assertEquals("Infinity", calcPage.response.getText());
    }

   @Test
    public void test3() throws InterruptedException {
        driver.get("http://google.ru");
        driver.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys("Калькулятор", Keys.ENTER);
        Thread.sleep(2000);
        calcPage.buttonSin.click();
        calcPage.buttonEqually.click();
        Thread.sleep(1000);
        assertEquals("sin() =", calcPage.formula.getText());
        assertEquals("Error", calcPage.response.getText());
    }

    @AfterAll
    public static void teardown() {
        driver.quit();
    }
}