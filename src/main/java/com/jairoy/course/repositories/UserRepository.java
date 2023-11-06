package com.jairoy.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jairoy.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {	

}
