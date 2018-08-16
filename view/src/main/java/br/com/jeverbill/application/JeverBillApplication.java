package br.com.jeverbill.application;

import java.util.Locale;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.FixedLocaleResolver;


@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@EnableJpaRepositories({ "br.com.repository" })
@EntityScan({ "br.com.domain" })
@ComponentScan(basePackages= {"br.com.jeverbill.controller", "br.com.jeverbill.converters", "br.com.jeverbill.validators"})
public class JeverBillApplication {
	public static void main(String[] args) {
		SpringApplication.run(JeverBillApplication.class);
	}
	
	@Bean
	public LocaleResolver localeResolver() {
		return new FixedLocaleResolver(new Locale("pt", "BR"));
	}
	
	@Bean
	public ModelMapper modelMapper() {
	    return new ModelMapper();
	}
}
