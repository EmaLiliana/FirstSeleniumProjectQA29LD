import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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
        driver.findElement(By.cssSelector("li.nav-5 a")).click();
        driver.findElement(By.cssSelector(".actions a")).click();
        driver.findElement(By.cssSelector(".swatch-label img")).click();
        driver.findElement(By.cssSelector("#configurable_swatch_size span")).click();
        driver.findElement(By.cssSelector(".add-to-cart-buttons span span")).click();
        driver.findElement(By.cssSelector("li span span")).click();
        driver.findElement(By.cssSelector("li.control label")).click();
        driver.findElement(By.cssSelector(".buttons-set span span")).click();
        driver.findElement(By.id("billing:firstname")).sendKeys("Pop");
        driver.findElement(By.cssSelector("#opc-billing div:nth-child(3) input")).sendKeys("Pop");
        driver.findElement(By.cssSelector(".field.name-lastname input")).sendKeys("Ana");
        driver.findElement(By.cssSelector("#billing\\:email")).sendKeys("AnaAna1");
        driver.findElement(By.cssSelector("#billing\\:street1")).sendKeys("Ion");
        driver.findElement(By.cssSelector("#billing\\:city")).sendKeys("Cluj");




        WebElement requiredFields= driver.findElement(By.cssSelector("#co-billing-form p"));
        Assert.assertTrue(requiredFields.isDisplayed());


    }
    @After
    public void quit(){
        driver.close();
    }
}
