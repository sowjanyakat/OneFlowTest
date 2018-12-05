package Support;

import Selectors.WebElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    public static WebDriver driver;


    /**
     * Fires up a Chrome browser which is then used by the pageObjects to trigger browser events.
     */

    public static void initialiseDriver() {

        System.out.println("Called intialise Driver");
        System.setProperty("webdriver.chrome.driver",WebElements.webDriverPath+"chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(WebElements.ReferenceUrl);
    }
}
