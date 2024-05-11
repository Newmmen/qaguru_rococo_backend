package rococo.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openapitools.client.model.PaintingDto;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class PaintingPage extends BasePage<PaintingPage> {

    public static final String URL = CFG.frontUrl() + "/painting";

    private final SelenideElement createPainting = $(byText("Добавить картину"));
    private final SelenideElement artistTab = $("a[href='/painting']");
    private final SelenideElement paintingTab = $("a[href='/painting']");
    private final SelenideElement paintingFilterInput = $("input[title='Искать картины...']");
    private final SelenideElement iconSearch = $("img[alt='Иконка поиска']");
    private final SelenideElement submitButton = $("button[type='submit']");
    private final ElementsCollection paintingCollection = $$("div[class='w-100']");


    @Step("fill painting with data")
    public PaintingPage fillPaintingWithData(PaintingDto paintingDto) {
        $("input[name='title']").setValue(paintingDto.getTitle());
        $("textarea[name='description']").setValue(paintingDto.getDescription());
        $("input[name='content']").uploadFromClasspath(paintingDto.getContent());
        $$("select[name='museumId']").first().click();
        $$("select[name='authorId']").first().click();
        return this;
    }

    @Step("fill painting with data into artist")
    public PaintingPage fillPaintingWithDataIntoArtist(PaintingDto paintingDto) {
        $("input[name='title']").setValue(paintingDto.getTitle());
        $("textarea[name='description']").setValue(paintingDto.getDescription());
        $("input[name='content']").uploadFromClasspath(paintingDto.getContent());
        $$("select[name='museumId']").first().click();
        return this;
    }

    @Step("find painting on painting page")
    public PaintingPage findPaintingOnPaintingPage(String paintingTitle) {
        paintingTab.click();
        paintingFilterInput.setValue(paintingTitle);
        iconSearch.click();
        paintingCollection.findBy(Condition.text(paintingTitle)).shouldBe(Condition.visible);
        return this;
    }

    @Step("check painting into artist is visible")
    public PaintingPage checkPaintingIntoArtistPageIsVisible(String paintingTitle) {
        paintingCollection.findBy(Condition.text(paintingTitle)).shouldBe(Condition.visible);
        return this;
    }

    @Step("click create painting")
    public PaintingPage clickCreatePainting() {
        createPainting.click();
        return this;
    }

    @Step("click submit button")
    public PaintingPage clickSubmitButton() {
        submitButton.click();
        return this;
    }

    @Override public PaintingPage waitForPageLoaded() {
        createPainting.shouldBe(Condition.visible);
        return this;
    }
}
