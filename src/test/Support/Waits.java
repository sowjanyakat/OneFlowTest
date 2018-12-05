package Support;

import java.util.concurrent.TimeUnit;

public class Waits extends Driver {
    public static void implicitWait()
    {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

}
