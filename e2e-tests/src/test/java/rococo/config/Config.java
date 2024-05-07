package rococo.config;

public interface Config {

  static Config getInstance() {
    return "docker".equals(System.getProperty("test.env"))
        ? DockerConfig.instance
        : LocalConfig.instance;
  }

  String frontUrl();

  String authUrl();

  String jdbcHost();

  default String jdbcUser() {
    return "admin";
  }

  default String jdbcPassword() {
    return "admin";
  }

  default int jdbcPort() {
    return 3306;
  }
}
