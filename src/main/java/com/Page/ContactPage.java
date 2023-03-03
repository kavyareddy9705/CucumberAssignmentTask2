package com.Page;

import Commonmethods.CommonFunctions;
import com.JsonClass.ReadingfromJson;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class ContactPage
{
    WebDriver driver;
    CommonFunctions commonFunctions;
    ReadingfromJson readData;
    public ContactPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
        this.driver=driver;
        readData=new ReadingfromJson();
        commonFunctions=new CommonFunctions(driver);
    }
    @FindBy(xpath = "//div[@id='cssmenu']//descendant::a[text()='Contact']")
    WebElement contactbutton;
    @FindBy(xpath = "//input[@name='name']")
    WebElement nameinput;
    @FindBy(xpath = "//input[@name='email']")
    WebElement emailinput;
    @FindBy(name = "message")
    WebElement textmessagefield;
    @FindBy(xpath = "//div[@class='thumbCellSplit']//descendant::button")
    WebElement sendbutton;
    @FindBy(xpath = "//div[@class='simpleThumbGrid']//h1[text()='Thanks for your Message']")
    WebElement successfullmessage;

    public void homePage()
    {
        driver.get("https://compendiumdev.co.uk/");
    }
    public void contactModule()
    {
        contactbutton.click();
    }
    public void FormFilling() throws Exception {

        commonFunctions.sendKeysOnWebElement(nameinput, "Kavya");
        commonFunctions.sendKeysOnWebElement(emailinput,"k@j.com");
        commonFunctions.sendKeysOnWebElement(textmessagefield,"hello ???");
        commonFunctions.ClickingOnWebElement(sendbutton);

    }
     public String verifyformsubmit()
     {
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
         String expected=successfullmessage.getText();
         return expected;
     }
}
