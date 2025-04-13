package com.em.auth;

import com.em.config.AppConfiguration;
import com.em.config.IConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;

/* TODO: Implement JWT token handling
 * https://www.baeldung.com/spring-security-oauth-jwt
 */

@SpringBootApplication
@Import(AppConfiguration.class)
public class AuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthApplication.class, args);

		ApplicationContext ctxt = new AnnotationConfigApplicationContext(AuthApplication.class);

		/* Token values loaded
		 * from applicationcontext.xml file
		 */
		Token tk01 = (Token) ctxt.getBean("token-01");
		Token tk02 = (Token) ctxt.getBean("token-02");

		/* Values taken from
		 * Config class
		 * via @Component annotation
		 */
		IConfig authConfigValue = (IConfig) ctxt.getBean("fileConfig");
		IConfig fileConfigValue = (IConfig) ctxt.getBean("authConfig");

		System.out.printf(
				"%s\n%s\n%s\n%s",
				tk01.getValue(),
				tk02.getValue(),
				authConfigValue.getValue(),
				fileConfigValue.getValue()
		);
	}

}
