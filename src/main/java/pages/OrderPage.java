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

    // клик по кнопке "Да"
    public void clickYesButton() {
        driver.findElement(By.xpath(".//button[text()='Да']")).click();
    }

    //клик по кнопке "Далее/Заказать"
    public void clickOrderButton() {
        driver.findElement(By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']")).click();
    }

    // ввод коммента
    public void fieldComment(String comment) {
        driver.findElement(By.cssSelector("input[placeholder='Комментарий для курьера']")).sendKeys(comment);
    }

    // селектор цвета
    public void fieldColor() {
        driver.findElement(By.cssSelector("input[id='grey']")).click();
    }

    // выбор времени бронирования
    public void fieldTerm() {
        driver.findElement(By.cssSelector(".Dropdown-root")).click();
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".Dropdown-menu")));
        driver.findElement(By.xpath(".//div[text()='четверо суток']")).click();
    }

    // выбор даты
    public void fieldDateclick() {
        driver.findElement(By.cssSelector("input[placeholder='* Когда привезти самокат']")).sendKeys(Keys.ENTER);
    }

    // клик enter
    public void fieldDate() {
        driver.findElement(By.cssSelector("input[placeholder='* Когда привезти самокат']")).click();
    }


    // клик в поле выбора станции метро
    public void clickFieldMetroStation() {
        driver.findElement(By.cssSelector(".select-search__option")).click();
    }

    // выбор первой станции метро
    public void fieldMetroStation() {
        driver.findElement(By.cssSelector("input[placeholder='* Станция метро']")).click();

        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".select-search__select")));
    }


}
