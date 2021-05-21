package steps;

import cucumber.api.java.en.Then;
import elements.PageContact;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import static methods.ActionElement.*;

public class StepsContact {

    public static WebDriver driver = Hooks.driver;
    public static String cellphoneNum;

    @Then("^I get cellphone number.")
    public void getCellphone() throws InterruptedException, Exception {
        explicitWait(PageContact.CELLPHONE);
        cellphoneNum = driver.findElement(PageContact.CELLPHONE).getText();
    }

    @Then("^I fill the form.")
    public void fillForm() throws InterruptedException, Exception {
        typeText(PageContact.NAME, "Rene");
        typeText(PageContact.LASTNAME, "Montilla");
        typeText(PageContact.EMAIL, "rene@testing.com");
        typeText(PageContact.PHONE_NUMBER, "1188339944");
        typeText(PageContact.MESSAGE, cellphoneNum);
        screenShot("FormularioLleno");

    }

    @Then("^Send form.")
    public void sendForm() throws InterruptedException, Exception {
        clickElement(PageContact.BTN_SEND);
        /*Thread.sleep(3000);
        explicitWait(PageContact.NOTIFY);
        String notification = driver.findElement(PageContact.NOTIFY).getText();
        Assert.assertEquals(notification,"¡Mensaje enviado!");*/
    }
}
