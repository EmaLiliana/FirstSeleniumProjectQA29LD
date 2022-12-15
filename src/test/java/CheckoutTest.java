import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.By.cssSelector;
import static org.openqa.selenium.By.id;

public class CheckoutTest {
    private WebDriver driver;

    @Before
    public void initializationDriver(){
        System.setProperty("WebDriver.chrome.driver", "resource/chromedriver");
        driver=new ChromeDriver();
        driver.manage().window();
        driver.get("http://testfasttrackit.info/selenium-test/");
    }
    @Test
    public void checkoutProduct(){
        driver.findElement(cssSelector("li.nav-5 a")).click();
        driver.findElement(cssSelector(".actions a")).click();
        driver.findElement(cssSelector(".swatch-label img")).click();
        driver.findElement(cssSelector("#configurable_swatch_size span")).click();
        driver.findElement(cssSelector(".add-to-cart-buttons span span")).click();
        driver.findElement(cssSelector("li span span")).click();
        driver.findElement(cssSelector("li.control label")).click();
        driver.findElement(cssSelector(".buttons-set span span")).click();
        driver.findElement(id("billing:firstname")).sendKeys("Pop");
        driver.findElement(By.cssSelector("ul [title=\"Last Name\"]")).sendKeys("Ana");
        driver.findElement(By.cssSelector("[title=\"Email Address\"]")).sendKeys("ana@yahoo.com");
        driver.findElement(By.cssSelector("li.wide input")).sendKeys("Pascu Street");
        driver.findElement(By.cssSelector("#billing\\:city")).sendKeys("Cluj");
        driver.findElement(By.cssSelector(".validate-select.required-entry option[value=\"1\"]")).click();
        driver.findElement(By.cssSelector("#billing\\:postcode")).sendKeys("123456");
        driver.findElement(By.cssSelector("#billing\\:country_id > option:nth-child(212)")).click();
        driver.findElement(By.cssSelector("#billing\\:telephone")).sendKeys("0000884596");
        driver.findElement(By.cssSelector("#billing-buttons-container span span")).click();
  //      driver.findElement(By.cssSelector("#shipping-method-buttons-container span span")).click();
  //      driver.findElement(By.cssSelector("#payment-buttons-container span span")).click();
  //      driver.findElement(By.cssSelector(".btn-checkout span span")).click();


  //      WebElement grandTotal= driver.findElement(cssSelector("strong span.price"));
  //      Assert.assertTrue(grandTotal.isDisplayed());

  //      WebElement checkoutSuccsessMessage = driver.findElement(cssSelector(".col-main h1"));
  //      String expectedText = "YOUR ORDER HAS BEEN RECEIVED.";
  //      String actualText = checkoutSuccsessMessage.getText();
   //     Assert.assertEquals(actualText,expectedText);


        WebElement requiredFields= driver.findElement(cssSelector("#co-billing-form p"));
        Assert.assertTrue(requiredFields.isDisplayed());


    }
    @After
    public void quit(){
        driver.close();
    }
}
