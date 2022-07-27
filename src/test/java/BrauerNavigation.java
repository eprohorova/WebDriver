import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class BrauerNavigation {

    WebDriver driver = new ChromeDriver();

    @Test

    public void brasserieNavigation() throws InterruptedException {

        driver.get("https://loon.site/");
        sleep(3000);
        driver.manage().window().maximize();
        sleep(3000);

        driver.navigate().to("https://magdeleine.co/");
        sleep(3000);
        driver.navigate().back();
        sleep(3000);

        String getTitle = driver.getTitle();
        sleep(3000);
        Assert.assertEquals("Бесплатный фотосток без регистрации на русском, фото без авторских прав – Loon.site", getTitle);

        driver.navigate().forward();
        sleep(3000);

        String getUrl = driver.getCurrentUrl();
        Assert.assertEquals("https://magdeleine.co/", getUrl);

        driver.navigate().refresh();
        sleep(3000);
        //driver.navigate().notify();

        driver.close();
    }
}
