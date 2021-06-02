package com.nit.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class AopConfig {

	@Autowired
	private DataSource ds;

	@Bean("dsTxMgmr")
	public DataSourceTransactionManager createDSTxMgmr() {

		DataSourceTransactionManager dsTxMgmr = new DataSourceTransactionManager(ds);
		
		return dsTxMgmr;
	}

}
