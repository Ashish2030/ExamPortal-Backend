package com.exam.exmaportal.modal;


import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Getter
@Setter
@Data
@NoArgsConstructor
public class User_Roles
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userRoleId;
    @ManyToOne
    private User user;
    @ManyToOne
    private Role role;
}
