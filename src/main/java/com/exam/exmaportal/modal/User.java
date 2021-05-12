package com.exam.exmaportal.modal;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@Data
@NoArgsConstructor
@Table(name="users")
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique = true)
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    @Column(unique = true)
    private String email;  
    @Column(unique = true)
    private String phone;
    private boolean enable=true;
    private String profile;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "user")
    private Set<User_Roles> userrole=new HashSet<>();
}
