package rococo.pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    @Step("open friends page")
    public MainPage checkAvatarPicture() {
        $(".avatar-initials").shouldBe(visible);
        return this;
    }

    @Step("Check friend has income request sign")
    public MainPage checkRequestSign() {
        $("a[href='/friends']")
                .$(".header__sign").shouldBe(visible);
        return this;
    }
}