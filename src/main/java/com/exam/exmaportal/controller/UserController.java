package com.exam.exmaportal.controller;

import com.exam.exmaportal.modal.Role;
import com.exam.exmaportal.modal.User;
import com.exam.exmaportal.modal.User_Roles;
import com.exam.exmaportal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/user")
public class UserController
{
    @Autowired
    private UserService userService;
    @PostMapping("/")
    public User createUser(@RequestBody User user)throws Exception
    {
        System.out.println(user);
        Set<User_Roles> userRolesSet=new HashSet<>();

        Role role=new Role();
        role.setRoleId(12L);
        role.setRoleName("Normal");
        User_Roles userRoles=new User_Roles();
        userRoles.setUser(user);
        userRoles.setRole(role);
        userRolesSet.add(userRoles);
        return this.userService.createUser(user,userRolesSet);
    }
    @GetMapping("/{username}")
    public User getValue(@PathVariable("username")String username)
    {
        return this.userService.getValue(username);

    }
    @DeleteMapping("/userId")
    public void Delete(@PathVariable("userId")Long id)
    {
        this.userService.Delete(id);

    }

}
