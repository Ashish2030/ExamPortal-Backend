package com.exam.exmaportal.service;

import com.exam.exmaportal.modal.Role;
import com.exam.exmaportal.modal.User;
import com.exam.exmaportal.modal.User_Roles;
import com.exam.exmaportal.repository.RoleRepository;
import com.exam.exmaportal.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

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
            for(User_Roles ur:user_roles) {
                roleRepository.save(ur.getRole());

                user.getUserrole().addAll(user_roles);

                local = this.userrepository.save(user);
            }

        }
        return local;
    }
    public User getValue(String username)
    {
        return this.userrepository.findByUsername(username);
    }
    public void Delete(Long id)
    {
        this.userrepository.deleteById(id);

    }

}
