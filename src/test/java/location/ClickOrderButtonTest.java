package location;


import org.junit.Rule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.MainPage;
import pages.OrderPage;
import stepsLogin.FormSteps;

public class ClickOrderButtonTest {

    @Rule
    public DriverFactory driverFactory = new DriverFactory();

    

    @Test
    public void clickOrderButtoninHeder() throws InterruptedException {
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

    @Test
    public void ClickOrderButton() throws InterruptedException {
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

