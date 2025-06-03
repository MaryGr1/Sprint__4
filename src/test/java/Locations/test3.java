package Locations;

import org.junit.Rule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.MainPage;
import pages.OrderPage;
import steps.FormSteps;

public class test3 {

    @Rule
    public DriverFactory driverFactory = new DriverFactory();

    @Test
    public void test() throws InterruptedException {
        WebDriver driver = driverFactory.getDriver();
        MainPage mainPages = new MainPage(driver);
        OrderPage orderPages = new OrderPage(driver);
        FormSteps step = new FormSteps(driver);
        mainPages.openPage();
        mainPages.scrollToButton();
        mainPages.buttonClickPage();
        step.login("Мария", "Иванова","Мира, 32А", "89001234567");
        orderPages.fieldMetroStation();
        orderPages.clickFieldMetroStation();
        orderPages.clickOrderButton();
        orderPages.fieldDate();
        orderPages.fieldDateclick();
        orderPages.fieldTerm();
        orderPages.fieldColor();
        orderPages.fieldComment("12345");
        orderPages.clickOrderButton();
        orderPages.clickYesButton();
        mainPages.modalIsDisplayed();
    }




}
