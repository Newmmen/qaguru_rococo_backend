package rococo.db;

import javax.sql.DataSource;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.p6spy.engine.spy.P6DataSource;
import org.postgresql.ds.PGSimpleDataSource;
import rococo.config.Config;

public enum DataSourceProvider {
  INSTANCE;

  private static final Config cfg = Config.getInstance();

  private final Map<Database, DataSource> store = new ConcurrentHashMap<>();

  public DataSource dataSource(Database database) {
    return store.computeIfAbsent(database, k -> {
      PGSimpleDataSource ds = new PGSimpleDataSource();
      ds.setURL(k.getUrl());
      ds.setUser(cfg.jdbcUser());
      ds.setPassword(cfg.jdbcPassword());
      return new P6DataSource(ds);
    });
  }
}
