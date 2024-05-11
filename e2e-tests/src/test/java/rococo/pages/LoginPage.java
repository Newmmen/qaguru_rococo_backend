package rococo.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage extends BasePage<LoginPage> {
    public static final String URL = CFG.frontUrl();

    private final SelenideElement inputUsername = $("input[name='username']");
    private final SelenideElement inputPassword = $("input[name='password']");
    private final SelenideElement inputPasswordSubmit = $("input[name='passwordSubmit']");
    private final SelenideElement submitButton = $("button[type='submit']");
    private final SelenideElement formSubmitButton = $("a[class='form__submit']");
    private final SelenideElement badCredentialLabel = $(byTagAndText("p", "Bad credentials"));


    @Step("Do login with data")
    public MainPage doUiLoginWithData(String username, String password) {
        inputUsername.setValue(username);
        inputPassword.setValue(password);
        submitButton.click();
        return new MainPage();
    }

    @Step("check bad credentials error is visible")
    public void checkBadCredentialErrorVisible() {
        badCredentialLabel.shouldBe(Condition.visible);
    }

    @Step("click sigh up button")
    public LoginPage clickSignUpButton() {
        $("a[href='/register']").click();
        return this;
    }

    @Step("click enter button")
    public LoginPage clickEnterButton() {
        $(byText("Войти")).click();
        return this;
    }

    @Step("click form submit button")
    public LoginPage clickFormSubmitButton() {
        formSubmitButton.click();
        return this;
    }

    @Step("do sigh up with data")
    public LoginPage doSignUpWithData(String username, String password) {
        inputUsername.setValue(username);
        inputPassword.setValue(password);
        inputPasswordSubmit.setValue(password);
        submitButton.click();
        return this;
    }

    @Override public LoginPage waitForPageLoaded() {
        return null;
    }
}
