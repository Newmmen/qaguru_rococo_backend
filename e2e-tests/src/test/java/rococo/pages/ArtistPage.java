package rococo.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openapitools.client.model.ArtistDto;

import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ArtistPage extends BasePage<ArtistPage> {

    private final SelenideElement createArtistTab = $(byText("Добавить художника"));
    private final SelenideElement artistTab = $("a[href='/artist']");
    private final SelenideElement artistFilterInput = $("input[title='Искать художников...']");
    private final SelenideElement artistInfoHeader = $("header[class='card-header text-center font-bold text-2xl']");
    private final SelenideElement artistBiograthy = $("p[class='col-span-2 w-4/5 m-2']");
    private final SelenideElement iconSearch = $("img[alt='Иконка поиска']");
    private final SelenideElement editButton = $("button[data-testid='edit-artist']");
    private final SelenideElement submitButton = $("button[type='submit']");
    private final SelenideElement addPaintingInArtistButton = $(byTagAndText("button", "Добавить картину"));
    private final ElementsCollection artistCollection = $$("div[class='w-100']");

    public static final String URL = CFG.frontUrl() + "/artist";


    @Step("fill artist fields with data")
    public ArtistPage fillArtistFieldsWithData(ArtistDto artistDto) {
        $("input[name='name']").setValue(artistDto.getName());
        $("textarea[name='biography']").setValue(artistDto.getBiography());
        $("input[name='photo']").uploadFromClasspath(artistDto.getPhoto());
        return this;
    }

    @Step("open artist information on artist page")
    public ArtistPage openArtistInfo() {
        $("[data-testid='avatar'] img").click();
        return this;
    }

    @Step("click submit button")
    public ArtistPage clickSubmitButton() {
        submitButton.click();
        return this;
    }

    @Step("click create artist tab")
    public ArtistPage clickCreateArtistTab() {
        createArtistTab.click();
        return this;
    }

    @Step("click on update button")
    public ArtistPage clickOnEditButton() {
        editButton.click();
        return this;
    }

    @Step("find artist on artist page")
    public ArtistPage findArtistOnArtistPage(String artistName) {
        artistTab.click();
        artistFilterInput.setValue(artistName);
        iconSearch.click();
        artistCollection.findBy(Condition.text(artistName)).shouldBe(Condition.visible);
        return this;
    }

    @Step("check artist information contains expected fields")
    public ArtistPage checkArtistInfoContainsExpectedFields(ArtistDto artistDto) {
        artistInfoHeader.shouldHave(Condition.text(artistDto.getName()));
        artistBiograthy.shouldHave(Condition.text(artistDto.getBiography()));
        return this;
    }

    @Step("click add painting into artist")
    public PaintingPage clickAddPaintingIntoArtist() {
        addPaintingInArtistButton.click();
        return new PaintingPage();
    }

    @Override public ArtistPage waitForPageLoaded() {
        createArtistTab.shouldBe(Condition.visible);
        return this;
    }
}
