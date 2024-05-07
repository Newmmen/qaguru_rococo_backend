package rococo.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class MainPage extends BasePage<MainPage> {
    public static final String URL = CFG.frontUrl();

    private final SelenideElement avatarImage =   $(".avatar-initials");



    @Step("open friends page")
    public MainPage checkAvatarPicture() {
        avatarImage.shouldBe(visible);
        return this;
    }

    @Step("Check friend has income request sign")
    public MainPage checkRequestSign() {
        $("a[href='/friends']")
                .$(".header__sign").shouldBe(visible);
        return this;
    }

    @Step("")
    public MainPage clickEnter() {
        $(byText("Войти")).click();
        return this;
    }

    @Override public MainPage waitForPageLoaded() {
        avatarImage.shouldBe(visible);
        return this;
    }
}