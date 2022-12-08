package pageobject;

import org.junit.jupiter.api.Test;
import pageobject.page.FlightConfirmPage;
import pageobject.page.HomePage;
import pageobject.page.PassengerInfoPage;

public class TicketsTestsOnPage {
    private final String URL = "http://www.qaguru.lv:8089/tickets/";
    private final String FROM_AIRPORT = "RIX";
    private final String TO_AIRPORT = "SFO";
    private final String NAME = "My name";
    private final String SURENAME = "Last name";
    private final String THIS_DISC = "Good discount";
    private final String GROWNUPS = "2";
    private final String KIDS = "1";
    private final String LUGGAGE = "4";
    private final String DATE = "13";
    private final String SEAT = "8";

    private BaseFunc baseFunc = new BaseFunc();

    @Test
    public void successfulRegistrationTest() {
        baseFunc.openUrl(URL);
        HomePage homePage = new HomePage(baseFunc);
        homePage.selectAirports(FROM_AIRPORT, TO_AIRPORT);

        PassengerInfoPage infoPage = new PassengerInfoPage(baseFunc);
        infoPage.passengerInfo(NAME, SURENAME, THIS_DISC, GROWNUPS, KIDS, LUGGAGE, DATE);
        infoPage.bookFlight();

        infoPage.seatSelector(SEAT);
        infoPage.finalBook();

        FlightConfirmPage flightConfirmPage = new FlightConfirmPage(baseFunc);
        flightConfirmPage.confirm();

        baseFunc.closeBrowser();
    }
}
