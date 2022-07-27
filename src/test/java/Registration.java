import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

import static java.lang.Thread.sleep;

public class Registration {

    private By buttonJoinFree = By.xpath("//*[@id=\"app\"]/div/header/nav/div[5]/a[2]");

    private By inputFirstName = By.xpath("//*[@id=\"user_first_name\"]");
    private By inputLastName = By.xpath("//*[@id=\"user_last_name\"]");
    private By inputEmail = By.xpath("//*[@id=\"user_email\"]");
    private By inputUsername = By.xpath("//*[@id=\"user_username\"]");
    private By inputPassword = By.xpath("//*[@id=\"user_password\"]");
    private By buttonCopy = By.xpath("//*[@id=\"tm-body\"]/div[1]/div/div/div[2]/div[1]/form/div[2]/button");

    private By buttonJoin = By.xpath("//*[@id=\"new_user\"]/div[5]/a");

    @Test

    public void registration() throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://unsplash.com/");
        driver.manage().window().maximize();

        driver.findElement(buttonJoinFree).click();
        sleep(3000);

        driver.findElement(inputFirstName).sendKeys("Random");
        driver.findElement(inputLastName).sendKeys("RandomTest");

        driver.switchTo().newWindow(WindowType.TAB).get("https://temp-mail.org/ru/");
        sleep(5000);
        driver.findElement(buttonCopy).click();

        sleep(3000);
        ArrayList<String> newTab = new ArrayList (driver.getWindowHandles());
        driver.switchTo().window(newTab.get(0));

        driver.findElement(inputEmail).sendKeys(Keys.LEFT_CONTROL + "v");
        driver.findElement(inputUsername).sendKeys("Random123@");
        driver.findElement(inputPassword).sendKeys("Test1234");

        driver.findElement(buttonJoin).click();
        //driver.quit();


    }
}
