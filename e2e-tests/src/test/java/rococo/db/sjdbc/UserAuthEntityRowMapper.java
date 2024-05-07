package rococo.db.sjdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

import org.springframework.jdbc.core.RowMapper;
import rococo.db.model.Authority;
import rococo.db.model.AuthorityEntity;
import rococo.db.model.UserAuthEntity;


public class UserAuthEntityRowMapper implements RowMapper<UserAuthEntity> {

  public static final UserAuthEntityRowMapper instance = new UserAuthEntityRowMapper();

  @Override
  public UserAuthEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
    UserAuthEntity user = new UserAuthEntity();
    user.setId(rs.getObject(1, UUID.class));
    user.setUsername(rs.getString(2));
    user.setPassword(rs.getString(3));
    user.setEnabled(rs.getBoolean(4));
    user.setAccountNonExpired(rs.getBoolean(5));
    user.setAccountNonLocked(rs.getBoolean(6));
    user.setCredentialsNonExpired(rs.getBoolean(7));
    //??
    AuthorityEntity authority = new AuthorityEntity();
    authority.setId(rs.getObject(8, UUID.class));
    authority.setAuthority(Authority.valueOf(rs.getString(10)));
    user.getAuthorities().add(authority);

    return user;
  }
}
