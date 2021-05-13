package com.exam.exmaportal;

import com.exam.exmaportal.modal.Role;
import com.exam.exmaportal.modal.User;
import com.exam.exmaportal.modal.User_Roles;
import com.exam.exmaportal.repository.UserRepository;
import com.exam.exmaportal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class ExmaportalApplication
{
@Autowired
public UserService userService;
	public static void main(String[] args)
	{
		SpringApplication.run(ExmaportalApplication.class, args);
	}


}
