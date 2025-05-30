package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;

public class MainPage {
    private final WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }


// клик по кнопке Заказать в хэдэре
    public void clickOnTheOrderButton() {
        driver.findElement(By.cssSelector(".Button_Button__ra12g")).click();
    }
// открытие сайта
    public void openPage() {
        driver.get("https://qa-scooter.praktikum-services.ru/");
    }
    // проверка открытия модалки заказа
    public void modalIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10)); // Ждем максимум 10 секунд
        WebElement modalWindow = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".Order_Modal__YZ-d3")));

        Assert.assertTrue("Модальное окно не отображается.", modalWindow.isDisplayed());
    }
// клик по Заказать в середине страницы
    public void buttonClickPage() {
        driver.findElement(By.cssSelector(".Button_Button__ra12g.Button_Middle__1CSJM")).click();
    }
// скролл до кнопки Заказать
    public void scrollToButton() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(By.cssSelector(".Button_Button__ra12g.Button_Middle__1CSJM")));
    }

    // клик по 4 аккордеону в разделе «Вопросы о важном»
   public void clickAccordionFour() {

           driver.findElement(By.cssSelector("#accordion__heading-3")).click();
String actual = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
           assertEquals(By.cssSelector("#accordion__panel-3").findElement(driver).getText(), actual);
       }

    // клик по 2 аккордеону в разделе «Вопросы о важном»
    public void clickAccordionTwo() {

        driver.findElement(By.cssSelector("#accordion__heading-1")).click();
        String actual = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
        assertEquals(By.cssSelector("#accordion__panel-1").findElement(driver).getText(), actual);
    }
   }
