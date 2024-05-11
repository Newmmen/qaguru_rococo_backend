package rococo.db.sjdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

import org.springframework.jdbc.core.RowMapper;
import rococo.db.model.UserEntity;


public class UserAuthEntityRowMapper implements RowMapper<UserEntity> {

  public static final UserAuthEntityRowMapper instance = new UserAuthEntityRowMapper();

  @Override
  public UserEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
    UserEntity user = new UserEntity();
    user.setId(rs.getObject(1, UUID.class));
    user.setUsername(rs.getString(2));
    user.setPassword(rs.getString(3));
    user.setEnabled(rs.getBoolean(4));


    return user;
  }
}
