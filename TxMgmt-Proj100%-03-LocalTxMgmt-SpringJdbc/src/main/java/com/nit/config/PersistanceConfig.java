package com.nit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan(basePackages = "com.nit.dao")
public class PersistanceConfig {

	@Bean("hkds")
	public HikariDataSource createHikariCPDS() {

		HikariDataSource ds = new HikariDataSource();
		ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		ds.setJdbcUrl("jdbc:oracle:thin:@localhost:1522:ORCL");
		ds.setUsername("hr");
		ds.setPassword("hr");

		return ds;
	}

	@Bean("jt")
	public JdbcTemplate createJTemplate() {
		return new JdbcTemplate(createHikariCPDS());
	}

}
