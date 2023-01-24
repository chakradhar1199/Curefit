package com.chakri.curefit.repositories;

import com.chakri.curefit.models.Users;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {
}
