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
public class ExmaportalApplication implements CommandLineRunner
{
@Autowired
public UserService userService;
	public static void main(String[] args)
	{
		SpringApplication.run(ExmaportalApplication.class, args);
	}
	public void run(String... args) throws Exception
	{
        System.out.println("Start Running");
		//User
		User user12=new User();
		user12.setId(1L);
		user12.setFirstName("Ashish");
		user12.setLastName("Kumar");
		user12.setUsername("ashish2030");
		user12.setPassword("Chitkara@123");
		user12.setEmail("ashishkumar.cse18@chitkarauniversity.edu.in");
		user12.setProfile("default.png");
		user12.setPhone("8092958000");
		user12.setEnable(true);

        //Role
		Role role1=new Role();
		role1.setRoleId(44L);
		role1.setRoleName("ADMIN");

		//UserRole
		Set<User_Roles> userRolesSet=new HashSet<>();

		//User_Roles
		User_Roles userroles=new User_Roles();

		userroles.setUserRoleId(12L);
		userroles.setUser(user12);
		userroles.setRole(role1);

		userRolesSet.add(userroles);

		User user=this.userService.createUser(user12,userRolesSet);

		System.out.println(user.getUsername());

	}

}
