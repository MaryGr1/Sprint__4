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


  private By headingLocator;
    private By panelLocator;

    // Метод для клика по аккордеону и проверки текста
    public void clickAccordionAndCheckText(int index, String expectedText) {

        headingLocator = By.cssSelector("#accordion__heading-" + index);
        panelLocator = By.cssSelector("#accordion__panel-" + index);


        // Кликаем по заголовку аккордеона
        driver.findElement(headingLocator).click();


        // Ожидаем, пока панель аккордеона станет видимой
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(panelLocator));


        // Получаем актуальный текст из панели аккордеона
        String actualText = driver.findElement(panelLocator).getText();


        // Проверяем, что актуальный текст совпадает с ожидаемым
        assertEquals(expectedText, actualText);
    }

}