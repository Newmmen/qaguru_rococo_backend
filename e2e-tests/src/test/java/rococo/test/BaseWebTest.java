package rococo.test;

import rococo.config.Config;
import rococo.jupiter.BrowserExtension;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith({BrowserExtension.class})
public abstract class BaseWebTest {
    protected static final Config CFG = Config.getInstance();

}
