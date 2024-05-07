package rococo.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import rococo.config.Config;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public abstract class BasePage <T extends BasePage> {

    protected static final Config CFG = Config.getInstance();

    protected final SelenideElement toaster = $(".Toastify__toast-body");

    public abstract T waitForPageLoaded();

}
