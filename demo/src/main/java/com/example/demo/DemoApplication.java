package com.example.demo;

import com.example.demo.persistence.repositories.AdminRepository;
import com.example.demo.persistence.repositories.CustomerRepository;
import com.example.demo.persistence.repositories.SaleRepository;
import com.example.demo.persistence.utilities.ProductGateway;
import com.example.demo.services.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.io.IOException;

@SpringBootApplication
public class DemoApplication {

	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private AdminRepository adminRepository;
	//private static ProductGateway productGateway;
	@Autowired
	private SaleRepository saleRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		productGateway  = new ProductGateway();
//		try {
//			productGateway.loadProducts();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurerAdapter() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**")
						.allowedOrigins("*")
						.allowedMethods("GET", "POST", "PUT", "DELETE", "HEAD")
						.allowedHeaders("header1", "header2") //What is this for?
						.allowCredentials(true);
			}
		};
	}
}