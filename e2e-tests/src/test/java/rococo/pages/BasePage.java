package rococo.pages;

import rococo.config.Config;

public abstract class BasePage<T extends BasePage> {

    protected static final Config CFG = Config.getInstance();

    public abstract T waitForPageLoaded();

}
