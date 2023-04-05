package com.example.multithreadinglists.repository;

import com.example.multithreadinglists.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
