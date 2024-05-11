package rococo.config;

import com.codeborne.selenide.Configuration;

public class DockerConfig implements Config {

    static final DockerConfig instance = new DockerConfig();

    private DockerConfig() {
    }

    static {
        Configuration.remote = "http://localhost:4444/wd/hub";
        Configuration.browser = "chrome";
    }

    @Override
    public String frontUrl() {
        return "";
    }

    @Override
    public String authUrl() {
        return "";
    }

    @Override
    public String jdbcHost() {
        return "";
    }
}
