package rococo.db;

import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import rococo.config.Config;

@RequiredArgsConstructor
public enum Database {
    AUTH("jdbc:mysql://%s:%d/auth"),
    GETAWAY("jdbc:mysql://%s:%d/rococo");

    private final String url;

    private static final Config cfg = Config.getInstance();

    public String getUrl() {
        return String.format(
                url,
                cfg.jdbcHost(),
                cfg.jdbcPort()
        );
    }

    public String p6spyUrl() {
        return "jdbc:p6spy:" + StringUtils.substringAfter(getUrl(), "jdbc:");
    }
}
