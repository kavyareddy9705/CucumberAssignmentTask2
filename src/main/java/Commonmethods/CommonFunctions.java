package Commonmethods;

import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CommonFunctions
{
     WebDriver driver;
    public CommonFunctions(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
        this.driver=driver;
    }
    public void ClickOnElement(WebElement element)
    {
        try
        {
            element.click();
        }
        catch (NoSuchElementException nse)
        {
            nse.printStackTrace();
        }
        catch (ElementClickInterceptedException eci)
        {
            eci.printStackTrace();
        }
        catch (ElementNotInteractableException ene)
        {
            ene.printStackTrace();
        }
    }
    public void clickingOnWebElement(WebElement element)
    {
        WebDriverWait webwait=new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement elements=null;
        elements=webwait.until(ExpectedConditions.elementToBeClickable(element));
        elements.click();
    }
    public void sendKeysOnWebElement(WebElement element, String text)
    {
        element.sendKeys(text);
    }
    public void selectFromDropDown(WebElement element,String text)
    {
        Select select=new Select((element));
        select.selectByVisibleText(text);
    }
    public void AcceptAlerts(WebDriver driver)

    {
        driver.switchTo().alert().accept();
    }
}
