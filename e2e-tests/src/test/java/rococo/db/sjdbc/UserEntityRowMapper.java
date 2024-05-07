package rococo.db.sjdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

import org.springframework.jdbc.core.RowMapper;
import rococo.db.model.CurrencyValues;
import rococo.db.model.UserEntity;


public class UserEntityRowMapper implements RowMapper<UserEntity> {

  public static final UserEntityRowMapper instance = new UserEntityRowMapper();

  @Override
  public UserEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
    UserEntity user = new UserEntity();
    user.setId(rs.getObject("id", UUID.class));
    user.setUsername(rs.getString("username"));
    user.setCurrency(CurrencyValues.valueOf(rs.getString("currency")));
    user.setFirstname(rs.getString("firstname"));
    user.setSurname(rs.getString("surname"));
    user.setPhoto(rs.getBytes("photo"));
    return user;
  }
}
