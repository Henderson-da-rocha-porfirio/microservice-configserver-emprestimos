package com.tuyo.loans;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.boot.autoconfigure.domain.*;
import org.springframework.context.annotation.*;
import org.springframework.data.jpa.repository.config.*;

@SpringBootApplication
@ComponentScans({ @ComponentScan("com.tuyo.loans.controller") })
@EnableJpaRepositories("com.tuyo.loans.repository")
@EntityScan("com.tuyo.loans.model")
public class LoansConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoansConfigServerApplication.class, args);
	}

}
