package com.exam.exmaportal.modal;
import lombok.*;

import javax.persistence.*;
import java.util.*;

@Entity
public class Role
{
    @Id
    private Long roleId;
    private String roleName;

    public Role() {

    }

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "role")
    private Set<User_Roles> user_roles=new HashSet<>();


    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Set<User_Roles> getUser_roles() {
        return user_roles;
    }

    public void setUser_roles(Set<User_Roles> user_roles) {
        this.user_roles = user_roles;
    }


}
