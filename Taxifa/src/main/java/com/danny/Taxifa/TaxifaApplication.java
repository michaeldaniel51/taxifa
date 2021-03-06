package com.danny.taxifa;

import com.danny.taxifa.entities.User;
import com.danny.taxifa.repositories.UserRepository;
import com.danny.taxifa.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class TaxifaApplication {


	public static void main(String[] args) {
		SpringApplication.run(TaxifaApplication.class, args);
	}





}
