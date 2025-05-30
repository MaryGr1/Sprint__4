package Locations;


import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import pages.MainPage;
import pages.OrderPage;
import steps.FormSteps;

public class test2 {

    @Rule
    public DriverFactory driverFactory = new DriverFactory();

    

    @Test
    public void test() throws InterruptedException {
        WebDriver driver = driverFactory.getDriver();
        MainPage mainPage = new MainPage(driver);
        OrderPage orderPage = new OrderPage(driver);
        FormSteps steps = new FormSteps(driver);
        mainPage.openPage();
        mainPage.clickOnTheOrderButton();
        steps.login("Мария", "Иванова","Мира, 32А", "89001234567");
        orderPage.fieldMetroStation();
        orderPage.clickFieldMetroStation();
        orderPage.clickOrderButton();
        orderPage.fieldDate();
        orderPage.fieldDateclick();
        orderPage.fieldTerm();
        orderPage.fieldColor();
        orderPage.fieldComment("12345");
        orderPage.clickOrderButton();
        orderPage.clickYesButton();
        mainPage.modalIsDisplayed();


    }

}

