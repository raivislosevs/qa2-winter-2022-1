import org.openqa.selenium.By;

public class CarRental {

    private final By CURRENCY_BTN = By.id("currentCurrency");
    private final By LOGO = By.xpath(".//img[contains(@alt, 'Best')]");
    private final By LOGIN = By.xpath(".//a[@class = 'navigation-link action my-booking trigger-login-modal pointer']");
    private final By UNDER_TITLE = By.xpath(".//div[@class = 'home-caption']");
    private final By DATE_TIME = By.xpath(".//div[contains(@class, 'fake-field clearfix')]");
    private final By LOCATION = By.xpath(".//span[@class = 'sb-residence-text']");
    private final By SEARCH_BTN = By.id("location-submit");
    private final By REVIEW_ARROW_LEFT = By.id("review-arrow-left");
    private final By REWIEVS = By.xpath(".//div[@class= 'tp-widget-review']");
    //TODO 3rd locator to be found in col-12 ( ask Dima )
    private final By MID_TITLE = By.xpath(".//div[@class = 'col-12']");

    private final By CARS = By.xpath(".//div[@class = 'car-top-filter-item car-groups-item filtering-event init']");
    private final By FORWARD_BTN_CARS = By.xpath(".//div[@class = 'car-top-filter-control prev']");
    private final By PRICE_DRP_DWN = By.xpath(".//a[contains(@class, 'dc-ui dropdown-toggle')]");
    private final By SHOWING_CARS = By.xpath(".//span[@class = 'showing-cars']");
    private final By BAG_AMOUNT = By.xpath(".//span[text() = '1 bag']");
    private final By SPECIAL_OFFERS = By.xpath(".//div[@class = 'flt-type']");
    private final By MIN_PRICE = By.xpath(".//span[@class = 'min-price']");
    private final By RENTAL_CONDITIONS = By.xpath(".//a[@class = 'open-modal search-index trigger-gtm-rc rental-conditions with-logo']");
    private final By VIEW_BTN = By.xpath(".//div[@class = 'ca-table-cell top']");
    private final By GASOLINE = By.xpath(".//label[@class = 'filter-fuel-type my-checkbox-label default filtering-event']");
    private final By SEATS = By.xpath(".//label[@class = 'filter-number-of-seats my-checkbox-label default filtering-event']");
    private final By RATING = By.xpath(".//div[@class = 'supplier-rating']");
    private final By ITEM_PRICE = By.xpath(".//div[@class = 'price-item-price-main']");

    private final By LOADING_DOTS = By.xpath(".//div[@class = 'lds-ellipsis v2']");
    private final By SEARCHING_TEXT = By.xpath(".//div[@class = 'mb-8 text-24 text-bold text-center']");
    private final By OFFER_TEXT = By.xpath(".//div[@class = 'mb-24 text-center']");

}
