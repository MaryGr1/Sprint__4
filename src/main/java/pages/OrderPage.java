package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class OrderPage {
    private final WebDriver driver;

    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }
// кнопка ДА
    private By yesButton = By.xpath(".//button[text()='Да']");

// кнопка Далее/Заказать

    private By orderButton = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");

// поле комментария

    private By comment = By.cssSelector("input[placeholder='Комментарий для курьера']");

// серый цвет самоката

    private By greyColor = By.cssSelector("input[id='grey']");

// бронирование на четверо суток

    private By fourDays = By.xpath(".//div[text()='четверо суток']");

// поле когда привезти самокат

 private By calendar = By.cssSelector("input[placeholder='* Когда привезти самокат']");

 // поле станции метро

    private By metroStation = By.cssSelector("input[placeholder='* Станция метро']");

    // поле срок аренды

    private By rentalPeriod= By.cssSelector(".Dropdown-root");

    // селектор выбора срока

    private By selectorRentalPeriod= By.cssSelector(".Dropdown-menu");

    // селектор выбора станции

    private By selectorMetroStation = By.cssSelector(".select-search__select");




    // клик по кнопке "Да"
    public void clickYesButton() {
        driver.findElement(yesButton).click();
    }

    //клик по кнопке "Далее/Заказать"
    public void clickOrderButton() {
        driver.findElement(orderButton).click();
    }

    // ввод коммента
    public void fieldComment(String text) {
        driver.findElement(comment).sendKeys(text);
    }

    // селектор цвета
    public void fieldColor() {
        driver.findElement(greyColor).click();
    }

    // выбор времени бронирования
    public void fieldTerm() {
        driver.findElement(rentalPeriod).click();
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(selectorRentalPeriod));
        driver.findElement(fourDays).click();
    }

    // выбор даты
    public void fieldDateclick() {
        driver.findElement(calendar).sendKeys(Keys.ENTER);
    }

    // клик enter
    public void fieldDate() {
        driver.findElement(calendar).click();
    }


    // клик в поле выбора станции метро
    public void clickFieldMetroStation() {
        driver.findElement(By.cssSelector(".select-search__option")).click();
    }

    // выбор первой станции метро
    public void fieldMetroStation() {
        driver.findElement(metroStation).click();

        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(selectorMetroStation));
    }


}
