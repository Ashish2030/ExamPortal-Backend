package com.exam.exmaportal.repository;

import com.exam.exmaportal.modal.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long >
{


}
