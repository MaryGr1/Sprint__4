package stepsLogin;

import org.openqa.selenium.WebDriver;
import pages.OrderPage;


public class FormSteps {

    private final WebDriver driver;
    private final OrderPage order;

    public FormSteps(WebDriver driver) {
        this.driver = driver;
        this.order = new OrderPage(driver);
    }


    public void login (String name, String lastname, String address, String phone)
    {
        order.fieldName(name);
        order.fieldLastName(lastname);
        order.fieldAddress(address);
        order.fieldPhone(phone);
    }

}

