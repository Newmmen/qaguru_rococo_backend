package rococo.pages;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage extends BasePage<LoginPage> {
    public static final String URL = CFG.frontUrl();



    @Step("Do login with data")
    public LoginPage doUiLoginWithData(String username, String password) {
        Selenide.open("http://127.0.0.1:3000");
        $(byText("Войти")).click();
        $("input[name='username']").setValue(username);
        $("input[name='password']").setValue(password);
        $("button[type='submit']").click();
        return this;
    }

    @Step("Do login with data")
    public LoginPage doApiLoginWithData(String username, String password) {
        $("a[href*='redirect']").click();
        $("input[name='username']").setValue(username);
        $("input[name='password']").setValue(password);
        $("button[type='submit']").click();
        return this;
    }

    @Step("user exit from application")
    public LoginPage closeBrowser() {
        Selenide.closeWebDriver();
        return this;
    }

    @Override public LoginPage waitForPageLoaded() {
        return null;
    }
}
