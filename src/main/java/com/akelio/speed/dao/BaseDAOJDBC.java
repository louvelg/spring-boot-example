package com.akelio.speed.dao;

import java.io.Serializable;
import javax.sql.DataSource;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class BaseDAOJDBC implements Serializable {
	private static final long	serialVersionUID	= 6534384759120454004L;
	protected JdbcTemplate		jdbcTemplate;
	protected static final Logger	logger	= Logger.getLogger(BaseDAOJDBC.class);

	public BaseDAOJDBC() {
	}

	@Autowired
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

}
