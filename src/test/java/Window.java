import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {

     WebDriver driver = new ChromeDriver();

     @Test
    public void LessonsOne(){

         driver.get("https://ru.hexlet.io/");
         driver.manage().window().maximize();

         String getUrl = driver.getCurrentUrl();
         Assert.assertEquals("https://ru.hexlet.io/", getUrl);

         String getTitle = driver.getTitle();
         Assert.assertEquals("Хекслет — больше чем школа программирования. Онлайн курсы, сообщество программистов", getTitle);

         String getPage = driver.getPageSource();


         System.out.println(getPage);

     }

}
