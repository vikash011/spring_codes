package com.nit;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import com.nit.service.ILoginMgmtService;

@SpringBootApplication
public class JdbcProj03BootSimpleJdbcCallApplication {

	@Autowired
	private DataSource ds;// injecting DataSource

	// creating SimpleJdbcCall object
	@Bean("sjc")
	public SimpleJdbcCall createSimpleJC() {

		return new SimpleJdbcCall(ds);
	}

	public static void main(String[] args) {

		System.out.println("IOC started");
//		creating IOC container
		ApplicationContext ctx = SpringApplication.run(JdbcProj03BootSimpleJdbcCallApplication.class, args);

//		creating object for service class
		ILoginMgmtService service = ctx.getBean("loginservice", ILoginMgmtService.class);

//		invoke method
		System.out.println(service.login("raja", "raja123"));

		System.out.println("IOC closed");
//		close IOC
		((AbstractApplicationContext) ctx).close();

	}

}
