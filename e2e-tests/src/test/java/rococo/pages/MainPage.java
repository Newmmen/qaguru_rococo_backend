package rococo.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class MainPage extends BasePage<MainPage> {
    public static final String URL = CFG.frontUrl();

    private final SelenideElement usernameInput = $("input[name='firstname']");
    private final SelenideElement surnameInput = $("input[name='surname']");
    private final SelenideElement avatarImage = $(".avatar-initials");
    private final SelenideElement toastElement = $(byTagAndText("div", "Профиль обновлен"));


    @Step("open friends page")
    public MainPage checkAvatarPicture() {
        avatarImage.shouldBe(visible);
        return this;
    }

    @Step("fill user with data")
    public MainPage fillUserWithData(String firstName, String surname) {
        usernameInput.setValue(firstName);
        surnameInput.setValue(surname);
        return this;
    }

    @Step("click avatar")
    public MainPage clickAvatarPic() {
        avatarImage.click();
        return this;
    }

    @Step("click submitButton")
    public MainPage clickSubmitButton() {
        $("button[type='submit']").click();
        return this;
    }

    @Step("check toast element visible")
    public void checkModalItemVisible() {
        toastElement.shouldBe(visible);
    }


    @Override public MainPage waitForPageLoaded() {
        avatarImage.shouldBe(visible);
        return this;
    }
}