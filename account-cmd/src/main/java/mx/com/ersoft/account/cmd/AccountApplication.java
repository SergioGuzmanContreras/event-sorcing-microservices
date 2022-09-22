package mx.com.ersoft.account.cmd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"mx.com.ersoft"})
public class AccountApplication {


	public static void main(String [] args) {
		SpringApplication.run(AccountApplication.class, args);
	}

}