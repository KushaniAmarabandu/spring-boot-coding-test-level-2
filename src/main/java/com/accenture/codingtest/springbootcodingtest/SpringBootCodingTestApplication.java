package com.accenture.codingtest.springbootcodingtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@EnableJpaRepositories("com.accenture.codingtest.springbootcodingtest.repository")
@EnableWebSecurity
@EnableGlobalMethodSecurity(
    prePostEnabled = false, securedEnabled = false, jsr250Enabled = true
)
public class SpringBootCodingTestApplication extends WebSecurityConfigurerAdapter {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCodingTestApplication.class, args);
	}

}
