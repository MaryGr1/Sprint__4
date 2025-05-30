import Locations.DriverFactory;
import org.junit.Rule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.MainPage;

public class accordionTest {

    @Rule
    public DriverFactory driverFactory = new DriverFactory();

    @Test
    public void testFourAccordion() throws InterruptedException {
        WebDriver driver = driverFactory.getDriver();
        MainPage mainPagesy = new MainPage(driver);
        mainPagesy.openPage();
        mainPagesy.scrollToButton();
        mainPagesy.clickAccordionFour();

    }

@Test
public void testTwoAccordion() throws InterruptedException {
    WebDriver driver = driverFactory.getDriver();
    MainPage mainPagesy = new MainPage(driver);
    mainPagesy.openPage();
    mainPagesy.scrollToButton();
    mainPagesy.clickAccordionTwo();

}



}
