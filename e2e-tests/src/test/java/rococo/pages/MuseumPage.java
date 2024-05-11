package rococo.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import org.openapitools.client.model.NewMuseumDto;
import org.openapitools.client.model.MuseumDto;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MuseumPage extends BasePage<MuseumPage> {
    private final SelenideElement createMuseum = $(byText("Добавить музей"));
    private final SelenideElement editHeader = $(byText("Редактировать музей"));
    private final SelenideElement museumTab = $("a[href='/museum']");
    private final SelenideElement museumFilterInput = $("input[title='Искать музей...']");
    private final SelenideElement museumInfoHeader = $("header[class='card-header text-center font-bold']");
    private final SelenideElement museumInfoCountry =  $("div[class='text-center']");
    private final SelenideElement iconSearch = $("img[alt='Иконка поиска']");
    private final SelenideElement editButton = $("button[data-testid='edit-museum']");
    private final ElementsCollection museumCollection = $$("div[class='w-100']");

    public static final String URL = CFG.frontUrl() + "/museum";


    @Step("fill museum fields with data")
    public MuseumPage fillMuseumFieldsWithData(MuseumDto museumDto, String country) {
        $("input[name='title']").setValue(museumDto.getTitle());
        $(byText(country)).click();
        $("input[name='city']").setValue(country);
        $("input[name='photo']").uploadFromClasspath(museumDto.getPhoto());
        $("textarea[name='description']").setValue(museumDto.getDescription());
        return this;
    }

    @Step("click submit button")
    public MuseumPage clickSubmitButton() {
        $("button[type='submit']").click();
        return this;
    }

    @Step("click create painting button")
    public MuseumPage clickCreatePaintingButton() {
        createMuseum.click();
        return this;
    }


    @Step("find museum on museum page by UI")
    public MuseumPage findMuseumOnMuseumsPage(String museumTitle) {
        museumTab.click();
        museumFilterInput.setValue(museumTitle);
        iconSearch.click();
        museumCollection.findBy(Condition.text(museumTitle)).shouldBe(Condition.visible);
        return this;
    }

    @Step("open museum information on museum page")
    public MuseumPage openMuseumInfo(String museumTitle) {
        $(String.format("img[alt='%s']", museumTitle)).click();
        return this;
    }

    @Step("click on edit museum button")
    public MuseumPage clickOnUpdateButton() {
        editButton.click();
        return this;
    }

    @Step("check museum information contains expected fields")
    public MuseumPage checkMuseumInfoContainsExpectedFields(MuseumDto museumDto, String country) {
        museumInfoHeader.shouldHave(Condition.text(museumDto.getTitle()));
        museumInfoCountry.shouldHave(Condition.text(country));
        $("div").shouldHave(Condition.text(museumDto.getDescription()));
        return this;
    }


    @Step("click museum tab")
    public MuseumPage clickMuseumTab() {
        museumTab.click();

        return this;
    }

    @Step("user exit from application")
    public MuseumPage closeBrowser() {
        Selenide.closeWebDriver();
        return this;
    }

    @Override public MuseumPage waitForPageLoaded() {
        createMuseum.shouldBe(Condition.visible);
        return this;
    }
    public MuseumPage waitForEditPageLoaded() {
        editHeader.shouldBe(Condition.visible);
        return this;
    }
}
