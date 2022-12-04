import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {
//Adăugați în clasa RegisterTest un test(o noua metoda) în care să automatizați pașii necesari
// pentru înregistrarea cu succes a unui utilizator nou (deschideți homepage-ul, apăsați pe Account,
// apăsați pe Register, completați toate câmpurile de pe pagina Register - atenție ca email-ul să fie unic,
// bifați opțiunea pentru primirea newsleterr-ului). Folosiți identificatori diferiți pentru câmpurile de pe pagina
// Register (id, name, className). Pe viitor, după învățarea altor identificatori, veți reveni pentru a apăsa și
// butonul Register.
// Apelati metoda aceasta in metoda main din clasa pentru a rula testul.
    public  void registrationSuccessful(){
        System.setProperty("WebDriver.chrome.driver", "resource/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a")).click();
        driver.findElement(By.cssSelector("#firstname")).sendKeys("Ana");

        driver.findElement(By.cssSelector("#lastname")).sendKeys("Pop");
        driver.findElement(By.cssSelector("#email_address")).sendKeys("ana@yahoo.com");
        driver.findElement(By.cssSelector("#password")).sendKeys("AnaAna1");
        driver.findElement(By.cssSelector("#confirmation")).sendKeys("AnaAna1");
        driver.findElement(By.cssSelector("#form-validate > div.fieldset > ul > li.control > label")).click();
        driver.findElement(By.cssSelector("#form-validate > div.buttons-set > button > span > span")).click();
        driver.close();




    }



}
