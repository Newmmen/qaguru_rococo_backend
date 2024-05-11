package rococo.db.sjdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import rococo.db.model.UserEntity;


public class UserAuthEntityResultSetExtractor implements ResultSetExtractor<UserEntity> {

  public static final UserAuthEntityResultSetExtractor instance = new UserAuthEntityResultSetExtractor();

  @Override
  public UserEntity extractData(ResultSet rs) throws SQLException, DataAccessException {
    UserEntity user = new UserEntity();
    boolean userProcessed = false;
    while (rs.next()) {
      if (!userProcessed) {
        user.setId(rs.getObject(1, UUID.class));
        user.setUsername(rs.getString(2));
        user.setPassword(rs.getString(3));
        user.setEnabled(rs.getBoolean(4));
        userProcessed = true;
      }
    }
    return user;
  }
}
