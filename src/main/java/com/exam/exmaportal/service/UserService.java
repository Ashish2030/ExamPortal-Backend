package com.exam.exmaportal.service;

import com.exam.exmaportal.modal.Role;
import com.exam.exmaportal.modal.User;
import com.exam.exmaportal.modal.User_Roles;
import com.exam.exmaportal.repository.RoleRepository;
import com.exam.exmaportal.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserService
{
    @Autowired
     private UserRepository userrepository;
    @Autowired
     public RoleRepository roleRepository;

    public User createUser(User user, Set<User_Roles>user_roles) throws Exception
    {

        User local=this.userrepository.findByUsername(user.getUsername());

        if(local!=null)
        {
            System.out.println("User is Already Present");
            throw new Exception("User Already Present!!!");
        }
        else
        {
            for(User_Roles ur:user_roles)
            {
                roleRepository.save(ur.getRole());
            }
            System.out.println(user.getUserrole());
            user.getUserrole().addAll(user_roles);

            System.out.println(user+"lll");

            local=this.userrepository.save(user);
            System.out.println("Service");

        }
        return local;


    }

}
