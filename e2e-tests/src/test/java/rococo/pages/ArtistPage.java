package rococo.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ArtistPage extends BasePage<ArtistPage> {

    private final SelenideElement createArtistTab =  $(byText("Добавить художника"));
    private final SelenideElement artistTab =   $("a[href='/artist']");

    public static final String URL = CFG.frontUrl() + "/artist";



    @Step("")
    public ArtistPage createArtist(org.openapitools.client.model.ArtistDto artistDto) {
        createArtistTab.click();
        $("input[name='name']").setValue(artistDto.getName());
        $("textarea[name='biography']").setValue(artistDto.getBiography());
        $("input[name='photo']").uploadFromClasspath(artistDto.getPhoto());
        $("button[type='submit']").click();
        return this;
    }

    @Step("")
    public ArtistPage clickArtistTab() {
        artistTab.click();

        return this;
    }

    @Step("user exit from application")
    public ArtistPage closeBrowser() {
        Selenide.closeWebDriver();
        return this;
    }

    @Override public ArtistPage waitForPageLoaded() {
        createArtistTab.shouldBe(Condition.visible);
        return  this;
    }
}
