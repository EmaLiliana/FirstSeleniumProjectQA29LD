import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.By.cssSelector;

public class AddToCart {

    private WebDriver driver;

    @Before
    public void initializationDriver() {
        System.setProperty("WebDriver.chrome.driver", "resource/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
    }
    @Test
    public void addProductToCart(){
        driver.findElement(cssSelector("li.nav-5 a")).click();
        driver.findElement(cssSelector(".actions a")).click();
        driver.findElement(cssSelector(".swatch-label img")).click();
        driver.findElement(cssSelector("#configurable_swatch_size span")).click();
        driver.findElement(cssSelector(".add-to-cart-buttons span span")).click();
        WebElement recentlyAddedItem = driver.findElement(cssSelector(".header-minicart .count"));
        Assert.assertTrue(recentlyAddedItem.isDisplayed());

    }
    @After
    public void quit(){
        driver.quit();
    }
}
