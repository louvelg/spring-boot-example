package com.akelio.speed.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import com.akelio.speed.entity.User;


@Repository
public class UserDAO extends BaseDAOJDBC {

	private static final long	serialVersionUID	= 4511106838473055708L;

	public User findUserById(String id) {
		logger.info("test");
		return (User) jdbcTemplate
				.queryForObject(
						"select u.user_id,u.tenant_id, u.locale, u.time_zone, u.time_format, u.date_format, u.date_long_format ,login ,password, default_space ,first_name ,last_name ,email ,company ,job_title ,department ,division ,im_login ,phone1 ,phone2 ,website ,fax ,adr1 ,adr2 ,postal ,city ,country ,comments ,skills ,interests ,date_created ,date_updated ,enable ,manage_user ,admin ,invited ,photo_path, profile, twitter, facebook, linkedin, viadeo, skype from user as u where u.user_id=? and date_deleted is null",
						new Object[] { id }, new UserMapper());
	}
	
	
	private static final class UserMapper implements RowMapper<User> {
		public User mapRow(ResultSet rs, int rowNum) throws SQLException {
			User user = new User();
			user.setUserId(rs.getLong("user_id"));
			user.setLogin(rs.getString("login"));
			user.setPassword(rs.getString("password"));
			user.setFirstName(rs.getString("first_name"));
			user.setLastName(rs.getString("last_name"));
			return user;
		}
	}
}
