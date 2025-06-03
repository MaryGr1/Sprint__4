package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormSteps {

    private final WebDriver driver;

    public FormSteps(WebDriver driver) {
        this.driver = driver;
    }

    private By nameField = By.cssSelector("input[placeholder='* Имя']");
    private By lastNameField = By.cssSelector("input[placeholder='* Фамилия']");
    private By fieldAddress = By.cssSelector("input[placeholder='* Адрес: куда привезти заказ']");
    private By fieldPhone = By.cssSelector("input[placeholder='* Телефон: на него позвонит курьер']");
//ввод адреса
    public void fieldAddress(String address) {
        driver.findElement(By.cssSelector("input[placeholder='* Адрес: куда привезти заказ']")).sendKeys(address);
    }

    // ввод фамилии
    public void fieldLastName(String lastname) {
        driver.findElement(By.cssSelector("input[placeholder='* Фамилия']")).sendKeys(lastname);
    }

    // ввод имени
    public void fieldName(String name) {
        driver.findElement(By.cssSelector("input[placeholder='* Имя']")).sendKeys(name);
    }
// ввод телефона
    public void fieldPhone(String phone) {
        driver.findElement(By.cssSelector("input[placeholder='* Телефон: на него позвонит курьер']")).sendKeys(phone);
    }


    public void login (String name, String lastname, String address, String phone)
    {
        fieldName(name);
        fieldLastName(lastname);
        fieldAddress(address);
        fieldPhone(phone);
    }

}

