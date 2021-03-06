package steps;

import cucumber.api.java.en.*;
import elements.PageIndex;
import org.openqa.selenium.WebDriver;

import java.io.FileReader;
import java.util.Properties;

import static methods.ActionElement.*;


public class StepDefinitions {

    public static WebDriver driver = Hooks.driver;


    @Given("^I want to navigate in URL: \"(.*)\"")
    public void sURL(String Url) throws InterruptedException, Exception {
        driver.get(Url);
        Thread.sleep(3000);
    }

    @Given("^I want to navigate in the site: \"(.*)\"")
    public void setURL(String Url) throws InterruptedException, Exception {

        //String baseUrl = Url;
        Properties prop = new Properties();
        FileReader reader = new FileReader("src/test/java/steps/Tests.properties");
        prop.load(reader);
        if (Url.equals("Somos Makers")) {
            driver.get(prop.getProperty("URL_MAKERS"));

        } else {
            throw new RuntimeException("URL not exist");
        }
    }

    @When("^I select to the Menu Contacto.")
    public void selectText() throws InterruptedException, Exception {
        clickElement(PageIndex.MENU_CONTACT);
        Thread.sleep(3000);

    }


}
