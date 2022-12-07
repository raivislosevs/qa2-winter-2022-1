import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class TicketsTest {
    private final By FROM = By.id("afrom");
    private final By TO = By.id("bfrom");
    private final By GO_BTN = By.xpath(".//span[@class = 'gogogo']");

    private final By AIRPORTS = By.xpath(".//span[@class = 'bTxt']");

    private final By FIRST_NAME = By.id("name");
    private final By LAST_NAME = By.id("surname");
    private final By DISCOUNT = By.id("discount");
    private final By ADULTS = By.id("adults");
    private final By CHILDREN = By.id("children");
    private final By BAG = By.id("bugs");
    private final By FLIGHT = By.id("flight");
    private final By BOOK = By.id("book2");

    private final By GET_PRICE_BTN = By.xpath(".//span[contains(@onclick, 'setLang')]");

    private final By SEAT_NUMBERS = By.xpath(".//div[@class = 'seat']");

    private final By FINAL_BOOK = By.id("book3");

    private final By FINAL_TXT = By.xpath(".//div[contains(@class, 'finalTxt')]");

    private final String DEPARTURE = "RIX";
    private final String ARRIVAL = "SFO";
    private final String NAME = "First name";
    private final String SEAT = "8";

    private WebDriver browser;
    private WebDriverWait wait;

    @Test
    public void reservationCheck() {
        System.setProperty("webdriver.chrome.driver", "C://chromedriver_win32/chromedriver.exe");
        browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get("http://www.qaguru.lv:8089/tickets/");

        wait = new WebDriverWait(browser, Duration.ofSeconds(10));

        select(FROM, DEPARTURE);
        select(TO, ARRIVAL);

        click(GO_BTN);

        List<WebElement> allAirports = browser.findElements(AIRPORTS);

        Assertions.assertEquals(DEPARTURE, allAirports.get(0).getText(), "Departure airport not equal");
        Assertions.assertEquals(ARRIVAL, allAirports.get(1).getText(), "Arrival airports not equal");

        type(FIRST_NAME, NAME);
        type(LAST_NAME, "Last Name");
        type(DISCOUNT, "Discount Code");
        type(ADULTS, "3");
        type(CHILDREN, "2");
        type(BAG, "1");
        select(FLIGHT, "13");

        click(GET_PRICE_BTN);

        wait.until(ExpectedConditions.presenceOfElementLocated(BOOK));

        allAirports = browser.findElements(AIRPORTS);

        Assertions.assertEquals(DEPARTURE, allAirports.get(3).getText(), "Departure airport not equal");
        Assertions.assertEquals(ARRIVAL, allAirports.get(4).getText(), "Arrival airports not equal");
        Assertions.assertEquals(NAME, allAirports.get(2).getText().substring(0, 10));
        System.out.println(allAirports.get(2).getText().substring(0, 10));

        click(BOOK);

        wait.until(ExpectedConditions.presenceOfElementLocated(SEAT_NUMBERS));

        seatChoice(SEAT);

        click(FINAL_BOOK);

        wait.until(ExpectedConditions.presenceOfElementLocated(FINAL_TXT));

        System.out.println(browser.findElement(FINAL_TXT).getText());

    }

    private void select(By locator, String value) {
        WebElement we = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        Select select = new Select(we);
        select.selectByValue(value);
    }

    private void type(By locator, String text) {
        WebElement input = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        input.clear();
        input.sendKeys(text);
    }

    private void click(By locator) {
        WebElement clicker = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        clicker.click();
    }

    private void seatChoice(String seat) {
        List<WebElement> seats = browser.findElements(SEAT_NUMBERS);

        boolean isSeatFound = false;
        for (WebElement number : seats) {
            System.out.println(number.getText());
            if ((number.getText()).equals(seat)) {
                isSeatFound = true;
                number.click();
                break;

            }
        }

        Assertions.assertTrue(isSeatFound, "Seat not found!");
    }
}
