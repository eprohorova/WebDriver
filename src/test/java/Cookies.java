import org.junit.Test;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Cookies {
    WebDriver driver = new ChromeDriver();

    @Test

    public void cookies(){

        driver.get("https://sait.kakoy-to/user");
        Cookie getCookie = new Cookie("user_session","6bwDea8lAyxEGsnKOdX6INkV0-I2RvS2OHFUI");
        driver.manage().addCookie(getCookie);
        driver.navigate().refresh();

        Set<Cookie> cookiesOll = driver.manage().getCookies();
        System.out.println(cookiesOll);
    }
}
