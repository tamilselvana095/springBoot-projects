package com.angular.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.angular.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
