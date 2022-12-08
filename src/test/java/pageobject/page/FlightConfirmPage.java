package pageobject.page;

import org.openqa.selenium.By;
import pageobject.BaseFunc;

public class FlightConfirmPage {

    private final By FINAL_TXT = By.xpath(".//div[contains(@class, 'finalTxt')]");

    private BaseFunc baseFunc;

    public FlightConfirmPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public void confirm() {
        baseFunc.printTextElement(FINAL_TXT);

    }

}
