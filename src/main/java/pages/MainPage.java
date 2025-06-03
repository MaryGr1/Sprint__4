package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class MainPage {
    private final WebDriver driver;


    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

// кнопка Заказать в хэдере

    private By orderButtonHeder = By.cssSelector(".Button_Button__ra12g");

// кнопка Посмотреть статус (после успешного заказа)

    private By statusButton = By.cssSelector(".Order_NextButton__1_rCA");

    // кнопка Заказать на странице

    private By orderButton = By.cssSelector(".Button_Button__ra12g.Button_Middle__1CSJM");

// кнопка Да все привыкли

    private By cookieButton = By.cssSelector(".App_CookieButton__3cvqF");

    // клик по кнопке куки

    public void clickCookieButton()
    {
        driver.findElement(cookieButton).click();
    }

// клик по кнопке Заказать в хэдэре
    public void clickOnTheOrderButton() {
        driver.findElement(orderButtonHeder).click();
    }

// открытие сайта
    public void openPage() {

        driver.get("https://qa-scooter.praktikum-services.ru/");
    }

    // проверка открытия модалки заказа
    public void modalIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10)); // Ждем максимум 10 секунд
        WebElement modalWindow = wait.until(
                ExpectedConditions.visibilityOfElementLocated(statusButton));

    }
// клик по Заказать в середине страницы
    public void buttonClickPage() {
        driver.findElement(orderButton).click();
    }

// скролл до кнопки Заказать
    public void scrollToButton() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(orderButton));
    }


    public void clickAccordionAndCheckText(int index, String expectedText) {
        driver.findElement(By.cssSelector("#accordion__heading-" + index)).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        By panelLocator = By.cssSelector("#accordion__panel-" + index);
        wait.until(ExpectedConditions.visibilityOfElementLocated(panelLocator));
        String actualText = driver.findElement(panelLocator).getText();
        assertEquals(expectedText, actualText);
    }

}