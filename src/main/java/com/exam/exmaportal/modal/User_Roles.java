package com.exam.exmaportal.modal;


import lombok.*;

import javax.persistence.*;

@Entity
public class User_Roles
{
    public User_Roles()
    {

    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userRoleId;
    @ManyToOne(fetch=FetchType.EAGER)
    private User user;
    @ManyToOne
    private Role role;

    public Long getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(Long userRoleId) {
        this.userRoleId = userRoleId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }


}
