package Steps;
import com.Page.ContactPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
public class StepsClass
{
    WebDriver driver;
    ContactPage contactPage;
    @Before
    public void initializeBrowser(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        contactPage=new ContactPage(driver);
    }
    @After
    public void kisssession()
    {
        driver.quit();
    }
    @Given("user on Home page")
    public void user_on_home_page() {
    contactPage.homePage();

    }

    @When("click on the contact")
    public void click_on_the_contact() {
        contactPage.contactModule();
    }

    @Then("fill the form")
    public void fill_the_form() throws Exception {
        //Thread.sleep(3330);
         contactPage.FormFilling();
    }

    @Then("verify form is submitted successfully")
       public void verify_form_is_submitted_successfully() {
       String expectedResult= contactPage.verifyformsubmit();
       String actualresult="Thanks for your Message";
       Assert.assertEquals(expectedResult,actualresult);
    }
}
