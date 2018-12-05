package TestRunner;
import StepDefinitions.MyStepdefs;
import Support.Driver;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/Resources/Feature.feature"},
        glue = {"StepDefinitions"}
)
public class MyRunner {
    @BeforeClass
    public static void setup(){
        System.out.println("Run cukes test IT beforescenario hook2");
        Driver.initialiseDriver();

    }

    @AfterClass
    public static void teardown(){
        System.out.println("Run cukes test IT beforescenario hook3");
        Driver.driver.quit();
    }
}
