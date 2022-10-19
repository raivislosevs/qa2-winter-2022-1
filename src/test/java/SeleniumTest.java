import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    @Test
    public void openHomePageTest() {
        System.setProperty("webdriver.chrome.driver", "C://chromedriver_win32/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("http://www.discovercars.com/");
    }
}
